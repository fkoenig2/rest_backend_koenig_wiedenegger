# Nimm ein Java-Basis-Image
FROM amazoncorretto:25-alpine-jdk
LABEL version="1.0"

# Füge Pakete hinzu (aus der Vorlage])
RUN apk add --no-cache tzdata fontconfig freetype font-noto ttf-liberation busybox-extras curl
ENV TZ=Europe/Vienna

# BESTIMME, welches JAR kopiert werden soll (aus dem Maven Standard-Ordner 'target')
ARG JAR_FILE=target/*.jar

# Kopiere dieses JAR in das Image in den Ordner /jar/
COPY ${JAR_FILE} /jar/backend.jar

# Definiere den Startbefehl (aus der Vorlage])
ENTRYPOINT ["java","-Xms1024M","-Xmx2048M","-jar","/jar/backend.jar"]