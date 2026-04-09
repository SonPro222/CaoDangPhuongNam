import connection from "@/api/connection.js";

const NGANH_URL = "/nghiepvu/nganh";

// Lấy toàn bộ danh sách ngành
export const fetchAllNganh = async () => {
    const response = await connection.get(NGANH_URL);
    return response.data;
};

// Lấy ngành theo id
export const fetchNganhById = async (id) => {
    const response = await connection.get(`${NGANH_URL}/${id}`);
    return response.data;
};

// Lấy danh sách có phân trang
export const fetchNganhPage = async (params) => {
    const response = await connection.get(`${NGANH_URL}/page`, { params });
    return response.data;
};