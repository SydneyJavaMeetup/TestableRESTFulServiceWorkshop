# Testable RESTful service Workshop

Notes and examples for the Sydney Java Meetup's Testable RESTful service workshop

## Prerequesites

* Java SE JDK 8  (https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* Maven 3.5 (http://maven.apache.org/download.cgi)
* IntelliJ / Eclipse (https://www.jetbrains.com/idea/download)
  - workshop demos done in IntelliJ
* Enthusiasm!

## Warm up

**If you haven't setup your Prerequesites, now it is good time to do that**

Create a project with maven archetype (this is gonna take some time, so let's do it before introducing ActFramework)

```
mvn archetype:generate -B \
    -DgroupId=workshop \
    -DartifactId=bookmarkservice \
    -DarchetypeGroupId=org.actframework \
    -DarchetypeArtifactId=archetype-simple-restful-service \
    -DarchetypeVersion=1.8.8.10
```

After project generated, add the following dependency to the project:

```xml
    <dependency>
      <groupId>org.actframework</groupId>
      <artifactId>act-eclipselink</artifactId>
    </dependency>
```

Now run `mvn compile` to download dependencies - this is gonna take some time.

## Discussion

What defines an idea Web framework in Java ?

## Part I - understanding the generated project

* Walk through project in IDEA
  - The source code
  - The testing scripts
* Introduce the commands
  - run_dev
  - run_prod
  - test
  - pack
  
## Part II - work out a bookmark service 

* Create test script
* Add eclipselink dependency
* Define model 
* Create Dao for the model
* Create service endpoint

# BREAK

## Part III - Add authentication

* Create Before interceptor
* Create login endpoint
* Make our app support JWT
* Update test script

## Part IV - more sophisticated security with act-aaa

* The User model
* Add service/command to create user - for admin port
* Update login endpoint
* Update test script
