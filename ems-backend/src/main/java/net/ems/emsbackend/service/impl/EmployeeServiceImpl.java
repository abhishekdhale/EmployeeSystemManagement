package net.ems.emsbackend.service.impl;

import lombok.AllArgsConstructor;
import net.ems.emsbackend.dto.EmployeeDto;
import net.ems.emsbackend.entity.Employee;
import net.ems.emsbackend.exception.ResourceNotFoundException;
import net.ems.emsbackend.mapper.EmployeeMapper;
import net.ems.emsbackend.repository.EmployeeRepository;
import net.ems.emsbackend.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee= EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEMployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEMployee);
    }

    @Override
    public EmployeeDto getEmployeeById(long employeeId) {
       Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(()->new ResourceNotFoundException("Employee is not exists with given id : "+employeeId));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }
}
