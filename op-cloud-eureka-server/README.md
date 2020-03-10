# op-cloud-eureka-server

spring cloud 注册中心



运行方式调优 ：
## dev  
nohup java -server -Xms128m -Xmx128m  -XX:MaxMetaspaceSize=100M -XX:MetaspaceSize=100M -XX:+UseG1GC -XX:MaxGCPauseMillis=100  -Xloggc:/servers/op-cloud/op-cloud-eureka-server/logs/gc.log -XX:-HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/servers/op-cloud/op-cloud-eureka-server/logs/HeapDumpOnOutOfMemoryError -jar op-cloud-eureka-server-app.jar --spring.profiles.active=dev &  
## uat  
nohup java -server -Xms128m -Xmx128m  -XX:MaxMetaspaceSize=100M -XX:MetaspaceSize=100M -XX:+UseG1GC -XX:MaxGCPauseMillis=100  -Xloggc:/servers/op-cloud/op-cloud-eureka-server/logs/gc.log -XX:-HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/servers/op-cloud/op-cloud-eureka-server/logs/HeapDumpOnOutOfMemoryError -jar op-cloud-eureka-server-app.jar --spring.profiles.active=uat &  
## prod 
nohup java -server -Xms128m -Xmx128m  -XX:MaxMetaspaceSize=100M -XX:MetaspaceSize=100M -XX:+UseG1GC -XX:MaxGCPauseMillis=100  -Xloggc:/servers/op-cloud/op-cloud-eureka-server/logs/gc.log -XX:-HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/servers/op-cloud/op-cloud-eureka-server/logs/HeapDumpOnOutOfMemoryError -jar op-cloud-eureka-server-app.jar --spring.profiles.active=prod &  





## 老方式：
export JAVA_OPTS="-server -Xms128m -Xmx128m -XX:MaxMetaspaceSize=100M -XX:MetaspaceSize=100M -XX:+UseG1GC -XX:MaxGCPauseMillis=100 -Xloggc:/servers/java/op-store/tomcat7-store-8600-node1/logs/gc.log -XX:-HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/servers/java/op-store/tomcat7-store-8600-node1/logs/HeapDumpOnOutOfMemoryError"





