
# Maven archetype project from command line

http://maven.apache.org/guides/getting-started/maven-in-five-minutes.html

## Create project:

````
mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
````

## Build
````
mvn package
````

## Run the code:

````
java -cp target/my-app-1.0-SNAPSHOT.jar com.mycompany.app.App
````

# Versions (tags):

1.0 - no changes to archetype
2.0 - Java 11 used
