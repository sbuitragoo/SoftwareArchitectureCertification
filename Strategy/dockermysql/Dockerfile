#Create MySQL Image for pos Application
FROM mysql
MAINTAINER cesarvefe@mail.com

ENV MYSQL_ROOT_PASSWORD pospassword
ADD pos.sql /docker-entrypoint-initdb.d

EXPOSE 3306