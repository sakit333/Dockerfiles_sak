from flask import Flask
app = Flask(__name__)

@app.route('/')
def hello_devops():
    return 'Hello DevOps'

if __name__ == "__main__":
    app.run(host='0.0.0.0')
