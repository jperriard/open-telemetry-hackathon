FROM node:15-alpine

WORKDIR /usr/src/app/

COPY package.json .
RUN npm i

COPY . .
RUN npm run build

EXPOSE 8282 

CMD ["npm", "run", "start"]
