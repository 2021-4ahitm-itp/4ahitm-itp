mvn io.quarkus:quarkus-maven-plugin:1.9.2.Final:create \
    -DprojectGroupId=at.htl \
    -DprojectArtifactId=vehicle \
    -DclassName="at.htl.vehicle.boundary.GreetingResource" \
    -Dpath="/hello"
    -Dextensions="quarkus-resteasy,quarkus-resteasy-jsonb,jdbc-postgresql,hibernate-orm-panache"
