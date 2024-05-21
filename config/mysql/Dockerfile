FROM mysql:5.7.40
LABEL authors=$AUTHORS



# nacos Mysql 初始化数据库
ADD /nacos/mysql-schema.sql /docker-entrypoint-initdb.d/nacos-mysql.sql
RUN chown -R mysql:mysql /docker-entrypoint-initdb.d/nacos-mysql.sql
COPY my.cnf /etc/my.cnf

# wimoor 初始化数据库
COPY /schema/version1.1/* /docker-entrypoint-initdb.d/
COPY /schema/version2.0/* /docker-entrypoint-initdb.d/
COPY /schema/db_quartz.sql /docker-entrypoint-initdb.d/
COPY /schema/db_seata.sql /docker-entrypoint-initdb.d/

EXPOSE 3306

CMD ["mysqld", "--character-set-server=utf8", "--collation-server=utf8_general_ci"]
#CMD ["mysqld"]