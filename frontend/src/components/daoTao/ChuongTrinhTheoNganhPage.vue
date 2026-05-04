<template>
  <DaoTaoPageShell title="Chương trình theo ngành" description="Route đi sâu từ ngành theo đúng DB: nganh -> chuong_trinh -> chuong_trinh_version.">
    <template #breadcrumb>
      <RouterLink :to="{ name: 'dao-tao-nganh' }">Ngành</RouterLink>
      <span> / Ngành ID {{ nganhId }} / Chương trình</span>
    </template>

    <div class="card warning">
      <h2>Thiếu API controller chương trình</h2>
      <p>Trong file API đã gửi mới có controller: ngành, trình độ, loại chương trình, khung kỳ, khóa đào tạo, lớp hành chính.</p>
      <p>DB của mày có bảng <b>chuong_trinh</b> nằm giữa <b>nganh</b> và <b>chuong_trinh_version</b>, nên route này đã khai báo sẵn:</p>
      <pre>/dao-tao/nganh/:nganhId/chuong-trinh</pre>
      <p>Khi có API <b>ChuongTrinhController</b>, thay phần cảnh báo này bằng table gọi <b>getAllChuongTrinh({ nganhId })</b>.</p>
    </div>

    <div class="flow-card">
      <h3>Luồng đúng theo DB</h3>
      <div class="flow">
        <span>Ngành</span>
        <b>→</b>
        <span>Chương trình</span>
        <b>→</b>
        <span>Version</span>
        <b>→</b>
        <span>Nhóm kiến thức / Môn trong CT / Syllabus</span>
      </div>
    </div>
  </DaoTaoPageShell>
</template>

<script setup>
import { useRoute } from 'vue-router';
import DaoTaoPageShell from './shared/DaoTaoPageShell.vue';

const route = useRoute();
const nganhId = route.params.nganhId;
</script>

<style scoped>
.card,
.flow-card {
  padding: 18px;
  margin-bottom: 16px;
  background: #fff;
  border: 1px solid #e2e8f0;
  border-radius: 16px;
}
.warning {
  border-color: #facc15;
  background: #fefce8;
}
pre {
  padding: 12px;
  overflow-x: auto;
  background: #0f172a;
  color: #fff;
  border-radius: 10px;
}
.flow {
  display: flex;
  gap: 10px;
  align-items: center;
  flex-wrap: wrap;
}
.flow span {
  padding: 8px 12px;
  border-radius: 999px;
  background: #dbeafe;
  color: #1d4ed8;
  font-weight: 800;
}
</style>
