<template>
  <div class="service">
    <h2>SpringBoot Service</h2>
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
import springHtpService from '../services/SpringHttpService'

export default class KickNode extends Vue {
  status = 0;
  public async success(): Promise<void> {
    this.status = await springHtpService.success({ message: "Hi Swisscom"});
  }

  public async failure(): Promise<void> {
    this.status = await springHtpService.error();
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
