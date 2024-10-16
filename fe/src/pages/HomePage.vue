<script setup lang="ts">
import {getCurrentInstance} from "vue";
const app = getCurrentInstance();
const router = app?.appContext.config.globalProperties.$router;
const onClick = () => {
  router?.push("/about");
};
</script>

<template>
  <h2>Home Page</h2>
  <button @click="onClick">
    a
  </button>
</template>

<style scoped>

</style>
