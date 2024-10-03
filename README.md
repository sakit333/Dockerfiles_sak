# Docker Installation
---
```bash
sudo yum update -y
sudo yum search docker
sudo yum info docker
sudo yum install -y docker
sudo systemctl enable docker.service
sudo systemctl start docker.service
sudo systemctl status docker.service
docker --version
sudo yum install git -y
sudo curl -L https://github.com/docker/compose/releases/download/1.22.0/docker-compose-$(uname -s)-$(uname -m) -o /usr/local/bin/docker-compose
sudo chmod +x /usr/local/bin/docker-compose
docker-compose --version
```

### For Sample Dockerfile for various Applications
---
FROM: Specifies the base image for the Docker container.
  - Example: FROM openjdk:11-jdk-slim sets the base environment to Java 11 JDK.

WORKDIR: Sets the working directory inside the container.
  - Example: WORKDIR /app makes /app the default working directory.

COPY: Copies files or directories from the host machine to the container.
  - Example: COPY . . copies all files from the current directory on the host to the container.

RUN: Executes a command inside the container during the build process.
  - Example: RUN pip install -r requirements.txt installs dependencies listed in requirements.txt.

CMD: Specifies the default command to execute when the container starts.
  - Example: CMD ["python", "app.py"] runs the Python application.

EXPOSE: Indicates the port the container will listen on at runtime.
  - Example: EXPOSE 8080 tells Docker that the application will use port 8080.

ENTRYPOINT: Configures a container to run as an executable (not used in the provided Dockerfiles but useful for more complex setups).
  - Example: ENTRYPOINT ["./entrypoint.sh"] runs a script as the main process in the container.
