package net.ghaines.nativedemo.repository;

import net.ghaines.nativedemo.model.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    List<Employee> findAll();

}
