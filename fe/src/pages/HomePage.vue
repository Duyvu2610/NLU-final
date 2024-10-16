<script setup lang="ts">
import { ref } from "vue";
import { useRouter } from "vue-router";

const router = useRouter();
const onClick = () => {
  router?.push("/about");
};
const value1 = ref("");
</script>

<template>
  <h2>Home Page</h2>
  {{ value1 }}
  <button @click="onClick">
    a
  </button>
  <IconField>
    <InputIcon class="pi pi-search" />
    <InputText
      v-model="value1"
      placeholder="Search"
    />
  </IconField>
</template>

<style scoped>

</style>
