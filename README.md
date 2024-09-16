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
