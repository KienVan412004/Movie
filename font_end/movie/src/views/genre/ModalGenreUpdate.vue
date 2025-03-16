<script setup lang="ts">
const props = defineProps({
  isVisible: Boolean,
  updateGenre: {
    type: Object,
    required: true,
  },
})

const emits = defineEmits(['close', 'update'])

const closeModal = () => {
  emits('close')
}

const handleUpdateGenre = (id: string) => {
  emits('update')
}
</script>

<template>
  <!-- Main modal -->
  <div
    v-show="isVisible"
    id="modal-update"
    style="
      position: fixed;
      top: 0;
      left: 0;
      width: 100%;
      height: 100%;
      background: rgba(0, 0, 0, 0.5);
      display: flex;
      justify-content: center;
      align-items: center;
      z-index: 1000;
    "
  >
    <div
      style="
        background: white;
        padding: 20px;
        border-radius: 20px;
        box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.3);
        width: 900px;
      "
    >
      <div
        class="flex items-center justify-between p-4 md:p-5 border-b rounded-t dark:border-gray-600 border-gray-200"
      >
        <div style="width: 100%; display: flex; align-items: center">
          <img
            src="https://cdn-icons-png.flaticon.com/256/5362/5362466.png"
            alt="imade"
            style="width: 50px; height: 50px; margin-right: 10px"
          />
          <span style="font-size: 30px; font-weight: 600"> Cập nhật thể loại</span>
        </div>
        <button
          @click="closeModal('modal-update')"
          type="button"
          class="text-gray-400 bg-transparent hover:bg-gray-200 hover:text-gray-900 rounded-lg text-sm w-8 h-8 ms-auto inline-flex justify-center items-center dark:hover:bg-gray-600 dark:hover:text-white"
        >
          <svg
            class="w-3 h-3"
            aria-hidden="true"
            xmlns="http://www.w3.org/2000/svg"
            fill="none"
            viewBox="0 0 14 14"
          >
            <path
              stroke="currentColor"
              stroke-linecap="round"
              stroke-linejoin="round"
              stroke-width="2"
              d="m1 1 6 6m0 0 6 6M7 7l6-6M7 7l-6 6"
            />
          </svg>
          <span class="sr-only">Close modal</span>
        </button>
      </div>
      <!-- Modal body -->
      <div style="height: 300px; padding: 30px">
        <div>
          <div>
            <div>
              <label
                for="first_name"
                class="block mb-2 text-sm font-medium text-gray-900 dark:text-white"
                >Tên Diễn Viên</label
              >
              <input
                v-model="updateGenre.name"
                type="text"
                id="first_name"
                class="detail-actor-input bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
                required
              />
            </div>
          </div>
        </div>
      </div>

      <!-- Modal footer -->
      <div
        style="
          display: flex;
          justify-content: end;
          margin-top: 30px;
          border-top: 1px solid var(--color-gray-200);
          padding-top: 20px;
        "
      >
        <button
          @click="handleUpdateGenre(updateGenre.id)"
          type="button"
          class="text-white bg-blue-700 hover:bg-blue-800 focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center dark:bg-blue-600 dark:hover:bg-blue-700 dark:focus:ring-blue-800"
        >
          Cập nhật
        </button>
        <button
          @click="closeModal('modal-update')"
          type="button"
          class="py-2.5 px-5 ms-3 text-sm font-medium text-gray-900 focus:outline-none bg-white rounded-lg border border-gray-200 hover:bg-gray-100 hover:text-blue-700 focus:z-10 focus:ring-4 focus:ring-gray-100 dark:focus:ring-gray-700 dark:bg-gray-800 dark:text-gray-400 dark:border-gray-600 dark:hover:text-white dark:hover:bg-gray-700"
        >
          Đóng
        </button>
      </div>
    </div>
  </div>
</template>
