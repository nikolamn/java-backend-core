# Task API 


## Create a new task

curl -X POST -i http://localhost:8080/api/task/new \
-H "Content-Type: application/json" \
-d '{"title":"Finish Project", "dueDate":"2026-08-14"}'

## Fetch all tasks

curl -X GET http://localhost:8080/api/task/all