package springRest.service;


import springRest.entity.Employee;

import javax.transaction.Transactional;
import java.util.List;


public interface EmployeeService {

    List<Employee> getEmployees();

    Employee getEmployeeById(int id);

    void addEmployee(Employee employee);

    void updateEmployee(Employee employee);

    void deleteEmployee(int id);
}
