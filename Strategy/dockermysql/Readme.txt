# Create MySQL container with following commands.
docker build -t pos-mysql:0.1 .
docker run --detach --name=posmysql --publish 6603:3306 pos-mysql:0.1

docker exec -it posmysql mysql -p