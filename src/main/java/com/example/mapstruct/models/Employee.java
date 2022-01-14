package com.example.mapstruct.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class Employee {
    private int id;
    private String fullName;
    private String jobRole;

    public Employee() {
    }
}
