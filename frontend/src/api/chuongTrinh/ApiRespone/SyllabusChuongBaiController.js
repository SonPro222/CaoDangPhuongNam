import apiClient from '../../apiConfig';

const ENDPOINT = '/api/chuong-trinh/syllabus-chuong-bai';

export const getAllSyllabusChuongBai = (params = {}) => {
  return apiClient.get(ENDPOINT, { params });
};

export const getSyllabusChuongBaiById = (id) => {
  return apiClient.get(`${ENDPOINT}/${id}`);
};

export default {
  getAllSyllabusChuongBai,
  getSyllabusChuongBaiById,
};
