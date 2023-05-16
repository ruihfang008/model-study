<template>
  <div style="width: 100vw;height: 100vh;overflow: hidden;display: flex">
    <div style="flex: 1">
      <el-image src="https://s1.locimg.com/2023/05/07/b3f3469e399c2.png" style="width: 100%;height: 100%"></el-image>
    </div>
    <div class="welcome-title">
      <div style="font-size:30px;font-weight: bold;margin-bottom: 10px">欢迎来到我们的学习平台</div>
      <div style="font-size: 20px;margin-bottom: 5px">在这里你可以学到JAVA相关得所有知识，学习如何搭建网址，如何搭建博客等。</div>
      <div style="font-size: 5px">在这里你还可以同性交友，因为没有女孩子学习JAVA!</div>
    </div>
    <div style="width: 300px;background-color: white">
      <router-view/>
    </div>
  </div>
</template>

<script setup>
</script>

<style scoped>
.welcome-title{
  position: absolute;
  bottom: 60px;
  left: 30px;
  color: white;
  text-shadow: 0 0 10px black;
}
</style>