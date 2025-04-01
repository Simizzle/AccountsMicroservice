FROM eclipse-temurin:21

# Information around who maintains the image
LABEL "org.opencontainers.image.authors"="simonjmorgan"

# Add the applicaton jar to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar /

EXPOSE 8080
# Execute the application
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]