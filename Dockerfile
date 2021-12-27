FROM maven:latest
RUN mkdir /toystore
WORKDIR /toystore
COPY . .
EXPOSE 8080
CMD [ "mvn", "spring-boot run" ]