import axiosAll from './Axios'

class actorApi {
  static getAllActor(page: number, size: number, name: string) {
    const url = 'actor/'
    return axiosAll.get(url, { params: { page, size, name } })
  }
  static addActor(data: any) {
    const url = 'actor/create'
    return axiosAll.post(url, data)
  }
  static removeActor(id: string) {
    const url = `actor/delete/${id}`
    return axiosAll.delete(url)
  }
  static updateActor(id: string, data: any) {
    const url = `actor/update/${id}`
    return axiosAll.put(url, data)
  }
  static getOneActor(id: string) {
    const url = `actor/get-one/${id}`
    return axiosAll.get(url)
  }
}
export default actorApi
