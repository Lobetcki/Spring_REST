package springRest.service;

import org.springframework.stereotype.Service;
import springRest.dao.EmployeeDAO;
import springRest.entity.Employee;
import springRest.exceptions.EmployeeException;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDAO employeeDAO;

    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    @Transactional
    public List<Employee> getEmployees() {
        return employeeDAO.getEmployees();
    }

    @Override
    @Transactional
    public Employee getEmployeeById(int id) {
        Employee employee = employeeDAO.getEmployeeById(id);
        if (employee == null) {
        throw new EmployeeException("Person with id = " + id + " doesn't exist");
            }
        return employee;
    }

    @Override
    @Transactional
    public void addEmployee(Employee employee) {
        employeeDAO.addEemployee(employee);
    }

    @Override
    @Transactional
    public void updateEmployee(Employee employee) {
        employeeDAO.updateEmployee(employee);
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
        Employee employee = employeeDAO.getEmployeeById(id);
        if (employee == null) {
            throw new EmployeeException("Person with id = " + id + " doesn't exist");
        }

        employeeDAO.deleteEmployee(id);
    }
}
