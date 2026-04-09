import axios from "axios";
import API_BASE_URL from "./config.js";

const connection = axios.create({
    baseURL: API_BASE_URL,
    timeout: 10000,
    headers: {
        "Content-Type": "application/json",
    },
});

export default connection;

// import axios from "axios";
// import API_BASE_URL from "../../config.js";
//
// /**
//  * ============================
//  * AXIOS INSTANCE
//  * ============================
//  */
// const connection = axios.create({
//     baseURL: API_BASE_URL,
//     timeout: 10000,
//     withCredentials: true, // bắt buộc nếu backend dùng httpOnly cookie
//     headers: {
//         "Content-Type": "application/json",
//         Accept: "application/json",
//     },
// });
//
// /**
//  * ============================
//  * ACCESS TOKEN STORAGE
//  * ============================
//  * Nếu mày dùng access token ở memory thì có thể thay phần này.
//  * Tạm thời tao để localStorage cho dễ dùng.
//  */
// const ACCESS_TOKEN_KEY = "access_token";
//
// export const authStorage = {
//     getAccessToken() {
//         return localStorage.getItem(ACCESS_TOKEN_KEY);
//     },
//
//     setAccessToken(token) {
//         localStorage.setItem(ACCESS_TOKEN_KEY, token);
//     },
//
//     clearAccessToken() {
//         localStorage.removeItem(ACCESS_TOKEN_KEY);
//     },
// };
//
// /**
//  * ============================
//  * COOKIE HELPER
//  * ============================
//  */
// const getCookieValue = (name) => {
//     const match = document.cookie
//         .split("; ")
//         .find((row) => row.startsWith(`${name}=`));
//     return match ? decodeURIComponent(match.split("=")[1]) : null;
// };
//
// /**
//  * ============================
//  * REQUEST INTERCEPTOR
//  * ============================
//  * 1. Gắn Bearer access token nếu có
//  * 2. Gắn CSRF token vào header nếu backend bật CookieCsrfTokenRepository
//  */
// connection.interceptors.request.use(
//     (config) => {
//         const accessToken = authStorage.getAccessToken();
//
//         if (accessToken) {
//             config.headers.Authorization = `Bearer ${accessToken}`;
//         }
//
//         // Spring Security mặc định hay dùng cookie XSRF-TOKEN
//         const csrfToken = getCookieValue("XSRF-TOKEN");
//         if (csrfToken) {
//             config.headers["X-XSRF-TOKEN"] = csrfToken;
//         }
//
//         return config;
//     },
//     (error) => Promise.reject(error)
// );
//
// /**
//  * ============================
//  * RESPONSE INTERCEPTOR
//  * ============================
//  * Xử lý lỗi tập trung
//  */
// connection.interceptors.response.use(
//     (response) => response,
//     async (error) => {
//         if (!error.response) {
//             return Promise.reject({
//                 status: 0,
//                 message: "Không thể kết nối tới server",
//                 raw: error,
//             });
//         }
//
//         const status = error.response.status;
//
//         if (status === 401) {
//             authStorage.clearAccessToken();
//
//             return Promise.reject({
//                 status: 401,
//                 message: "Phiên đăng nhập đã hết hạn hoặc chưa đăng nhập",
//                 raw: error,
//             });
//         }
//
//         if (status === 403) {
//             return Promise.reject({
//                 status: 403,
//                 message: "Bạn không có quyền truy cập hoặc thiếu CSRF token hợp lệ",
//                 raw: error,
//             });
//         }
//
//         return Promise.reject({
//             status,
//             message:
//                 error.response.data?.message ||
//                 error.response.data?.error ||
//                 "Đã xảy ra lỗi hệ thống",
//             data: error.response.data,
//             raw: error,
//         });
//     }
// );
//
// export default connection;