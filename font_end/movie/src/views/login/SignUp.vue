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
          <p style="font-weight: bold; text-align: center; font-size: 20px">SIGN UP</p>
          <div style="margin-top: 30px; margin-bottom: 10px">
            <div style="margin-bottom: 10px">
              <input
                type="text"
                id="first_name"
                class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
                placeholder="name"
                style="border-radius: 15px; height: 38px"
                required
              />
            </div>
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
          <div style="margin-bottom: 10px">
            <input
              type="password"
              id="first_name"
              class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
              placeholder="confirm password"
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
          </div>
          <button type="button" class="btn-login">Sign Up</button>
          <p style="text-align: center; margin-top: 5px">
            Already have an account?
            <router-link to="/login" style="font-weight: bold">Sign in</router-link>
          </p>
        </div>
      </div>
    </div>
  </div>
</template>
<script setup lang="ts">
import Vue from 'vue'
import '../../assets/login.css'
</script>
