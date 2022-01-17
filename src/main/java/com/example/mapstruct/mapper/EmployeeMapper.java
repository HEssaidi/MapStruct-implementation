package com.example.mapstruct.mapper;


import com.example.mapstruct.dto.EmployeeDto;
import com.example.mapstruct.models.Employee;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Mapper
public interface EmployeeMapper {
    @Mapping(source = "emp.firstName", target="fullName")
    public EmployeeDto toDto(Employee emp);

    @InheritInverseConfiguration(name="toDto")
    public Employee fromDto(EmployeeDto dto);
}
