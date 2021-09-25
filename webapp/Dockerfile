FROM node:15-alpine as build

WORKDIR /usr/src/app/

COPY package.json .
RUN npm i

COPY . .
RUN npm run build

FROM nginx:stable-alpine

COPY --from=build /usr/src/app/dist /usr/share/nginx/html

RUN rm /etc/nginx/conf.d/default.conf 

COPY nginx/nginx.conf /etc/nginx/conf.d

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
