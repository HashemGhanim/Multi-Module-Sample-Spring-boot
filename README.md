# Multi-Module-Sample-Spring-boot
I have build a simple project using spring boot to cover the fundamentals of Multi Module Application and to know the advantages of multi module in complex or enterprise application

# The most advantages from using Multi-Module Application is :
## 1) Modularity
## 2) Reusability
## 3) Scalability
## 4) Maintainability
## 5) Testing
## 6) Reduced Complexity
more and more .. 

![Multi_Module_Maven_Project_structure](https://github.com/HashemGhanim/Multi-Module-Sample-Spring-boot/assets/72875896/a645b542-1568-4e52-9736-bd2ad4b25047)

### Multi-Module Application : is a project structure where a software application is organized into multiple smaller, self-contained modules.
so every module typically repersent distinct part of application functionality, These modules can be developed, tested and maintained independently.

When we need to use Spring boot to build an Multi-Module application using Maven tools, should use aggregator POM (Parent POM), using aggregator POM
enables us to manages a group of modules in the entry application, so every submodule can inhernt all properties, dependencies , plugins and so on.. 

#### Who Can Make Aggregator POM file ?
answer : you should make a maven project and modify the pom.xml file (Project Object Model : the heart fo maven project) adding ``` <packaging>pom</packaging> ```
so the pom.xml will be a parent POM file and all pom.xml files in submodules will inhernt from it.

#### Who Can Define Modules in Aggregator POM file ?
answer : using this
```
<modules>
    <module>summodule-name</module>
</module>

```
so the submodule will inhernt from POM(Parent).

#### Who Can Make Module ?
answer : using Spring Initializr you should choose the maven and inject the dependencies in thier pom.xml 

#### Can I Make Some Module As Library ?
answer : you can make it by delete  
```
<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>
```
from own pom.xml file and delete class that already annotated by ``` @SpringBootApplication ``` from Main and ``` @SpringBootTest ``` from Test.

#### What The Mean Of ``` <packaging>pom</packaging> ``` ?
answer : that used to indicate that the module is not intended to produce a build artifact (e.g., JAR, WAR) itself. Instead, it serves as a parent or aggregator module that groups together other submodules within a multi-module project.

References :
1) https://www.baeldung.com/maven-multi-module
