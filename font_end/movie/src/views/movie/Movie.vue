<template>
  <Menu>
    <div class="movie">
      <h1>Quản lý Phim</h1>
      <div style="min-height: 580px; background-color: white; border-radius: 30px">
        <div
          style="
            height: 60px;
            width: 100%;
            border-bottom: 1px solid grey;
            display: flex;
            align-items: center;
            padding-left: 30px;
          "
        >
          <span style="font-size: 20px; font-weight: bold"> Quản lý Phim</span>
        </div>
        <div class="container mx-auto px-6 pt-10">
          <div style="grid-template-columns: 28% 16% 28% 28%" class="grid gap-4">
            <div>
              <input
                type="text"
                style="height: 30px"
                id="large-input"
                class="block w-full p-4 text-gray-900 border border-gray-300 rounded-lg bg-gray-50 text-base focus:ring-blue-500 focus:border-blue-500 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
                s
              />
            </div>
            <div></div>
            <div style="display: flex">
              <div style="width: 47%; margin-right: 20px" class="relative max-w-sm">
                <div class="absolute inset-y-0 start-0 flex items-center ps-3 pointer-events-none">
                  <svg
                    class="w-4 h-4 text-gray-500 dark:text-gray-400"
                    aria-hidden="true"
                    xmlns="http://www.w3.org/2000/svg"
                    fill="currentColor"
                    viewBox="0 0 20 20"
                  >
                    <path
                      d="M20 4a2 2 0 0 0-2-2h-2V1a1 1 0 0 0-2 0v1h-3V1a1 1 0 0 0-2 0v1H6V1a1 1 0 0 0-2 0v1H2a2 2 0 0 0-2 2v2h20V4ZM0 18a2 2 0 0 0 2 2h16a2 2 0 0 0 2-2V8H0v10Zm5-8h10a1 1 0 0 1 0 2H5a1 1 0 0 1 0-2Z"
                    />
                  </svg>
                </div>
                <input
                  id="datepicker-title"
                  datepicker
                  datepicker-title="Flowbite datepicker"
                  type="text"
                  class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full ps-10 p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
                  placeholder="Select date"
                />
              </div>

              <div style="width: 47%" class="relative max-w-sm">
                <div class="absolute inset-y-0 start-0 flex items-center ps-3 pointer-events-none">
                  <svg
                    class="w-4 h-4 text-gray-500 dark:text-gray-400"
                    aria-hidden="true"
                    xmlns="http://www.w3.org/2000/svg"
                    fill="currentColor"
                    viewBox="0 0 20 20"
                  >
                    <path
                      d="M20 4a2 2 0 0 0-2-2h-2V1a1 1 0 0 0-2 0v1h-3V1a1 1 0 0 0-2 0v1H6V1a1 1 0 0 0-2 0v1H2a2 2 0 0 0-2 2v2h20V4ZM0 18a2 2 0 0 0 2 2h16a2 2 0 0 0 2-2V8H0v10Zm5-8h10a1 1 0 0 1 0 2H5a1 1 0 0 1 0-2Z"
                    />
                  </svg>
                </div>
                <input
                  id="datepicker-title"
                  datepicker
                  datepicker-title="Flowbite datepicker"
                  type="text"
                  class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full ps-10 p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
                  placeholder="Select date"
                />
              </div>
            </div>
            <div>
              <input
                type="text"
                style="height: 30px; width: 85%"
                id="large-input"
                class="block w-full p-4 text-gray-900 border border-gray-300 rounded-lg bg-gray-50 text-base focus:ring-blue-500 focus:border-blue-500 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
                s
              />
            </div>
          </div>
        </div>
        <div class="container mx-auto px-6 pt-10">
          <div class="relative overflow-x-auto">
            <table class="w-full text-sm text-left rtl:text-right text-gray-500 dark:text-gray-400">
              <thead
                class="text-xs text-gray-700 uppercase bg-gray-100 dark:bg-gray-700 dark:text-gray-400"
              >
                <tr>
                  <th scope="col" class="px-6 py-3 rounded-s-lg">Product name</th>
                  <th scope="col" class="px-6 py-3">Qty</th>
                  <th scope="col" class="px-6 py-3 rounded-e-lg">Price</th>
                </tr>
              </thead>
              <tbody>
                <tr class="bg-white dark:bg-gray-800">
                  <th
                    scope="row"
                    class="px-6 py-4 font-medium text-gray-900 whitespace-nowrap dark:text-white"
                  >
                    Apple MacBook Pro 17"
                  </th>
                  <td class="px-6 py-4">1</td>
                  <td class="px-6 py-4">$2999</td>
                </tr>
                <tr class="bg-white dark:bg-gray-800">
                  <th
                    scope="row"
                    class="px-6 py-4 font-medium text-gray-900 whitespace-nowrap dark:text-white"
                  >
                    Microsoft Surface Pro
                  </th>
                  <td class="px-6 py-4">1</td>
                  <td class="px-6 py-4">$1999</td>
                </tr>
                <tr class="bg-white dark:bg-gray-800">
                  <th
                    scope="row"
                    class="px-6 py-4 font-medium text-gray-900 whitespace-nowrap dark:text-white"
                  >
                    Magic Mouse 2
                  </th>
                  <td class="px-6 py-4">1</td>
                  <td class="px-6 py-4">$99</td>
                </tr>
              </tbody>
              <tfoot>
                <tr class="font-semibold text-gray-900 dark:text-white">
                  <th scope="row" class="px-6 py-3 text-base">Total</th>
                  <td class="px-6 py-3">3</td>
                  <td class="px-6 py-3">21,000</td>
                </tr>
              </tfoot>
            </table>
          </div>
        </div>
      </div>
    </div>
  </Menu>
</template>

<script setup lang="ts">
import Menu from '../../layout/Menu.vue'
</script>
