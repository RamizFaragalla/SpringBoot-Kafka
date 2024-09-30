# SpringBoot and Kafka
## The purpose of this project is to learn more about Kafka.

### Steps for running this application
#### 1. Setup the environment using docker
```
docker-compose up -d
```

#### 2. Run the Maven Spring Boot application
```
mvn clean install
mvn spring-boot:run
```

#### 3. Make a `POST` request to send a message to the Kafka topic
```py
POST http://localhost:8080/api/v1/messages
```
```json
{
    "message": "demo message"
}

```

#### 4. Check the application logs, the message that was sent should be displayed
```
Listener received: demo message
```
