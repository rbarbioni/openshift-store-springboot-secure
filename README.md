Openshift Java Store-Api REST Application
=============

This is a starter template for developing Spring framework applications on OpenShift. It uses the latest Spring framework release i.e. 4.2.2.RELEASE.
The project configures Spring application using WebApplicationInitializer. There is no web.xml in this project and everything is configured using annotations.

Features:
-------

* Spring 4.2.2;
* Spring Data JPA
* No Spring XML configuration;
* Persistence JPA 2;
* Hibernate 5;
* Jackson REST;
* 100% Annotations configurations;
* MYSQL;
* Initializing data SQL script;
* Logback

Instructions
-------

* Create account https://www.openshift.com/app/account/new
* Install rhc client tools https://developers.openshift.com/en/managing-client-tools.html
* rhc create-app storemysql tomcat-7 mysql-5.5 phpmyadmin-4 --from-code https://github.com/rbarbioni/openshift-store-mysql.git
* Import your favorite IDE compatible MAVEN projects.
* Change code, commit and push

Mysql Configurations
-------

Connect Mysql database
Execute:
CREATE SCHEMA api;

Open file application.properties and change datasource configuration
---------------------

>spring.datasource.url=jdbc:mysql://localhost:3306/api?autoreconnect=true 
>spring.datasource.username=YOUR_MYSQL_USER 
>spring.datasource.password=YOUR_MYSQL_PASSWORD 

Openshift
-------
>commit -m "initial Commit"
>push -u origin master

