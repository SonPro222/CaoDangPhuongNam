import apiClient from '../../apiConfig';

const ENDPOINT = '/api/chuong-trinh/chuong-trinh-version';

export const getAllChuongTrinhVersion = (params = {}) => {
  return apiClient.get(ENDPOINT, { params });
};

export const getChuongTrinhVersionById = (id) => {
  return apiClient.get(`${ENDPOINT}/${id}`);
};

export default {
  getAllChuongTrinhVersion,
  getChuongTrinhVersionById,
};
