package com.example.mapstruct.mapper;


import com.example.mapstruct.dto.EmployeeDto;
import com.example.mapstruct.models.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface EmployeeMapper {
//    @Mapping(source = "emp.fullName", target="firstName")
    public EmployeeDto toDto(Employee emp);
    public Employee fromDto(EmployeeDto dto);
}
