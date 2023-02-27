package springRest.controller;

import org.springframework.web.bind.annotation.*;
import springRest.dao.EmployeeDAOImpl;
import springRest.entity.Employee;
import springRest.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/springRest")
public class RestControllerNew {

    private EmployeeService employeeService;

    public RestControllerNew(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employee")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
        return employee;
    }

    @PutMapping("/employee")
    public Employee updateEmployee(@RequestBody Employee employee) {
        employeeService.updateEmployee(employee);
        return employee;
    }

    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
        return "Person with id = " + id + " was deleted";
    }

}
