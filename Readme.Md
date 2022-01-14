This is simple rest template spring boot application.
It has two independent microservices and they communicate using the http protocol provided by rest template.

Running Instruction-> 
1. Run Rest Template Demo app 
2. Run Rest Template 2 application and go to below url:
--> localhost:8081/userInfo/getFromRestById?userId=<userId(int)>
  _**Success Response:**_ 
![img_1.png](img_1.png)
3. The data for userid {1,2,3} is available in application right now, if any other id provided user info will be null with status message "NOT_FOUND"
_**Failure Response:_**
![img.png](img.png)