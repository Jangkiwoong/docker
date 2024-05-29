FROM openjdk:17-jdk
#관리자(매니저) 명시
LABEL maintainer="kiwoong"

#JAR_FILE이라는 변수명 선언, 초기화
ARG JAR_FILE=build/libs/docker-0.0.1-SNAPSHOT.jar

# 작업 디렉터리 설정
WORKDIR /app

# JAR 파일 복사
COPY ${JAR_FILE} docker-springboot.jar

# 애플리케이션 실행
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "docker-springboot.jar"]
