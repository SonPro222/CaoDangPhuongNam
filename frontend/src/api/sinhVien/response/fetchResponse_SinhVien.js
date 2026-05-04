import apiClient from '../../apiConfig';

const ENDPOINT = '/api/sinh-vien/sinh-vien';

export const getAllSinhVien = (params = {}) => {
  return apiClient.get(ENDPOINT, { params });
};

export const getSinhVienById = (id) => {
  return apiClient.get(`${ENDPOINT}/${id}`);
};

export default {
  getAllSinhVien,
  getSinhVienById,
};
