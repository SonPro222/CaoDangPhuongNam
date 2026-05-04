import apiClient from '../../apiConfig';

const ENDPOINT = '/api/he-thong/nhan-vien';

export const getAllNhanVien = (params = {}) => {
  return apiClient.get(ENDPOINT, { params });
};

export const getNhanVienById = (id) => {
  return apiClient.get(`${ENDPOINT}/${id}`);
};

export default {
  getAllNhanVien,
  getNhanVienById,
};
