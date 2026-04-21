FROM nginx:alpine

RUN rm -rf /usr/share/nginx/html/*

COPY dist/formulaire-ui/browser/ /usr/share/nginx/html/

# Copie la config nginx avec le fallback SPA (try_files → index.html)
COPY nginx.conf /etc/nginx/nginx.conf

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]