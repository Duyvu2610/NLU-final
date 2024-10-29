<script setup lang="ts">
import { ref } from "vue";
import { useRouter } from "vue-router";

const router = useRouter();
const onClick = () => {
  router?.push("/about");
};
const value1 = ref("");
const visible = ref(false);
</script>

<template>
  <div class="card flex justify-center">
    <Drawer v-model:visible="visible" header="Hello">
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
    </Drawer>
    <Button icon="pi pi-arrow-right" @click="visible = true" />
</div>
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
