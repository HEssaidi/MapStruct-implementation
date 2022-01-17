### Mapper annotation

This annotation will tell MapStruct to generate the implementation class for the interface.



Should add 2 dependencies <br/>
```
<dependency>
<groupId>org.mapstruct</groupId>
<artifactId>mapstruct</artifactId>
<version>${org.mapstruct.version}</version>
</dependency>
<dependency>
<groupId>org.mapstruct</groupId>
<artifactId>mapstruct-processor</artifactId>
<version>${org.mapstruct.version}</version>
</dependency>
```
if the red line on the constructor bothers you can add an empty constructor
You can add componentModel in the @Mapper annotation on the interface / abstract class.
`(componentModel = "spring")` <br/>
Following these instructions, class attributes are not mapped; for that we should add : <br/>
```
<dependency>
<groupId>org.projectlombok</groupId>
<artifactId>lombok-mapstruct-binding</artifactId>
<version>0.2.0</version>
</dependency>
``` 
Choose any valid version  !

@Mapping annotation, will use it to add the target and source attribute.