#!/bin/bash
function wait() {

    echo $3
    # 使用netcat (nc) 工具来检查端口是否开放
    while ! nc -z $1 $2; do
      # 端口不可用，等待1秒后重试
      sleep 1
    done
}

SCRIPT_DIR=$( dirname "${BASH_SOURCE[0]}" )
D=$SCRIPT_DIR/..
ARGS=-f docker-compose.yaml --env-file .env --env-file .env.win


echo $ARGS
# 加载数据库
docker-compose  $ARGS  up -d wimoor-mysql
# 等待本地端口3306可用
wait localhost 3306 "Waiting for MySQL to be available on port 3306..."

# 加载 nacos
docker-compose $ARGS up -d wimoor-nacos
wait localhost 8848 "Waiting for Nacos to be available on port 8848..."

# 加载 seata redis
docker-compose $ARGS up -d wimoor-seata wimoor-redis
sleep 1


echo "Executing subsequent commands..."