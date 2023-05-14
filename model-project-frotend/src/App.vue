<script setup>

</script>

<template>
  <div style="width: 100vw;height: 100vh;overflow: hidden;display: flex">
    <div style="flex: 1">
      <el-image style="width: 100%;height: 100%" src="https://s1.locimg.com/2023/05/07/b3f3469e399c2.png"></el-image>
    </div>
    <div style="width: 300px;background-color: white">
      <div style="text-align: center;margin: 0px 20px">
        <div style="margin-top: 150px">
          <div style="font-size: 25px;font-weight: bold">登录</div>
          <div style="font-size: 14px;color: gray">在进入系统前先输入用户名和密码登录</div>
          <div style="margin-top: 30px">
            <el-input type="text" placeholder="用户名/邮箱">
              <template #prefix>
                <el-icon><User /></el-icon>
              </template>
            </el-input>
            <el-input style="margin-top:10px" type="password" placeholder="密码">
              <template #prefix>
                <el-icon><Lock /></el-icon>
              </template>
            </el-input>
          </div>
          <el-row>
            <el-col :span="12" style="text-align: left">
              <el-checkbox v-model="checked1" label="记住我"></el-checkbox>
            </el-col>
            <el-col :span="12" style="text-align: right">
              <el-link>忘记密码</el-link>
            </el-col>
          </el-row>
          <div style="margin-top: 40px">
            <el-button style="width: 270px" type="success" plain>立即登录</el-button>
          </div>
          <el-divider>
            <span style="color: gray">还没有账号</span>
          </el-divider>
          <div style="margin-top: 20px">
            <el-button style="width: 270px" type="success" plain>注册账号</el-button>
          </div>
        </div>
      </div>

    </div>
  </div>
</template>

<style scoped>

</style>
