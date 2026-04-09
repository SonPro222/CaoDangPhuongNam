<template>
  <div class="container mt-4">
    <div class="d-flex justify-content-between align-items-center mb-3">
      <h3 class="mb-0">Quản lý Ngành</h3>
      <button class="btn btn-primary" @click="openCreate">
        Thêm Ngành
      </button>
    </div>

    <div v-if="loading" class="text-center py-4">
      Đang tải dữ liệu...
    </div>

    <div v-else>
      <table class="table table-bordered table-hover align-middle">
        <thead>
        <tr>
          <th>ID</th>
          <th>Mã ngành</th>
          <th>Tên ngành</th>
          <th>Trạng thái</th>
          <th width="160">Hành động</th>
        </tr>
        </thead>

        <tbody>
        <tr v-if="nganhList.length === 0">
          <td colspan="5" class="text-center text-muted">
            Không có dữ liệu
          </td>
        </tr>

        <tr v-for="item in nganhList" :key="item.id">
          <td>{{ item.id }}</td>
          <td>{{ item.maNganh }}</td>
          <td>{{ item.ten }}</td>
          <td>
              <span
                  class="badge"
                  :class="item.trangThai === 'dang_dao_tao' ? 'bg-success' : 'bg-secondary'"
              >
                {{ item.trangThai }}
              </span>
          </td>
          <td>
            <button class="btn btn-sm btn-warning me-2" @click="openEdit(item)">
              Sửa
            </button>
            <button class="btn btn-sm btn-danger" @click="removeNganh(item.id)">
              Xóa
            </button>
          </td>
        </tr>
        </tbody>
      </table>
    </div>

    <div v-if="showModal" class="modal-backdrop-custom">
      <div class="modal-content-custom">
        <div class="d-flex justify-content-between align-items-center mb-3">
          <h5 class="mb-0">{{ isEdit ? "Sửa Ngành" : "Thêm Ngành" }}</h5>
          <button class="btn btn-sm btn-outline-secondary" @click="closeModal">
            X
          </button>
        </div>

        <div class="mb-3">
          <label class="form-label">Mã ngành</label>
          <input v-model.trim="form.maNganh" class="form-control" />
        </div>

        <div class="mb-3">
          <label class="form-label">Tên ngành</label>
          <input v-model.trim="form.ten" class="form-control" />
        </div>

        <div class="mb-3">
          <label class="form-label">Trạng thái</label>
          <select v-model="form.trangThai" class="form-select">
            <option value="dang_dao_tao">Đang đào tạo</option>
            <option value="ngung_dao_tao">Ngưng đào tạo</option>
          </select>
        </div>

        <div class="text-end">
          <button class="btn btn-secondary me-2" @click="closeModal">
            Hủy
          </button>
          <button class="btn btn-success" @click="saveNganh" :disabled="saving">
            {{ saving ? "Đang lưu..." : "Lưu" }}
          </button>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup>
import { ref, onMounted } from "vue";
import { fetchAllNganh } from "@/api/nganh/fetchApi/fetchApi.js";
import {
  saveCreateNganh,
  saveUpdateNganh,
  saveDeleteNganh,
} from "@/api/nganh/data/saveData.js";

const nganhList = ref([]);
const loading = ref(false);
const saving = ref(false);

const showModal = ref(false);
const isEdit = ref(false);

const createDefaultForm = () => ({
  id: null,
  maNganh: "",
  ten: "",
  trangThai: "dang_dao_tao",
});

const form = ref(createDefaultForm());

const loadNganh = async () => {
  loading.value = true;
  try {
    const data = await fetchAllNganh();
    console.log("Danh sách ngành:", data);

    nganhList.value = Array.isArray(data) ? data : [];
  } catch (error) {
    console.error("Lỗi load ngành:", error);
    alert("Không tải được dữ liệu ngành");
  } finally {
    loading.value = false;
  }
};

const openCreate = () => {
  isEdit.value = false;
  form.value = createDefaultForm();
  showModal.value = true;
};

const openEdit = (item) => {
  isEdit.value = true;
  form.value = {
    id: item.id,
    maNganh: item.maNganh,
    ten: item.ten,
    trangThai: item.trangThai,
  };
  showModal.value = true;
};

const closeModal = () => {
  showModal.value = false;
  form.value = createDefaultForm();
};

const validateForm = () => {
  if (!form.value.maNganh) {
    alert("Mã ngành không được để trống");
    return false;
  }

  if (!form.value.ten) {
    alert("Tên ngành không được để trống");
    return false;
  }

  if (!form.value.trangThai) {
    alert("Trạng thái không được để trống");
    return false;
  }

  return true;
};

const saveNganh = async () => {
  if (!validateForm()) return;

  saving.value = true;

  try {
    const payload = {
      maNganh: form.value.maNganh,
      ten: form.value.ten,
      trangThai: form.value.trangThai,
    };

    if (isEdit.value) {
      await saveUpdateNganh(form.value.id, payload);
    } else {
      await saveCreateNganh(payload);
    }

    closeModal();
    await loadNganh();
  } catch (error) {
    console.error("Lỗi lưu ngành:", error);
    alert("Lưu dữ liệu thất bại");
  } finally {
    saving.value = false;
  }
};

const removeNganh = async (id) => {
  const isConfirm = window.confirm("Bạn có chắc muốn xóa ngành này?");
  if (!isConfirm) return;

  try {
    await saveDeleteNganh(id);
    await loadNganh();
  } catch (error) {
    console.error("Lỗi xóa ngành:", error);
    alert("Xóa dữ liệu thất bại");
  }
};

onMounted(() => {
  loadNganh();
});
</script>

<style scoped>
.modal-backdrop-custom {
  position: fixed;
  inset: 0;
  background: rgba(0, 0, 0, 0.5);
  z-index: 1050;
}

.modal-content-custom {
  background: #ffffff;
  padding: 20px;
  width: 450px;
  max-width: 90%;
  margin: 8% auto;
  border-radius: 8px;
}
</style>