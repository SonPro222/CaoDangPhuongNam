import apiClient from '../../apiConfig';

const ENDPOINT = '/api/he-thong/tai-khoan';

export const getAllTaiKhoan = (params = {}) => {
  return apiClient.get(ENDPOINT, { params });
};

export const getTaiKhoanById = (id) => {
  return apiClient.get(`${ENDPOINT}/${id}`);
};

export default {
  getAllTaiKhoan,
  getTaiKhoanById,
};
