# 使用官方的Node镜像作为基础镜像
FROM node:14.21.3-alpine as build-stage

# 安装构建所需的工具
RUN apk add --no-cache git

# 设置工作目录
WORKDIR /app

# 配置npm使用阿里云的镜像源
RUN npm config set registry https://registry.npmmirror.com

# 复制 package.json 和 package-lock.json 到工作目录
COPY package*.json ./

# 安装依赖
RUN npm install

# 复制项目文件到工作目录
COPY . .

# 构建Vue应用
RUN npm run build

# 基于Nginx创建一个新的镜像
FROM nginx:stable-alpine as production-stage

# 复制构建好的Vue应用到Nginx的默认站点目录
COPY --from=build-stage /app/dist /usr/share/nginx/html

# 复制自定义的Nginx配置文件到容器中
COPY docker/nginx.conf /etc/nginx/conf.d/default.conf

# 暴露端口
EXPOSE 80

# 启动Nginx
CMD ["nginx", "-g", "daemon off;"]
