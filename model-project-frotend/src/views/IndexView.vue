<template>
  <div style="text-align: center;margin-top: 300px">
    <div>欢迎进入我们的学习平台！</div>
    <el-button @click="logout" plain type='danger'>退出登录</el-button>
  </div>

</template>

<script setup>
import {ElMessage} from "element-plus";
import router from "../router";
import {get} from "../net";

const logout = () => {
  get('/api/auth/logout', (message) => {
    ElMessage.success(message);
    router.push('/')
  })
}
</script>

<style scoped>

</style>