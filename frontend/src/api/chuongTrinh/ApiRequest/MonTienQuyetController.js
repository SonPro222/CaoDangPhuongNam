import apiClient from '../../apiConfig';

const ENDPOINT = '/api/chuong-trinh/mon-tien-quyet';

export const createMonTienQuyet = (data) => {
  return apiClient.post(ENDPOINT, data);
};

export const updateMonTienQuyet = (id, data) => {
  return apiClient.put(`${ENDPOINT}/${id}`, data);
};

export const deleteMonTienQuyet = (id) => {
  return apiClient.delete(`${ENDPOINT}/${id}`);
};

export default {
  createMonTienQuyet,
  updateMonTienQuyet,
  deleteMonTienQuyet,
};
