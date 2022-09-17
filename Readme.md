# Spring Boot With AWS Secrets Manager Integration 

In this example we look into how we can fetch database credentials from AWS Secrets Manager. 
We will also then run LocalStack on our system using docker, initialize it with secrets and start the applciation without 
communicating with the real AWS Secrets Manager service. 

We will then test our application using LocalStack Container.