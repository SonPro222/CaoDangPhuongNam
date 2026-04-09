import connection from "@/api/connection.js";

const NGANH_URL = "/nghiepvu/nganh";

// Thêm ngành
export const saveCreateNganh = async (data) => {
    const response = await connection.post(NGANH_URL, data);
    return response.data;
};

// Cập nhật ngành
export const saveUpdateNganh = async (id, data) => {
    const response = await connection.put(`${NGANH_URL}/${id}`, data);
    return response.data;
};

// Xóa ngành
export const saveDeleteNganh = async (id) => {
    const response = await connection.delete(`${NGANH_URL}/${id}`);
    return response.data;
};