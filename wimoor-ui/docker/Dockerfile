# 使用官方Nginx镜像作为基础镜像
FROM nginx:alpine

# 将dist目录下的文件复制到容器中的/usr/share/nginx/html目录下
COPY dist/ /usr/share/nginx/html/

# 复制自定义的Nginx配置文件到容器中
COPY docker/nginx.conf /etc/nginx/conf.d/default.conf

# 暴露80端口
EXPOSE 80

# 使用Nginx运行Vue应用
CMD ["nginx", "-g", "daemon off;"]