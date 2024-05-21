#!/bin/bash

# 等待MySQL服务启动
yum install -y unzip nc

until nc -z -v -w30 $NACOS_SERVICE_HOST $NACOS_SERVICE_PORT
do
  echo "Waiting for nacos connection..."
  sleep 5
done





curl --location --request POST "http://$NACOS_SERVICE_HOST:$NACOS_SERVICE_PORT/nacos/v1/cs/configs?import=true&namespace=" \
--form 'policy=OVERWRITE' \
--form 'file=@/init.d/DEFAULT_GROUP.zip'


# 创建SEATA_GROUP命名空间
curl -X POST "http://$NACOS_SERVICE_HOST:$NACOS_SERVICE_PORT/nacos/v1/console/namespaces" \
  -d "customNamespaceId=SEATA_GROUP&namespaceName=SEATA_GROUP&namespaceDesc=Description for SEATA_GROUP"

curl --location --request POST "http://$NACOS_SERVICE_HOST:$NACOS_SERVICE_PORT/nacos/v1/cs/configs?import=true&namespace=SEATA_GROUP&group=SEATA_GROUP" \
--form 'policy=OVERWRITE' \
--form 'file=@/init.d/SEATA_GROUP.zip'



## 解压并导入SEATA_GROUP.zip
#if [ ! -d "/init.d/tmp/SEATA_GROUP" ]; then
#  unzip /init.d/SEATA_GROUP.zip -d /init.d/tmp/
#fi
#
#rm -rf /init.d/default_seata.txt
#for file in /init.d/tmp/SEATA_GROUP/*; do
#  data_id=$(basename "$file")
#  content=$(cat "$file")
#  echo "$data_id=$content" >>/init.d/default_seata.txt
#done

#source /init.d/nacos-config.sh -f default_seata.txt -h $NACOS_SERVICE_HOST -p $NACOS_SERVICE_PORT -g SEATA_GROUP -t SEATA_GROUP -u nacos -w nacos
source /init.d/nacos-config.sh -f config.txt -h $NACOS_SERVICE_HOST -p $NACOS_SERVICE_PORT -g SEATA_GROUP -t SEATA_GROUP -u nacos -w nacos

