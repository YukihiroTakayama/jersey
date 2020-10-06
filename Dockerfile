FROM ubuntu
RUN apt-get update
RUN apt-get -y install openjdk-8-jdk
RUN mkdir /app
WORKDIR /app