# books-fargate-api

## Generate docker 

### Build jar file
```
./mvnw clean package
```

### build docker image
```
docker build -t luizimcpi/booksapp .
```

### test app docker local
```
docker run -p 8080:8080 --rm luizimcpi/booksapp

in a browser
http://localhost:8080/books
```

### create ecr repository
[Create ECR Repository](https://aws.amazon.com/pt/ecr/) 

### Push Local docker Image to ECR 
```
aws ecr get-login-password --region us-east-1 | docker login --username AWS --password-stdin aws_account_id.dkr.ecr.us-east-1.amazonaws.com
docker build -t luizimcpi/booksapp . (already performed in previous steps)
docker tag luizimcpi/booksapp:latest aws_account_id.dkr.ecr.us-east-1.amazonaws.com/booksapp:latest
docker push aws_account_id.dkr.ecr.us-east-1.amazonaws.com/booksapp:latest

*if you are using another region change us-east-1 in the steps above
*change aws_account_id in the steps above
```

### create new task definition fargate on ecs
[Create Task ECS](https://aws.amazon.com/pt/ecs/)