# 使用 tesseract4re 镜像作为基础镜像
FROM tesseractshadow/tesseract4re:latest

# 设置工作目录
WORKDIR /app

# 将项目所有内容复制到容器中
COPY . /app

# 更新包信息，安装 Maven，并使用 Maven 构建项目
RUN apt-get update && \
    apt-get install -y maven && \
    mvn clean install -T 12

# 暴露容器的端口（如果你的应用需要）
EXPOSE 7001

# 在容器内运行 Spring Boot 应用
CMD ["java", "-jar", "ocr-service/target/ocr-service-1.0.0-SNAPSHOT.jar"]

# docker build -t ocr-service:latest -f ocr-service/Dockerfile .

