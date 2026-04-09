import connection from "@/api/connection.js";

const BAI_HOC_URL = "/nghiepvu/cms/bai_hoc";

/**
 * ============================
 * CREATE
 * ============================
 */
export const saveCreateBaiHoc = async (data) => {
    const response = await connection.post(BAI_HOC_URL, data);
    return response.data;
};

/**
 * ============================
 * UPDATE
 * ============================
 */
export const saveUpdateBaiHoc = async (id, data) => {
    const response = await connection.put(`${BAI_HOC_URL}/${id}`, data);
    return response.data;
};

/**
 * ============================
 * DELETE
 * ============================
 */
export const saveDeleteBaiHoc = async (id) => {
    const response = await connection.delete(`${BAI_HOC_URL}/${id}`);
    return response.data;
};