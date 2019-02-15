FROM java:8

ENV LANG C.UTF-8
EXPOSE 8080
#COPY target/ms-product-0.0.1-SNAPSHOT.jar app.jar
ADD target/ms-product-0.0.1-SNAPSHOT.jar  app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]
