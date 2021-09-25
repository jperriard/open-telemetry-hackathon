<template>
  <div class="service">
    <h2>Node Service</h2>
    <button @click="success">Success</button>
    <button class="mt-1" @click="failure">Error</button>
    <div class="mt-1" >
      <span v-if=status>{{ status }}</span>
      <span v-else>Status</span>
    </div>
  </div>
</template>

<script lang="ts">
import { Vue } from 'vue-class-component';
import nodeHttpService from '../services/NodeHttpService'

export default class KickSpringBoot extends Vue {
  status = 0;
  public async success(): Promise<void> {
    this.status = await nodeHttpService.success({ message: "Hi Swisscom"});
  }

  public async failure(): Promise<void> {
    this.status = await nodeHttpService.error();
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
