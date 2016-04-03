Spring MVC Initializer Example
==============================

Basic Spring MVC 4.0.x application using `WebApplicationInitializer` instead of `web.xml`.

Check out [kielczewski.eu/blog](http://kielczewski.eu/blog)!

Requirements
------------
* [Java Platform (JDK) 7](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
* [Apache Maven 3.x](http://maven.apache.org/)

Quick start
-----------
1. `mvn jetty:run`
2. Point your browser to [http://localhost:8080/](http://localhost:8080/)


---------------------------------
<?xml version="1.0" encoding="ISO-8859-1" standalone="no"?>
<web-app xmlns="http://java.sun.com/xml/ns/javaee" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
 version="3.0" xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd" metadata-complete="false">

    <display-name>my app</display-name>
    
    <description>my app</description>

    <context-param>
        <param-name>defaultHtmlEscape</param-name>
        <param-value>true</param-value>
    </context-param>
    
    <session-config>
        <session-timeout>30</session-timeout>
    </session-config>
    
    <error-page>
        <exception-type>java.lang.Exception</exception-type>
        <location>/uncaughtException</location>
    </error-page>
    
    <error-page>
        <error-code>404</error-code>
        <location>/resourceNotFound</location>
    </error-page>
</web-app>
-------------