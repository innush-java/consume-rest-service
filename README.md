# consume-rest-service

This example explains how to consume the REST service using RestTemplate in Spring Boot.
1. Download the project, Go to Command prompt --> gradlew clean build.
2. Jar file will create in \build\libs folder after the successful build.
3. Now run the jar using --> java -jar path of the jar file

You can start testing Once the service is up...

1.  http://localhost:8080/invoke  --> This will return POJO String --> { "userId": 1, "id": 1, "title": "delectus aut autem", "completed": false }
2.  http://localhost:8080/invokeAndReturnResponseObject --> This will return POJO class --> {"userId":1,"id":1,"title":"delectus aut autem","completed":false}
3.  http://localhost:8080/invokeAndReturnResponseObjectList --> This will return List of objects or array of objects. --> 

[{"userId":1,"id":1,"title":"delectus aut autem","completed":false},
{"userId":1,"id":2,"title":"quis ut nam facilis et officia qui","completed":false},
{"userId":1,"id":3,"title":"fugiat veniam minus","completed":false},
{"userId":1,"id":4,"title":"et porro tempora","completed":true}
]

