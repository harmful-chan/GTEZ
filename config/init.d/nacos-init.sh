#!/bin/bash

# 等待MySQL服务启动
apk add --no-cache curl unzip netcat-openbsd

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

#chmod a+x /init.d/nacos-config.sh
#source /init.d/nacos-config.sh -f default_seata.txt -h $NACOS_SERVICE_HOST -p $NACOS_SERVICE_PORT -g SEATA_GROUP -t SEATA_GROUP -u nacos -w nacos
source /init.d/nacos-config.sh -f config.txt -h $NACOS_SERVICE_HOST -p $NACOS_SERVICE_PORT -g SEATA_GROUP -t SEATA_GROUP -u nacos -w nacos


