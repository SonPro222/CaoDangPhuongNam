import apiClient from '../../apiConfig';

const ENDPOINT = '/api/he-thong/vai-tro';

export const getAllVaiTro = (params = {}) => {
  return apiClient.get(ENDPOINT, { params });
};

export const getVaiTroById = (id) => {
  return apiClient.get(`${ENDPOINT}/${id}`);
};

export default {
  getAllVaiTro,
  getVaiTroById,
};
