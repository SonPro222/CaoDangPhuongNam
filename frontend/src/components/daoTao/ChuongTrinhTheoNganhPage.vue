<template>
  <DaoTaoPageShell
      :title="pageTitle"
      :description="pageDescription"
  >
    <template #breadcrumb>
      <RouterLink :to="{ name: 'dao-tao-nganh' }">Ngành</RouterLink>
      <span v-if="nganhId"> / {{ nganh?.tenNganh || `Ngành ID ${nganhId}` }}</span>
      <span> / Chương trình</span>
    </template>

    <template #actions>
      <RouterLink class="nav-btn" :to="{ name: 'dao-tao-trinh-do' }">Trình độ</RouterLink>
      <RouterLink class="nav-btn" :to="{ name: 'dao-tao-loai-chuong-trinh' }">Loại chương trình</RouterLink>
    </template>

    <div v-if="nganhId" class="parent-card">
      <div>
        <b>Đang lọc theo ngành:</b>
        <span>{{ nganh?.tenNganh || '-' }}</span>
      </div>
      <div>
        <b>Mã ngành:</b>
        <span>{{ nganh?.maNganh || '-' }}</span>
      </div>
    </div>

    <DaoTaoCrudTable
        v-model:keyword="keyword"
        :columns="columns"
        :items="filteredItems"
        :loading="loading"
        :error="error"
        @reload="fetchItems"
        @create="openCreate"
        @edit="openEdit"
        @remove="removeItem"
        @view="goDetail"
    >
      <template #cell-nganhId="{ item }">
        {{ getNameById(nganhOptions, item.nganhId, 'tenNganh') }}
      </template>

      <template #cell-trinhDoId="{ item }">
        {{ getNameById(trinhDoOptions, item.trinhDoId, 'tenTrinhDo') }}
      </template>

      <template #cell-loaiChuongTrinhId="{ item }">
        {{ getNameById(loaiChuongTrinhOptions, item.loaiChuongTrinhId, 'tenLoai') }}
      </template>

      <template #row-actions="{ item }">
        <button class="link-btn" type="button" @click="goVersion(item)">Phiên bản</button>
      </template>
    </DaoTaoCrudTable>

    <DaoTaoFormModal v-model="showForm" :title="formTitle" :saving="saving" @submit="saveItem">
      <div class="field" v-if="!nganhId">
        <label>Ngành</label>
        <select v-model.number="form.nganhId" required>
          <option disabled value="">Chọn ngành</option>
          <option v-for="item in nganhOptions" :key="item.id" :value="item.id">
            {{ item.maNganh }} - {{ item.tenNganh }}
          </option>
        </select>
      </div>

      <div class="field">
        <label>Trình độ</label>
        <select v-model.number="form.trinhDoId" required>
          <option disabled value="">Chọn trình độ</option>
          <option v-for="item in trinhDoOptions" :key="item.id" :value="item.id">
            {{ item.maTrinhDo }} - {{ item.tenTrinhDo }}
          </option>
        </select>
      </div>

      <div class="field">
        <label>Loại chương trình</label>
        <select v-model.number="form.loaiChuongTrinhId" required>
          <option disabled value="">Chọn loại chương trình</option>
          <option v-for="item in loaiChuongTrinhOptions" :key="item.id" :value="item.id">
            {{ item.maLoai }} - {{ item.tenLoai }}
          </option>
        </select>
      </div>

      <div class="field">
        <label>Mã chương trình</label>
        <input v-model.trim="form.maChuongTrinh" required />
      </div>

      <div class="field">
        <label>Tên chương trình</label>
        <input v-model.trim="form.tenChuongTrinh" required />
      </div>

      <div class="field">
        <label>Thời gian đào tạo</label>
        <input v-model.trim="form.thoiGianDaoTao" />
      </div>

      <div class="field full">
        <label>Đối tượng tuyển sinh</label>
        <textarea v-model.trim="form.doiTuongTuyenSinh" />
      </div>
    </DaoTaoFormModal>
  </DaoTaoPageShell>
</template>

<script setup>
import { computed, onMounted, reactive, ref, watch } from 'vue';
import { useRoute, useRouter } from 'vue-router';
import DaoTaoPageShell from './shared/DaoTaoPageShell.vue';
import DaoTaoCrudTable from './shared/DaoTaoCrudTable.vue';
import DaoTaoFormModal from './shared/DaoTaoFormModal.vue';
import { getAllNganh, getNganhById } from '@/api/daoTao/ApiRespone/NganhController';
import { getAllTrinhDoDaoTao } from '@/api/daoTao/ApiRespone/TrinhDoDaoTaoController';
import { getAllLoaiChuongTrinh } from '@/api/daoTao/ApiRespone/LoaiChuongTrinhController';
import { getAllChuongTrinh } from '@/api/chuongTrinh/ApiRespone/ChuongTrinhController';
import { createChuongTrinh, updateChuongTrinh, deleteChuongTrinh } from '@/api/chuongTrinh/ApiRequest/ChuongTrinhController';
import { getErrorMessage, matchKeyword, unwrapApiData, unwrapApiList } from '@/api/apiResponse.js';

const route = useRoute();
const router = useRouter();

const items = ref([]);
const nganh = ref(null);
const nganhOptions = ref([]);
const trinhDoOptions = ref([]);
const loaiChuongTrinhOptions = ref([]);
const keyword = ref('');
const loading = ref(false);
const saving = ref(false);
const error = ref('');
const showForm = ref(false);
const editingId = ref(null);

const nganhId = computed(() => route.params.nganhId ? Number(route.params.nganhId) : null);

const form = reactive({
  nganhId: '',
  trinhDoId: '',
  loaiChuongTrinhId: '',
  maChuongTrinh: '',
  tenChuongTrinh: '',
  doiTuongTuyenSinh: '',
  thoiGianDaoTao: '',
});

const columns = [
  { key: 'id', label: 'ID' },
  { key: 'nganhId', label: 'Ngành' },
  { key: 'trinhDoId', label: 'Trình độ' },
  { key: 'loaiChuongTrinhId', label: 'Loại chương trình' },
  { key: 'maChuongTrinh', label: 'Mã chương trình' },
  { key: 'tenChuongTrinh', label: 'Tên chương trình' },
  { key: 'doiTuongTuyenSinh', label: 'Đối tượng tuyển sinh' },
  { key: 'thoiGianDaoTao', label: 'Thời gian đào tạo' },
];

const pageTitle = computed(() => nganhId.value ? 'Chương trình theo ngành' : 'Chương trình đào tạo');
const pageDescription = computed(() => nganhId.value
    ? 'Load chương trình theo ngành đang chọn.'
    : 'Danh sách chương trình đào tạo.');
const formTitle = computed(() => editingId.value ? 'Cập nhật chương trình' : 'Thêm chương trình');

const filteredItems = computed(() => {
  return items.value.filter((item) => {
    const matchedParent = !nganhId.value || Number(item.nganhId ?? item.nganh?.id) === nganhId.value;
    const matchedKeyword = matchKeyword(item, keyword.value, [
      'maChuongTrinh',
      'tenChuongTrinh',
      'thoiGianDaoTao',
      'doiTuongTuyenSinh',
    ]);
    return matchedParent && matchedKeyword;
  });
});

const getNameById = (list, id, nameKey) => {
  const found = list.find((item) => Number(item.id) === Number(id));
  return found?.[nameKey] || id || '-';
};

const resetForm = () => {
  editingId.value = null;
  Object.assign(form, {
    nganhId: nganhId.value || '',
    trinhDoId: '',
    loaiChuongTrinhId: '',
    maChuongTrinh: '',
    tenChuongTrinh: '',
    doiTuongTuyenSinh: '',
    thoiGianDaoTao: '',
  });
};

const loadParent = async () => {
  if (!nganhId.value) {
    nganh.value = null;
    return;
  }

  const response = await getNganhById(nganhId.value);
  nganh.value = unwrapApiData(response) || null;
};

const loadOptions = async () => {
  const [nganhRes, trinhDoRes, loaiRes] = await Promise.all([
    getAllNganh({ page: 0, size: 200 }),
    getAllTrinhDoDaoTao({ page: 0, size: 200 }),
    getAllLoaiChuongTrinh({ page: 0, size: 200 }),
  ]);

  nganhOptions.value = unwrapApiList(nganhRes);
  trinhDoOptions.value = unwrapApiList(trinhDoRes);
  loaiChuongTrinhOptions.value = unwrapApiList(loaiRes);
};

const fetchItems = async () => {
  loading.value = true;
  error.value = '';

  try {
    await Promise.all([loadParent(), loadOptions()]);

    const response = await getAllChuongTrinh({ page: 0, size: 200 });
    const list = unwrapApiList(response);

    items.value = nganhId.value
        ? list.filter((item) => Number(item.nganhId ?? item.nganh?.id) === nganhId.value)
        : list;
  } catch (err) {
    error.value = getErrorMessage(err);
  } finally {
    loading.value = false;
  }
};

const openCreate = () => {
  resetForm();
  showForm.value = true;
};

const openEdit = (item) => {
  editingId.value = item.id;
  Object.assign(form, {
    nganhId: Number(item.nganhId ?? item.nganh?.id ?? nganhId.value ?? ''),
    trinhDoId: Number(item.trinhDoId ?? item.trinhDo?.id ?? ''),
    loaiChuongTrinhId: Number(item.loaiChuongTrinhId ?? item.loaiChuongTrinh?.id ?? ''),
    maChuongTrinh: item.maChuongTrinh ?? '',
    tenChuongTrinh: item.tenChuongTrinh ?? '',
    doiTuongTuyenSinh: item.doiTuongTuyenSinh ?? '',
    thoiGianDaoTao: item.thoiGianDaoTao ?? '',
  });
  showForm.value = true;
};

const buildPayload = () => ({
  nganhId: Number(form.nganhId || nganhId.value),
  trinhDoId: Number(form.trinhDoId),
  loaiChuongTrinhId: Number(form.loaiChuongTrinhId),
  maChuongTrinh: form.maChuongTrinh,
  tenChuongTrinh: form.tenChuongTrinh,
  doiTuongTuyenSinh: form.doiTuongTuyenSinh,
  thoiGianDaoTao: form.thoiGianDaoTao,
});

const saveItem = async () => {
  saving.value = true;

  try {
    const payload = buildPayload();

    if (editingId.value) {
      await updateChuongTrinh(editingId.value, payload);
    } else {
      await createChuongTrinh(payload);
    }

    showForm.value = false;
    await fetchItems();
  } catch (err) {
    alert(getErrorMessage(err));
  } finally {
    saving.value = false;
  }
};

const removeItem = async (item) => {
  if (!window.confirm(`Xóa chương trình ${item.tenChuongTrinh || item.maChuongTrinh}?`)) return;

  try {
    await deleteChuongTrinh(item.id);
    await fetchItems();
  } catch (err) {
    alert(getErrorMessage(err));
  }
};

const goDetail = (item) => {
  router.push({ name: 'dao-tao-chuong-trinh-detail', params: { id: item.id } });
};

const goVersion = (item) => {
  router.push({ name: 'dao-tao-chuong-trinh-detail', params: { id: item.id }, query: { tab: 'version' } });
};

watch(() => route.params.nganhId, fetchItems);
onMounted(fetchItems);
</script>

<style scoped>
.parent-card {
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 10px;
  padding: 14px 16px;
  margin-bottom: 14px;
  background: #eff6ff;
  border: 1px solid #bfdbfe;
  border-radius: 14px;
}

.parent-card div {
  display: flex;
  gap: 8px;
  flex-wrap: wrap;
}

.nav-btn,
.link-btn {
  color: #2563eb;
  background: transparent;
  border: 0;
  cursor: pointer;
  font-weight: 800;
  text-decoration: none;
}

.nav-btn {
  padding: 10px 12px;
  border-radius: 10px;
  background: #dbeafe;
}

.field select,
.field input,
.field textarea {
  width: 100%;
}

@media (max-width: 800px) {
  .parent-card {
    grid-template-columns: 1fr;
  }
}
</style>
