FROM anapsix/alpine-java 
LABEL maintainer="Harry"
COPY /target/spring-basic-1.5.1.jar /home/spring-basic-1.5.1.jar 
CMD ["java","-jar","/home/spring-basic-1.5.1.jar"]

