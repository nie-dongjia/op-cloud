# op-cloud-gateway-server

gateway 
加入 spring-cloud-starter-netflix-eureka-client 依赖：提供和注册服务
加入 spring-cloud-starter-gateway 依赖：gateway
加入 spring-boot-starter-data-redis-reactive 依赖：结合 Redis 限流
加入 spring-cloud-starter-netflix-hystrix 依赖：熔断器
 

运行方式调优 ：
## dev  
nohup java -server -Xms128m -Xmx128m  -XX:MaxMetaspaceSize=100M -XX:MetaspaceSize=100M -XX:+UseG1GC -XX:MaxGCPauseMillis=100  -Xloggc:/servers/op-cloud/op-cloud-base-micro-service/logs/gc.log -XX:-HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/servers/op-cloud/op-cloud-base-micro-service/logs/HeapDumpOnOutOfMemoryError -jar op-cloud-base-micro-service-app.jar --spring.profiles.active=dev &  
## uat  
nohup java -server -Xms128m -Xmx128m  -XX:MaxMetaspaceSize=100M -XX:MetaspaceSize=100M -XX:+UseG1GC -XX:MaxGCPauseMillis=100  -Xloggc:/servers/op-cloud/op-cloud-base-micro-service/logs/gc.log -XX:-HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/servers/op-cloud/op-cloud-base-micro-service/logs/HeapDumpOnOutOfMemoryError -jar op-cloud-base-micro-service-app.jar --spring.profiles.active=uat &  
## prod 
nohup java -server -Xms128m -Xmx128m  -XX:MaxMetaspaceSize=100M -XX:MetaspaceSize=100M -XX:+UseG1GC -XX:MaxGCPauseMillis=100  -Xloggc:/servers/op-cloud/op-cloud-base-micro-service/logs/gc.log -XX:-HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/servers/op-cloud/op-cloud-base-micro-service/logs/HeapDumpOnOutOfMemoryError -jar op-cloud-base-micro-service-app.jar --spring.profiles.active=prod &  





## 老方式：
export JAVA_OPTS="-server -Xms128m -Xmx128m -XX:MaxMetaspaceSize=100M -XX:MetaspaceSize=100M -XX:+UseG1GC -XX:MaxGCPauseMillis=100 -Xloggc:/servers/java/op-store/tomcat7-store-8600-node1/logs/gc.log -XX:-HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/servers/java/op-store/tomcat7-store-8600-node1/logs/HeapDumpOnOutOfMemoryError"


## 知识点 
gateway 中文官方文档
https://www.jianshu.com/p/6ff196940b67 


不要引入spring-boot-starter-web包，会导致Gateway启动抛出异常，错误如下。因为Spring Cloud Gateway 是使用 netty+webflux实现，webflux与web是冲突的
## 比较好的例子
https://blog.csdn.net/weixin_30342639/article/details/99303710 