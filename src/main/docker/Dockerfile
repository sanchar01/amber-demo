FROM java:8
VOLUME /tmp/tomcat
ADD amber-demo-0.0.1-SNAPSHOT.jar amber-demo.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/amber-demo.jar"]