package net.ghaines.nativedemo.controller;

import net.ghaines.nativedemo.model.Employee;
import net.ghaines.nativedemo.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    private final EmployeeRepository employeeRepository;

    public Controller (EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

}
