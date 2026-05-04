import apiClient from '../../apiConfig';

const ENDPOINT = '/api/chuong-trinh/mon-hoc';

export const getAllMonHoc = (params = {}) => {
  return apiClient.get(ENDPOINT, { params });
};

export const getMonHocById = (id) => {
  return apiClient.get(`${ENDPOINT}/${id}`);
};

export default {
  getAllMonHoc,
  getMonHocById,
};
