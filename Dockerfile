FROM 192.168.2.104:1180/base/jre8:latest
VOLUME /tmp
COPY target/*.jar springboot-demo.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/springboot-demo.jar"]