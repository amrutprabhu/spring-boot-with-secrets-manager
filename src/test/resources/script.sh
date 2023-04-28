#!/bin/bash
awslocal secretsmanager create-secret --region eu-central-1 --name /secret/spring-boot-app --secret-string '{"property1": "property1-value", "property2": "property2-value"}'
awslocal secretsmanager create-secret --region eu-central-1 --name /secret/db-credential --secret-string '{"dbuser": "user1", "dbpassword": "password"}'