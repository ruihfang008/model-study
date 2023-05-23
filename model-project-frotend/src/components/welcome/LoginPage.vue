<template>
  <div style="text-align: center;margin: 0px 20px">
    <div style="margin-top: 150px">
      <div style="font-size: 25px;font-weight: bold">登录</div>
      <div style="font-size: 14px;color: gray">在进入系统前先输入用户名和密码登录</div>
      <div style="margin-top: 30px">
        <el-input v-model="form.username" type="text" placeholder="用户名/邮箱">
          <template #prefix>
            <el-icon><User /></el-icon>
          </template>
        </el-input>
        <el-input v-model="form.password" style="margin-top:10px" type="password" placeholder="密码">
          <template #prefix>
            <el-icon><Lock /></el-icon>
          </template>
        </el-input>
      </div>
      <el-row>
        <el-col :span="12" style="text-align: left">
          <el-checkbox v-model="form.remember" label="记住我"></el-checkbox>
        </el-col>
        <el-col :span="12" style="text-align: right">
          <el-link>忘记密码</el-link>
        </el-col>
      </el-row>
      <div style="margin-top: 40px">
        <el-button @click="login" style="width: 270px" type="success" plain>立即登录</el-button>
      </div>
      <el-divider>
        <span style="color: gray">还没有账号</span>
      </el-divider>
      <div style="margin-top: 20px">
        <el-button @click="router.push('/register')" style="width: 270px" type="success" plain>注册账号</el-button>
      </div>
    </div>
  </div>
</template>

<script setup>
import {ElMessage} from "element-plus";
import {post} from "../../net";
import router from "../../router";
import {reactive} from "vue";

const form=reactive(
    {
      username: '',
      password: '',
      remember: false
    })
const login=()=>{
  if(!form.username||!form.password){
      ElMessage.warning('请填写用户名和密码');
  }else {
    post('/api/auth/login',{
      username: form.username,
      password: form.password,
      remember: form.remember
    },(message)=>{
      ElMessage.success(message);
      router.push('/index')
    })
  }
}

</script>

<style scoped>

</style>