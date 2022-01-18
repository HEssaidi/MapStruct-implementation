package com.example.mapstruct.mapper;

import com.example.mapstruct.dto.EmployeeDto;
import com.example.mapstruct.models.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapperConverter implements EmployeeMapper {

    @Override
    public EmployeeDto toDto(Employee emp) {
        if ( emp == null ) {
            return null;
        }

        EmployeeDto employeeDto = new EmployeeDto();

        employeeDto.setFullName( toFullName( emp ) );
        if ( emp.getId() != null ) {
            employeeDto.setId( emp.getId().intValue() );
        }
        employeeDto.setJobRole( emp.getJobRole() );

        return employeeDto;
    }

    @Override
    public Employee fromDto(EmployeeDto dto) {
        if ( dto == null ) {
            return null;
        }

        Employee.EmployeeBuilder employee = Employee.builder();

        employee.firstName( dto.getFullName() );
        employee.id( (long) dto.getId() );
        employee.jobRole( dto.getJobRole() );

        return employee.build();
    }
}
