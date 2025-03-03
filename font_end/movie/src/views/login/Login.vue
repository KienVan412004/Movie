<template>
  <div style="display: flex; align-items: end !important; justify-content: center">
    <div class="login">
      <div class="grid grid-cols-2 gap-4">
        <div
          style="
            background-image: url('https://static.vecteezy.com/system/resources/previews/005/879/539/non_2x/cloud-computing-modern-flat-concept-for-web-banner-design-man-enters-password-and-login-to-access-cloud-storage-for-uploading-and-processing-files-illustration-with-isolated-people-scene-free-vector.jpg');
            background-size: cover;
            background-position: center;
          "
        ></div>
        <div style="padding: 30px">
          <p style="font-weight: bold; text-align: center; font-size: 30px">LOGIN</p>
          <div style="margin-top: 50px; margin-bottom: 20px">
            <input
              type="email"
              id="first_name"
              class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
              placeholder="email"
              style="border-radius: 15px; height: 38px"
              required
            />
          </div>
          <div style="margin-bottom: 10px">
            <input
              type="password"
              id="first_name"
              class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
              placeholder="password"
              style="border-radius: 15px; height: 38px"
              required
            />
          </div>
          <div class="flex justify-between">
            <div>
              <input
                id="default-checkbox"
                type="checkbox"
                value=""
                class="w-4 h-4 text-blue-600 bg-gray-100 border-gray-300 rounded-sm focus:ring-blue-500 dark:focus:ring-blue-600 dark:ring-offset-gray-800 focus:ring-2 dark:bg-gray-700 dark:border-gray-600"
              />
              <label
                for="default-checkbox"
                class="ms-2 text-sm font-medium text-gray-900 dark:text-gray-300"
                >Remember me</label
              >
            </div>
            <div>
              <label class="ms-2 text-sm font-medium text-gray-900 dark:text-gray-300"
                >Forgot Password?</label
              >
            </div>
          </div>
          <button type="button" class="btn-login">Login</button>
          <p style="text-align: center; margin-top: 5px">
            Don't have an account?
            <router-link to="/sign-up" style="font-weight: bold">Register</router-link>
          </p>
          <p style="text-align: center; margin-top: 5px; margin-bottom: 5px; color: gray">or</p>
          <div
            style="display: flex; align-items: center; justify-content: center; margin-top: 10px"
          >
            <div class="quick-login">
              <img
                src="https://upload.wikimedia.org/wikipedia/commons/thumb/c/c1/Google_%22G%22_logo.svg/1200px-Google_%22G%22_logo.svg.png"
                alt=""
                width="20px"
                height="20px"
              />
            </div>
            <div class="quick-login">
              <img
                src="https://png.pngtree.com/element_our/sm/20180626/sm_5b321c969857d.jpg"
                alt=""
                width="20px"
                height="20px"
              />
            </div>
            <div class="quick-login">
              <img
                src="https://w7.pngwing.com/pngs/59/223/png-transparent-bird-tweet-twitter-twitter-logo-social-media-icon.png"
                alt=""
                width="20px"
                height="20px"
              />
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>
<script setup lang="ts">
import Vue from 'vue'
import '../../assets/login.css'
</script>
