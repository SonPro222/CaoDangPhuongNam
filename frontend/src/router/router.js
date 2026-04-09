//src/router/router.js
import { createRouter, createWebHistory } from "vue-router";
import NganhPage from "@/components/Nganh/nganh.vue";

const routes = [
    {
        path: "/",
        name: "Home",
        component: NganhPage,
    },
    {
        path: "/nganh",
        name: "Nganh",
        component: NganhPage,
    },
];

const router = createRouter({
    history: createWebHistory(),
    routes,
});

export default router;