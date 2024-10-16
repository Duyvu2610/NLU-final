import { createRouter, createWebHistory, RouteRecordRaw, RouteComponent } from "vue-router";

import { ScreenDto } from "@/dto/screenDto";

import screenConstant from "@/router/screenConstants";

const editRouter = (pages: ScreenDto[]) => {
  const children: {
    path: string;
    props: boolean;
    name: string;
    component: RouteComponent;
    children?: RouteRecordRaw[];
  }[] = [];
  pages.forEach((page: ScreenDto) => {
    children.push({
      path: page.path,
      props: true,
      name: page.id,
      component: page.component,
      children: page.children ? editRouter(Object.values(page.children)) : undefined,
    });
  });
  return children;
};

const routes: Array<RouteRecordRaw> = [
  {
    path: "/",
    component: () => import("@/layouts/BaseLayout.vue"),
    children: editRouter(Object.values(screenConstant)),
  },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
