package com.example.mapstruct.mapper;


import com.example.mapstruct.dto.EmployeeDto;
import com.example.mapstruct.models.Employee;
import org.mapstruct.Mapper;

@Mapper
public interface EmployeeMapper {
    public EmployeeDto toDto(Employee emp);
    public Employee fromDto(EmployeeDto dto);
}
