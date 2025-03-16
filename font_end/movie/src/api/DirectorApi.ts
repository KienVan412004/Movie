import axiosAll from './Axios'

class DirectorApi {
  static getAllDirector(page: number, size: number, name: string) {
    const url = 'director/'
    return axiosAll.get(url, { params: { page, size, name } })
  }

  static createDirector(data: any) {
    const url = 'director/create'
    return axiosAll.post(url, data)
  }

  static updateDirector(data: any, id: string) {
    const url = `director/update/${id}`
    return axiosAll.put(url, data)
  }

  static getDirectorById(id: string) {
    const url = `director/get-one/${id}`
    return axiosAll.get(url)
  }
}
export default DirectorApi
