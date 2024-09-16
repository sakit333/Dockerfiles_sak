FROM golang:1.16-alpine
WORKDIR /app
COPY . .
RUN go mod init hello-devops
RUN go build -o hello-devops .
CMD ["./hello-devops"]
