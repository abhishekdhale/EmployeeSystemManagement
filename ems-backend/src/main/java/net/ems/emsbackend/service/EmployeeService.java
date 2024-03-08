package net.ems.emsbackend.service;

import net.ems.emsbackend.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(long employeeId);
    EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee);
}
