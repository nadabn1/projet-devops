FROM nginx:alpine

# nettoyer nginx
RUN rm -rf /usr/share/nginx/html/*

# copier directement le contenu du browser (pas le dossier)
COPY ./dist/formulaire-ui/browser/* /usr/share/nginx/html/

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]