# Spring-boot_Security
Spring Security is a framework that provides authentication, authorization, and protection to limited acces to our data.

add springboot security dependency on pom file.

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
		</dependency>
    
override default username and password in application.properties file
#override the password
spring.security.user.name=user
spring.security.user.password=user123
