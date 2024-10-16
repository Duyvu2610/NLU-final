import { ScreenDto } from "@/dto/screenDto";

const screenConstant: { [key: string]: ScreenDto } = {
  Home: new ScreenDto("X001", "ダッシュボード", "/", () => import("@/pages/HomePage.vue")),
  About: new ScreenDto("X002", "詳細", "/about", () => import("@/pages/AboutPage.vue"), {
    JobInput: new ScreenDto(
      "E002",
      "バッチ処理実行登録（条件設定）",
      "/main",
      () => import("@/pages/MainPage.vue")
    ),
  }),
};

export default screenConstant;
