After the huge response and viewership for my earlier article https://dzone.com/articles/spring-boot-restful-web-service-example I have decided to write a new article with all the REST calls example respectively GET, POST, PUT and DELETE. 

Prerequisites for this project:

1. If you have Eclipse, download the STS plug-in from here https://marketplace.eclipse.org/content/spring-tools-aka-spring-ide-and-spring-tool-suite

2. If you don’t have Eclipse, download STS from here https://spring.io/guides/gs/sts/

3. Download the latest JDK from here http://www.oracle.com/technetwork/java/javase/downloads/index.html

4. Also for testing please download and install SOAPUI tool from here https://www.soapui.org/downloads/soapui.html

The first example I am going to explain is about HTTP GET request, second example will be about HTTP POST request, third example about HTTP PUT request and fourth example is for HTTP DELETE request. In these entire examples I am going to use JSON Representation.

Before checkout this project create a folder under C drive like C:\Projects
 
Now open command prompt

1. cd c:\Projects
2. check out the mail branch
3. cd spring-boot-rest-2
4. Execute - mvnw clean package
5. start the server - java -jar target\spring-boot-rest-2-0.0.1-SNAPSHOT.jar
