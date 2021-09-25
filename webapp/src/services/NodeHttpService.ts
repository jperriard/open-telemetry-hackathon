import axios from 'axios';

const apiUrl = "http://localhost:8282/node/api"

class NodeHttpService {
  public async success(data: any): Promise<number> {
    try {
      const response = await axios.post(apiUrl + "/success", data);
      return response.status;
    } catch (error) {
      return Promise.reject(error);
    }
  }
  
  public async error(): Promise<number> {
    try {
      const response = await axios.get(apiUrl + "/error");
      return response.status;
    } catch (error) {
      return Promise.resolve(500);
    }
  }
}

export default new NodeHttpService();