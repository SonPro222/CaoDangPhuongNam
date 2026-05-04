import apiClient from '../../apiConfig';

const ENDPOINT = '/api/chuong-trinh/mon-tien-quyet';

export const getAllMonTienQuyet = (params = {}) => {
  return apiClient.get(ENDPOINT, { params });
};

export const getMonTienQuyetById = (id) => {
  return apiClient.get(`${ENDPOINT}/${id}`);
};

export default {
  getAllMonTienQuyet,
  getMonTienQuyetById,
};
