FROM ubuntu
MAINTAINER Zydiii

ADD gs-securing-web-0.1.0.jar /HW/WordLadder/WordLadder.jar
ADD jdk-12.0.1 /HW/WordLadder/jdk-12.0.1

EXPOSE 8088

ENV JAVA_HOME /HW/WordLadder/jdk-12.0.1
ENV CLASSPATH .:$JAVA_HOME/lib/
ENV PATH $JAVA_HOME/bin:$PATH

CMD "java" "-jar" "/HW/WordLadder/WordLadder.jar"
