# Spring Boot With AWS Secrets Manager Integration 

In this example we look into how we can fetch database credentials from AWS Secrets Manager. 
We will also then run LocalStack on our system using docker, initialize it with secrets and start the applciation without 
communicating with the real AWS Secrets Manager service. 

We will then test our application using LocalStack Container.

Command to conect to localstack :
```shell

```

## Changelog

-----
### Sprng Boot 3.0 Update

- Change mount file location for localstack. Noticed `/docker-entrypoint-initaws.d` was not working.
- Script to initialize localstack must be now executable. hence updated permissions.
- Annotating `@restController("/")` was not working, So moved the paths to the individuals mappings.
 