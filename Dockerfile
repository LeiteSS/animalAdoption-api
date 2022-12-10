FROM eclipse-temurin:11
MAINTAINER leitess
COPY build/libs/animal-adoption-0.0.1-SNAPSHOT.jar animal-adoption-0.0.1-SNAPSHOT.jar
ADD data.mv.db  data.mv.db
ENTRYPOINT ["java","-jar","/animal-adoption-0.0.1-SNAPSHOT.jar"]