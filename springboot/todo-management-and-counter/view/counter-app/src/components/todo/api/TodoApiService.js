import axios from 'axios'

const apiClient = axios.create(
    {
        baseURL: 'http://localhost:8080'
    }
)

export const retrieveAllTodosForUsernameApi
    = (username) => apiClient.get(`/users/${username}/todos`)

    export const deletTodoApi 
    = (username, id) => apiClient.delete(`/users/${username}/todos/${id}`)