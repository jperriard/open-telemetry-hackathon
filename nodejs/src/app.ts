import express from 'express';
import cors from 'cors';

const app = express();
app.use(express.json());
app.use(express.urlencoded({ extended: true }));
app.use(cors())

app.post('/node/api/success', (
  req: express.Request,
  res: express.Response) => {
    res.sendStatus(200);
})

app.get('/node/api/error', (
  req: express.Request,
  res: express.Response) => {
    res.sendStatus(500);
})

export default app;