package com.example.mapstruct.resource;

import com.example.mapstruct.dto.EmployeeDto;
import com.example.mapstruct.mapper.EmployeeMapperConverter;
import com.example.mapstruct.models.Employee;
import com.example.mapstruct.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee")
public class EmployeeResource {

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private EmployeeMapperConverter employeeMapperConverter;

    @PostMapping("/")
    public Employee saveEmpl(@RequestBody EmployeeDto employeeDto){
        Employee employee = employeeMapperConverter.fromDto(employeeDto);
        return employeeService.saveEmployee(employee);
    }
}
