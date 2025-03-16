import axiosAll from './Axios'

class GenreApi {
  static getAllGenre(page: number, size: number, name: string) {
    const url = 'genre/'
    return axiosAll.get(url, { params: { page, size, name } })
  }

  static createGenre(data: any) {
    const url = 'genre/create'
    return axiosAll.post(url, data)
  }

  static getGenreById(id: string) {
    const url = `genre/get-one/${id}`
    return axiosAll.get(url)
  }

  static updateGenre(id: string, data: any) {
    const url = `genre/update/${id}`
    return axiosAll.put(url, data)
  }

  static deleteGenre(id: string) {
    const url = `genre/delete/${id}`
    return axiosAll.delete(url)
  }
}
export default GenreApi
