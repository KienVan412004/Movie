import axios from 'axios'

const axiosAll = axios.create({
  baseURL: 'http://localhost:8080/api/',
})
export default axiosAll
