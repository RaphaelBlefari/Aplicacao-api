FROM openjdk:8-jre-alpine
ENV TZ=America/Sao_Paulo
RUN echo ${TZ} > /etc/timezone
EXPOSE 9092
RUN adduser -Dh /home/root root
USER root
RUN export ENCRYPT_KEY=IMSYMMETRIC
CMD ["java", "-jar", "app/Aplicacao-Base-0.0.2.jar"]
ADD target/Aplicacao-Base-0.0.2.jar /app/Aplicacao-Base-0.0.2.jar
