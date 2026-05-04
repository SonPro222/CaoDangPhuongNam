import apiClient from '../../apiConfig';

const ENDPOINT = '/api/chuong-trinh/chuong-trinh';

export const getAllChuongTrinh = (params = {}) => {
  return apiClient.get(ENDPOINT, { params });
};

export const getChuongTrinhById = (id) => {
  return apiClient.get(`${ENDPOINT}/${id}`);
};

export default {
  getAllChuongTrinh,
  getChuongTrinhById,
};
