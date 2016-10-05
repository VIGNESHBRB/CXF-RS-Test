# CXF-RS-Test

Issue faced in (TOMCAT + MAVEN)
WORKS -- When .war file is copied and deployed in tomcat webapps/
FAILS -- When using "Run on server" in eclipse. Throws class not found exception as the class was inside maven dependencies.

Resolved:
By changing project properties -> deployable assembly -> Add -> Java Build path libraries. So that Tomcat will now know which class holds servlet.
