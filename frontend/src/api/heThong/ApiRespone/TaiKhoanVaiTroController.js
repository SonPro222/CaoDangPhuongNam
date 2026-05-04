import apiClient from '../../apiConfig';

const ENDPOINT = '/api/he-thong/tai-khoan-vai-tro';

export const getAllTaiKhoanVaiTro = (params = {}) => {
  return apiClient.get(ENDPOINT, { params });
};

export const getTaiKhoanVaiTroById = (id) => {
  return apiClient.get(`${ENDPOINT}/${id}`);
};

export default {
  getAllTaiKhoanVaiTro,
  getTaiKhoanVaiTroById,
};
