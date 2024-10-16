<script setup lang="ts">
import {ComponentInternalInstance, getCurrentInstance} from "vue";
const app : ComponentInternalInstance | null = getCurrentInstance();
const router = app?.appContext.config.globalProperties.$router;
const onClick = () => {
  router?.push("/");
};
</script>

<template>
  <button @click="onClick">
    back to home page
  </button>
</template>

<style scoped>

</style>
