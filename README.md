# Alfresco Simple JDBC client for Insight Engine

This is simple project using Alfresco JDBC Client for Insight Engine.

## Configuring

This program uses Enterprise artifacts from Alfresco Nexus Repository (Maven) and Docker Images from Quay.io.

Developer credentials are required in order to compile and run the project:

* https://docs.alfresco.com/sdk2.1/tasks/alfresco-sdk-tutorials-configure-maven-enterprise.html
* https://docs.alfresco.com/6.2/concepts/deploy-prereqs.html

## Executing Docker Compose

Before running the program, start Docker Compose with Alfresco Enterprise and Insight Engine services.

```
$ docker-compose up --build --force-recreate
```

Once Docker is up & running, following URL should be available:

http://localhost:8080/alfresco

Use credentials admin/admin

## Compiling

Java 8 is required.

```
$ mvn clean package
```

## Execution

```
$ java -jar target/solr-jdbc-client-0.0.1-SNAPSHOT-jar-with-dependencies.jar

815
budget.xls, 2011-02-15 21:35:26.467
budget.xls discussion, 2011-02-16 10:30:10.642
Budget Files, 2011-02-15 20:50:25.839
```

Sample output will be shown in the output from the results of the sample queries.
