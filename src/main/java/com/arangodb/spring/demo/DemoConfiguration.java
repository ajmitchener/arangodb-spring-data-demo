/**
 *@Description: configuration class to set up everything to connect to our ArangoDB instance and to declare that all needed Spring Beans are processed by the Spring container.
 */
package com.arangodb.spring.demo;
 
import com.arangodb.ArangoDB;
import com.arangodb.springframework.annotation.EnableArangoRepositories;
import com.arangodb.springframework.config.ArangoConfiguration;
import org.springframework.context.annotation.Configuration;
 
@Configuration
@EnableArangoRepositories(basePackages = {"com.arangodb.spring.demo"}) //define where to locate spring repositories
public class DemoConfiguration implements ArangoConfiguration {
 
    @Override
    public ArangoDB.Builder arango() { //Method to configure the connection to the ArangoDB instance
        return new ArangoDB.Builder().host("localhost", 8529).user("root").password(null);
    }
 
    @Override
    public String database() { //Method to define the database name
        return "spring-demo";
    }
}
