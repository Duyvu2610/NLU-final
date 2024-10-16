import './style.css';
import { createApp } from 'vue';
import App from './App.vue';
import PrimeVue from 'primevue/config';
import Aura from '@primevue/themes/aura';
import router from './router';

createApp(App).use(PrimeVue, {theme: {preset: Aura}}).use(router).mount('#app');