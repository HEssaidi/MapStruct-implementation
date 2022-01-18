package com.example.mapstruct.mapper;


import com.example.mapstruct.dto.EmployeeDto;
import com.example.mapstruct.models.Employee;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper
public interface EmployeeMapper {
    @Mapping(source = ".", target="fullName", qualifiedByName = "translateToFullName")
    public EmployeeDto toDto(Employee emp);

    @InheritInverseConfiguration(name="toDto")
    public Employee fromDto(EmployeeDto dto);

    @Named("translateToFullName")
    default String toFullName(Employee employee) {
        return employee.getFirstName()+" "+employee.getLastName() ;
    }
}
