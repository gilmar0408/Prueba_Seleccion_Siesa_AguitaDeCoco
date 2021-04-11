<template>
  <div class="bg-primary" id="app">
    
    <!-- Sección Header -->
    <page-header></page-header>

    <!-- Sección API -->
    <div class="seccion-api container-fluid" id="api">
        <section-api></section-api>
    </div>
    <!-- Sección Footer -->
    <page-footer></page-footer>
    
  </div>
</template>

<script>
import PageFooter from "./components/PageFooter.vue";

import SectionApi from "./components/SectionApi.vue";
import PageHeader from "./components/PageHeader.vue";




export default {
  name: "App",
  components: {
    PageFooter,
    PageHeader,
    SectionApi,
  },
  
};
</script>

