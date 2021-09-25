<template>
  <div class="container">
    <div class="row">
      <div class="column"></div>
      <div class="column">
        <img class="logo" alt="Vue logo" src="./assets/opentelemetry-stacked-color.png">
      </div>
      <div class="column"></div>
    </div>
    
    <div class="row">
      <div class="column flex-basis">
        <KickRuby/>
      </div>
      <div class="column flex-basis">
        <KickSpringBoot/>
      </div>
      <div class="column flex-basis">
        <KickNode/>
      </div>
    </div>
  </div>
</template>

<script lang="ts">
import { Options, Vue } from 'vue-class-component';
import KickSpringBoot from './components/KickSpringBoot.vue';
import KickNode from './components/KickNode.vue';
import KickRuby from './components/KickRuby.vue';

@Options({
  components: {
    KickNode,
    KickSpringBoot,
    KickRuby
  },
})
export default class App extends Vue {}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}

.container {
  max-width: 900px;
  margin: auto;
}

.row {
  display: flex;
  flex-wrap: wrap;
  margin: 8px;
}

.column {
  flex: 1 1 0;
}

.flex-basis {
  flex-basis: auto;
}

.logo {
  width: 100%;
}

.service {
  display: flex;
  flex-direction: column;
  border: solid 2px #f6a81c;
  padding: 16px;
  margin: 8px;
  border-radius: 8px;
  box-shadow: 4px 4px 6px lightgray;
}

.mt-1 {
  margin-top: 8px;
}

button {
  background-color: #4b5fab;
  border: none;
  color: white;
  padding: 8px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  border-radius: 16px;
  transition: opacity 0.2s ease-in-out;
}

button:hover {
  opacity: 0.9;
  cursor: pointer;
}

</style>
