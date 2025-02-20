import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import Account from '@/views/account/Account.vue'
import MovieVue from '@/views/movie/Movie.vue'
import RoomVue from '@/views/room/Room.vue'
import ShowtimeVue from '@/views/showtime/Showtime.vue'
import BookingVue from '@/views/booking/Booking.vue'
import DashboardVue from '@/views/dashboard/Dashboard.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView,
    },
    {
      path: '/account',
      name: 'account',
      component: Account,
    },
    {
      path: '/movie',
      name: 'movie',
      component: MovieVue,
    },
    {
      path: '/room',
      name: 'room',
      component: RoomVue,
    },
    {
      path: '/showtime',
      name: 'showtime',
      component: ShowtimeVue,
    },
    {
      path: '/booking',
      name: 'booking',
      component: BookingVue,
    },
    {
      path: '/dashboard',
      name: 'dashboard',
      component: DashboardVue,
    },
    {
      path: '/about',
      name: 'about',
      // route level code-splitting
      // this generates a separate chunk (About.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import('../views/AboutView.vue'),
    },
  ],
})

export default router
