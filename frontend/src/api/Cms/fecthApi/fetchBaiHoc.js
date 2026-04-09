import connection from "@/api/connection.js";

const BAI_HOC_URL = "/nghiepvu/cms/bai_hoc";

/**
 * ============================
 * LẤY DANH SÁCH + FILTER + PAGE
 * ============================
 */
export const fetchBaiHocPage = async (params = {}) => {
    const response = await connection.get(BAI_HOC_URL, { params });
    return response.data;
};

/**
 * ============================
 * LẤY THEO ID
 * ============================
 */
export const fetchBaiHocById = async (id) => {
    const response = await connection.get(`${BAI_HOC_URL}/${id}`);
    return response.data;
};