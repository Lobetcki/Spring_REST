package springRest.dao;

import springRest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> getEmployees();

    Employee getEmployeeById(int id);

    void addEemployee(Employee employee);

    void updateEmployee(Employee employee);

    void deleteEmployee(int id);
}
