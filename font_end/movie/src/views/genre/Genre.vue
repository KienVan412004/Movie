<template>
  <Menu>
    <div class="genre">
      <div>
        <nav class="flex" aria-label="Breadcrumb">
          <ol class="inline-flex items-center space-x-1 md:space-x-2 rtl:space-x-reverse">
            <li class="inline-flex items-center">
              <a
                href="#"
                class="inline-flex items-center text-sm font-medium text-gray-700 hover:text-blue-600 dark:text-gray-400 dark:hover:text-white"
              >
                <svg
                  class="w-3 h-3 me-2.5"
                  aria-hidden="true"
                  xmlns="http://www.w3.org/2000/svg"
                  fill="currentColor"
                  viewBox="0 0 20 20"
                >
                  <path
                    d="m19.707 9.293-2-2-7-7a1 1 0 0 0-1.414 0l-7 7-2 2a1 1 0 0 0 1.414 1.414L2 10.414V18a2 2 0 0 0 2 2h3a1 1 0 0 0 1-1v-4a1 1 0 0 1 1-1h2a1 1 0 0 1 1 1v4a1 1 0 0 0 1 1h3a2 2 0 0 0 2-2v-7.586l.293.293a1 1 0 0 0 1.414-1.414Z"
                  />
                </svg>
                Home
              </a>
            </li>
            <li>
              <div class="flex items-center">
                <svg
                  class="rtl:rotate-180 w-3 h-3 text-gray-400 mx-1"
                  aria-hidden="true"
                  xmlns="http://www.w3.org/2000/svg"
                  fill="none"
                  viewBox="0 0 6 10"
                >
                  <path
                    stroke="currentColor"
                    stroke-linecap="round"
                    stroke-linejoin="round"
                    stroke-width="2"
                    d="m1 9 4-4-4-4"
                  />
                </svg>
                <a
                  href="#"
                  class="ms-1 text-sm font-medium text-gray-700 hover:text-blue-600 md:ms-2 dark:text-gray-400 dark:hover:text-white"
                  >Projects</a
                >
              </div>
            </li>
            <li aria-current="page">
              <div class="flex items-center">
                <svg
                  class="rtl:rotate-180 w-3 h-3 text-gray-400 mx-1"
                  aria-hidden="true"
                  xmlns="http://www.w3.org/2000/svg"
                  fill="none"
                  viewBox="0 0 6 10"
                >
                  <path
                    stroke="currentColor"
                    stroke-linecap="round"
                    stroke-linejoin="round"
                    stroke-width="2"
                    d="m1 9 4-4-4-4"
                  />
                </svg>
                <span class="ms-1 text-sm font-medium text-gray-500 md:ms-2 dark:text-gray-400"
                  >Flowbite</span
                >
              </div>
            </li>
          </ol>
        </nav>
      </div>
      <div
        style="min-height: 580px; background-color: white; border-radius: 30px; margin-top: 30px"
      >
        <div
          style="
            height: 80px;
            width: 100%;
            border-bottom: 1px solid #ebedf3;
            display: flex;
            align-items: center;
            padding-left: 30px;
          "
        >
          <img
            src="https://cdn-icons-png.flaticon.com/256/5362/5362466.png"
            alt="imade"
            style="width: 50px; height: 50px; margin-right: 10px"
          />
          <span style="font-size: 30px; font-weight: 600"> Quản lý thể loại</span>
        </div>
        <div class="container mx-auto px-6 pt-10">
          <!-- style="grid-template-columns: 25% 22% 31% 19%" -->
          <div class="grid grid-cols-1 md:grid-cols-4 gap-4">
            <div class="relative w-full">
              <input
                type="text"
                style="height: 38px; border-radius: 12px; font-weight: 600"
                class="w-full p-4 pr-12 text-gray-900 border border-gray-300 rounded-lg bg-gray-50 text-base focus:ring-blue-500 focus:border-blue-500 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
                placeholder="   Tìm kiếm"
              />
              <BxSearchAlt
                class="absolute right-4 top-1/2 transform -translate-y-1/2 text-gray-400 ml-1"
              />
            </div>
            <div></div>
            <div style="display: flex">
              <!-- <div style="width: 47%; margin-right: 20px" class="relative max-w-sm">
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
                  style="border-radius: 12px"
                  type="date"
                  class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full ps-10 p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
                  placeholder="Select date"
                />
              </div> -->

              <!-- <div style="width: 47%" class="relative max-w-sm">
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
                  style="border-radius: 12px"
                  type="date"
                  class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full ps-10 p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
                  placeholder="Select date"
                />
              </div> -->
            </div>
            <div style="display: flex; justify-content: end">
              <button class="btn-add" type="button" @click="openModal('modal-add')">
                <ClAddPlus style="width: 25px; height: 25px; color: white" /> Thêm Mới
              </button>
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
                  <th scope="col" class="px-6 py-3">STT</th>
                  <th scope="col" class="px-6 py-3 rounded-s-lg">TÊN THỂ LOẠI</th>
                  <th scope="col" class="px-6 py-3 rounded-e-lg">HÀNH ĐỘNG</th>
                </tr>
              </thead>
              <tbody>
                <tr
                  v-for="(item, index) in getAllGenre"
                  :key="item.id"
                  class="bg-white dark:bg-gray-800"
                >
                  <td class="px-6 py-4">{{ index + 1 }}</td>
                  <th
                    scope="row"
                    class="px-6 py-4 font-medium text-gray-900 whitespace-nowrap dark:text-white"
                  >
                    {{ item.name }}
                  </th>
                  <td class="px-6 py-4">
                    <!-- <button class="btn-view mx-2" type="button">
                      <AkEyeOpen
                        style="width: 25px; height: 25px; margin-left: 3px; color: white"
                      />
                    </button> -->
                    <button
                      @click="handleGetGenreById(item.id)"
                      class="btn-update mx-2"
                      type="button"
                    >
                      <BxPen style="width: 25px; height: 25px; margin-left: 3px; color: white" />
                    </button>
                    <button
                      @click="handleDeleteGenre(item.id)"
                      class="btn-delete mx-2"
                      type="button"
                    >
                      <p style="text-align: center">
                        <FlDelete style="width: 25px; height: 25px; margin-left: 3px" />
                      </p>
                    </button>
                  </td>
                </tr>
              </tbody>
            </table>
            <div style="display: flex; justify-content: end" class="mx-auto px-6 py-6">
              <nav aria-label="Page navigation example">
                <ul class="flex items-center -space-x-px h-8 text-sm">
                  <li>
                    <a
                      href="#"
                      class="flex items-center justify-center px-3 h-8 ms-0 leading-tight text-gray-500 bg-white border border-e-0 border-gray-300 rounded-s-lg hover:bg-gray-100 hover:text-gray-700 dark:bg-gray-800 dark:border-gray-700 dark:text-gray-400 dark:hover:bg-gray-700 dark:hover:text-white"
                    >
                      <span class="sr-only">Previous</span>
                      <svg
                        class="w-2.5 h-2.5 rtl:rotate-180"
                        aria-hidden="true"
                        xmlns="http://www.w3.org/2000/svg"
                        fill="none"
                        viewBox="0 0 6 10"
                      >
                        <path
                          stroke="currentColor"
                          stroke-linecap="round"
                          stroke-linejoin="round"
                          stroke-width="2"
                          d="M5 1 1 5l4 4"
                        />
                      </svg>
                    </a>
                  </li>
                  <li>
                    <a
                      href="#"
                      class="flex items-center justify-center px-3 h-8 leading-tight text-gray-500 bg-white border border-gray-300 hover:bg-gray-100 hover:text-gray-700 dark:bg-gray-800 dark:border-gray-700 dark:text-gray-400 dark:hover:bg-gray-700 dark:hover:text-white"
                      >1</a
                    >
                  </li>
                  <li>
                    <a
                      href="#"
                      class="flex items-center justify-center px-3 h-8 leading-tight text-gray-500 bg-white border border-gray-300 rounded-e-lg hover:bg-gray-100 hover:text-gray-700 dark:bg-gray-800 dark:border-gray-700 dark:text-gray-400 dark:hover:bg-gray-700 dark:hover:text-white"
                    >
                      <span class="sr-only">Next</span>
                      <svg
                        class="w-2.5 h-2.5 rtl:rotate-180"
                        aria-hidden="true"
                        xmlns="http://www.w3.org/2000/svg"
                        fill="none"
                        viewBox="0 0 6 10"
                      >
                        <path
                          stroke="currentColor"
                          stroke-linecap="round"
                          stroke-linejoin="round"
                          stroke-width="2"
                          d="m1 9 4-4-4-4"
                        />
                      </svg>
                    </a>
                  </li>
                </ul>
              </nav>
            </div>
          </div>
        </div>
      </div>
    </div>
    <ModalGenreAdd
      @save="handleAddGenre"
      @close="closeModal('modal-add')"
      :addGenre="addGenre"
      :isVisible="isOpenModal['modal-add']"
    />
    <ModalGenreUpdate
      @update="handleUpdateGenre(getGenreById.id)"
      @close="closeModal('modal-update')"
      :updateGenre="updateGenre"
      :isVisible="isOpenModal['modal-update']"
    />
  </Menu>
</template>

<script setup lang="ts">
import { FlDelete } from '@kalimahapps/vue-icons'
import { BxPen } from '@kalimahapps/vue-icons'
import { AkEyeOpen } from '@kalimahapps/vue-icons'
import { ClAddPlus } from '@kalimahapps/vue-icons'
import { BxSearchAlt } from '@kalimahapps/vue-icons'
import Menu from '../../layout/Menu.vue'
import { ref, watchEffect } from 'vue'
import type Genre from '../../types/Genre'
import GenreApi from '../../api/GenreApi'
import ModalGenreAdd from '../genre/ModalGenreAdd.vue'
import ModalGenreUpdate from '../genre/ModalGenreUpdate.vue'

const isOpenModal = ref<{ [Key: string]: boolean }>({})

const closeModal = (id: string) => {
  isOpenModal.value[id] = false
}

const openModal = (id: string) => {
  isOpenModal.value[id] = true
}
const getAllGenre = ref<Genre[]>([])
const getGenreById = ref<Genre>({})
const filterDirector = ref<string>('')
const pageable = ref({
  pageNumber: 0,
  totalPages: 0,
  totalElements: 0,
  size: 5,
})

const addGenre = ref<Genre>({
  name: '',
})
const updateGenre = ref<Genre>({
  name: '',
})

const handleGetGenreById = (id: string) => {
  GenreApi.getGenreById(id).then((response) => {
    getGenreById.value = response.data
    openModal('modal-update')
    updateGenre.value = { ...response.data }
  })
}
const handleGetAllGenre = () => {
  GenreApi.getAllGenre(pageable.value.pageNumber, pageable.value.size, filterDirector.value).then(
    (response) => {
      getAllGenre.value = response.data.content
      pageable.value.totalPages = response.data.totalPages
      pageable.value.totalElements = response.data.totalElements
      pageable.value.size = response.data.size
    },
  )
}

const handleAddGenre = () => {
  GenreApi.createGenre(addGenre.value).then(() => {
    closeModal('modal-add')
    handleGetAllGenre()
  })
}
const handleUpdateGenre = (id: string) => {
  GenreApi.updateGenre(id, updateGenre.value).then(() => {
    closeModal('modal-update')
    handleGetAllGenre()
  })
}

const handleDeleteGenre = (id: string) => {
  GenreApi.deleteGenre(id).then(() => {
    handleGetAllGenre()
  })
}

watchEffect(() => {
  handleGetAllGenre()
})
</script>
