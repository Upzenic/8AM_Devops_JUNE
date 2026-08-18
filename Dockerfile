FROM nginx:latest

RUN echo "hello docker from Akash" > /usr/share/nginx/html/index.html

EXPOSE 80
