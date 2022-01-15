FROM openjdk:11.0.1
#COPY RestTemplateDemo/target/demoRestTemplateProject-1.0.jar
#COPY RestTemplate2/target/RestTemplate2-1.0.jar
#ENTRYPOINT ["java","-jar","/message-server-1.0.0.jar"]
    # add files to image
ADD RestTemplateDemo/target/demoRestTemplateProject-1.0.jar .
ADD RestTemplate2/target/RestTemplate2-1.0.jar .
ADD start.sh .

    # start on run
CMD ["bash", "start.sh"]