<!-- PageHome.vue -->
<template>
    <div class="home">
      <img alt="Vue logo" src="../assets/logo.png">
      <HelloWorld msg="main page"/>
    </div>
  </template>
  
  <script>
  // @ is an alias to /src
  import HelloWorld from '@/components/HelloWorld.vue'
  
  export default {
    name: 'PageHome',
    components: {
      HelloWorld
    }
  }
  </script>