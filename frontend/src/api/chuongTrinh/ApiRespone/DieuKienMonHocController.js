import apiClient from '../../apiConfig';

const ENDPOINT = '/api/chuong-trinh/dieu-kien-mon-hoc';

export const getAllDieuKienMonHoc = (params = {}) => {
  return apiClient.get(ENDPOINT, { params });
};

export const getDieuKienMonHocById = (id) => {
  return apiClient.get(`${ENDPOINT}/${id}`);
};

export default {
  getAllDieuKienMonHoc,
  getDieuKienMonHocById,
};
