FROM registry.viavarejo.com.br:5000/vv-server-jre:latest
ENV TZ=America/Sao_Paulo
RUN echo ${TZ} > /etc/timezone
EXPOSE 8082
RUN adduser -Dh /home/vvjornada vvjornada
USER vvjornada
RUN export ENCRYPT_KEY=IMSYMMETRIC
CMD ["java", "-Xmx768m", "-Xms512m", "-jar", "/app/vv-carrinho.jar", "--spring.profiles.active=docker"]
ADD target/vv-carrinho.jar /app/vv-carrinho.jar
