import axiosAll from './Axios'

class actorApi {
  static getAllActor() {
    const url = 'actor/'
    return axiosAll.get(url)
  }
}
export default actorApi
