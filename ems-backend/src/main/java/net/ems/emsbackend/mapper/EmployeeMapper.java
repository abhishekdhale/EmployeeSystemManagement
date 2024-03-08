package net.ems.emsbackend.mapper;

import net.ems.emsbackend.dto.EmployeeDto;
import net.ems.emsbackend.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return  new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeedto){
        return new Employee(
                employeedto.getId(),
                employeedto.getFirstName(),
                employeedto.getLastName(),
                employeedto.getEmail()
        );
    }
}
