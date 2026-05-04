// src/router/module/daoTaoRoutes.js
import DaoTaoLayout from '@/components/daoTao/DaoTaoLayout.vue';
import NganhPage from '@/components/daoTao/NganhPage.vue';
import NganhDetailPage from '@/components/daoTao/NganhDetailPage.vue';
import ChuongTrinhTheoNganhPage from '@/components/daoTao/ChuongTrinhTheoNganhPage.vue';
import TrinhDoDaoTaoPage from '@/components/daoTao/TrinhDoDaoTaoPage.vue';
import LoaiChuongTrinhPage from '@/components/daoTao/LoaiChuongTrinhPage.vue';
import KhungKyPage from '@/components/daoTao/KhungKyPage.vue';
import KhoaDaoTaoPage from '@/components/daoTao/KhoaDaoTaoPage.vue';
import LopHanhChinhPage from '@/components/daoTao/LopHanhChinhPage.vue';

const daoTaoRoutes = [
  {
    path: '/dao-tao',
    component: DaoTaoLayout,
    redirect: '/dao-tao/nganh',
    children: [
      {
        path: 'nganh',
        name: 'dao-tao-nganh',
        component: NganhPage,
      },
      {
        path: 'nganh/:nganhId',
        name: 'dao-tao-nganh-detail',
        component: NganhDetailPage,
        props: true,
      },
      {
        path: 'nganh/:nganhId/chuong-trinh',
        name: 'dao-tao-nganh-chuong-trinh',
        component: ChuongTrinhTheoNganhPage,
        props: true,
      },
      {
        path: 'trinh-do-dao-tao',
        name: 'dao-tao-trinh-do',
        component: TrinhDoDaoTaoPage,
      },
      {
        path: 'loai-chuong-trinh',
        name: 'dao-tao-loai-chuong-trinh',
        component: LoaiChuongTrinhPage,
      },
      {
        path: 'khung-ky',
        name: 'dao-tao-khung-ky',
        component: KhungKyPage,
      },
      {
        path: 'khoa-dao-tao',
        name: 'dao-tao-khoa-dao-tao',
        component: KhoaDaoTaoPage,
      },
      {
        path: 'lop-hanh-chinh',
        name: 'dao-tao-lop-hanh-chinh',
        component: LopHanhChinhPage,
      },
    ],
  },
];

export default daoTaoRoutes;
