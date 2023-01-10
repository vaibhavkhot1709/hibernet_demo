package com.hibernet_demo;

public class Connection {

/* hibernate.cfg.xml >>>>>>>>>
	 
	  <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE hibernate-configuration PUBLIC
	"-//Hibernate/Hibernate Configuration DTD 3.0//EN"
	"http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">

<hibernate-configuration>
	<session-factory>
	
		<property name="connection.driver_class">com.mysql.jdbc.Driver</property>
		<property name="connection.url">jdbc:mysql://localhost:/newDB</property>
		<property name="connection.username">root</property>
		<property name="connection.password">1709</property>
		<property name="dialect">org.hibernate.dialect.MySQL8Dialect</property>
		<property name="hbm2ddl.auto">update</property>
		<property name="show_sql">true</property>
		<property name="format_sql">true</property>
		
		<mapping class="com.hibernet_demo.NewDBDemo"/>
	</session-factory>
</hibernate-configuration>
	 


pom.xml>>>> 
		
maven dependeciess>>>>>>>>>>> 

 <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>com.hibernet</groupId>
	<artifactId>hibernet_demo</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<dependencies>
	
hibernate dependency>>>>>>>>>>>>> 

		<!-- https://mvnrepository.com/artifact/org.hibernate/hibernate-core -->
		<dependency>
			<groupId>org.hibernate</groupId>
			<artifactId>hibernate-core</artifactId>
			<version>5.6.10.Final</version>
		</dependency>

		<!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>8.0.31</version>
		</dependency>

   	</dependencies>
 </project>
	*/
	




}
