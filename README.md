Regarding https://issues.apache.org/jira/browse/CAMEL-14299

to flip between the cases, comment/uncomment as appropriate

* property section: camel.version
* artifact section: camel-spring-boot-starter
* MyRoute.java: one from with to() and other with toD()
* check h2 table via http://localhost:8080/h2c with "select * from tmp"
