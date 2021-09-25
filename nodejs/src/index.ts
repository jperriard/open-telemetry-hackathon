import * as http from 'http';
import app from './app';

const httpServer = http.createServer(app);
const port = process.env.PORT || 8282;

httpServer.listen(port, () => {
  console.log('Start server on', { port });
});

