<template>
  <div>
    <header>
      <h1>Header</h1>
    </header>
    <main>
      <router-view />
    </main>
    <footer>
      <p>Footer</p>
    </footer>
  </div>
</template>

<script setup>
</script>

<style scoped>
header {
  background-color: #f8f9fa;
  padding: 1rem;
  text-align: center;
}

footer {
  background-color: #f8f9fa;
  padding: 1rem;
  text-align: center;
  position: fixed;
  width: 100%;
  bottom: 0;
}

main {
  padding: 1rem;
  margin-bottom: 3rem;
}
</style>