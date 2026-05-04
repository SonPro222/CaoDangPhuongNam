import apiClient from '../../apiConfig';

const ENDPOINT = '/api/he-thong/quyen';

export const getAllQuyen = (params = {}) => {
  return apiClient.get(ENDPOINT, { params });
};

export const getQuyenById = (id) => {
  return apiClient.get(`${ENDPOINT}/${id}`);
};

export default {
  getAllQuyen,
  getQuyenById,
};
