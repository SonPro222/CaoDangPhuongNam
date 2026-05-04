import HeThongLayout from '@/components/heThong/HeThongLayout.vue';
import NhanVienPage from '@/components/heThong/NhanVienPage.vue';
import NhatKyDangNhapPage from '@/components/heThong/NhatKyDangNhapPage.vue';
import NhatKyHeThongPage from '@/components/heThong/NhatKyHeThongPage.vue';
import QuyenPage from '@/components/heThong/QuyenPage.vue';
import TaiKhoanPage from '@/components/heThong/TaiKhoanPage.vue';
import TaiKhoanVaiTroPage from '@/components/heThong/TaiKhoanVaiTroPage.vue';
import VaiTroPage from '@/components/heThong/VaiTroPage.vue';
import VaiTroQuyenPage from '@/components/heThong/VaiTroQuyenPage.vue';

const heThongRoutes = [
    {
        path: '/he-thong',
        component: HeThongLayout,
        redirect: '/he-thong/nhan-vien',
        children: [
        { path: 'nhan-vien', name: 'he-thong-nhan-vien', component: NhanVienPage },
        { path: 'nhat-ky-dang-nhap', name: 'he-thong-nhat-ky-dang-nhap', component: NhatKyDangNhapPage },
        { path: 'nhat-ky-he-thong', name: 'he-thong-nhat-ky-he-thong', component: NhatKyHeThongPage },
        { path: 'quyen', name: 'he-thong-quyen', component: QuyenPage },
        { path: 'tai-khoan', name: 'he-thong-tai-khoan', component: TaiKhoanPage },
        { path: 'tai-khoan-vai-tro', name: 'he-thong-tai-khoan-vai-tro', component: TaiKhoanVaiTroPage },
        { path: 'vai-tro', name: 'he-thong-vai-tro', component: VaiTroPage },
        { path: 'vai-tro-quyen', name: 'he-thong-vai-tro-quyen', component: VaiTroQuyenPage },
        ],
    },
];

export default heThongRoutes;
