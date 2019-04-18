package cs4r.labs.employeeapi.repos;

import cs4r.labs.employeeapi.entities.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
