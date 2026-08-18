FROM nginx:latest

CMD sh -c 'echo "Container Name: $(hostname)<br>" > /usr/share/nginx/html/index.html && echo "Container IP: $(hostname -i)<br>" >> /usr/share/nginx/html/index.html && echo "Date: $(date)" >> /usr/share/nginx/html/index.html && nginx -g "daemon off;"'

EXPOSE 80
