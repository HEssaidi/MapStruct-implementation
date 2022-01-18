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
### Mapping Different Source and Target Fields
Often, model and DTO won't have the same field names. For our case, FullName field in the Employee class corresponds to firstName field in EmployeeDto class.
There can be slight variations due to team members assigning their own renditions, and how you'd like to pack the info for the service that called for the DTO.
MapStruct provides support to handle these situations via the @Mapping annotation. <br/>
Now, we'll have to let our EmployeeMapper know of this discrepancy. We'll do so by setting the source and target flags of the @Mapping annotation.
```
@Mapping(source = "emp.fullName", target="firstName")
```

### Inverse Mapping 
`InheritInverseConfiguration` advises the code generator to apply all the Mappings from an inverse mapping method to the annotated method as well. 
An inverse mapping method is a method which has the annotated method's source type as target type (return type or indicated through a parameter annotated with MappingTarget) and the annotated method's target type as source type.  <br/>
Compile your project, if you get mapping processor errors, you can update `mapstruct` version. <br/>
[https://stackoverflow.com/questions/65112406/intellij-idea-mapstruct-java-internal-error-in-the-mapping-processor-java-lang](mapstruct-java-version-solution)

### Named annotation
Marks mapping methods with the given qualifier name `qualifiedByName = "translateToFullName"`. <br/>
Can be used to qualify a single method or all methods of a given type by specifying this annotation on the type level.