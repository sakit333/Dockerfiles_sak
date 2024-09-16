FROM golang:1.16-alpine
WORKDIR /app
COPY hello_devops.go .
RUN go build hello_devops.go
CMD ["./hello_devops"]
