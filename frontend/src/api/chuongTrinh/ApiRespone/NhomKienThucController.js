import apiClient from '../../apiConfig';

const ENDPOINT = '/api/chuong-trinh/nhom-kien-thuc';

export const getAllNhomKienThuc = (params = {}) => {
  return apiClient.get(ENDPOINT, { params });
};

export const getNhomKienThucById = (id) => {
  return apiClient.get(`${ENDPOINT}/${id}`);
};

export default {
  getAllNhomKienThuc,
  getNhomKienThucById,
};
