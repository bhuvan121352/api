# Use an official Tomcat image as the base
FROM tomcat:9.0

# Copy the WAR file to the webapps directory
COPY target/iot-device-registration.war /usr/local/tomcat/webapps/

# Expose the port that Tomcat runs on
EXPOSE 8080

# Start Tomcat
CMD ["catalina.sh", "run"]
