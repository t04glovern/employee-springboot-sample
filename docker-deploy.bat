echo Docker Authentication
Invoke-Expression -Command (aws ecr get-login --no-include-email --region us-east-1)

echo Building Maven Project
mvn clean compile
mvn package

echo Docker Build & Push
docker build -t employeeapi .
docker tag employeeapi:latest <aws-account-id>.dkr.ecr.us-east-1.amazonaws.com/employeeapi:latest
docker push <aws-account-id>.dkr.ecr.us-east-1.amazonaws.com/employeeapi:latest
