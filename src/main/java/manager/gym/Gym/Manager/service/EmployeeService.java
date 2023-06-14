package manager.gym.Gym.Manager.service;

import manager.gym.Gym.Manager.entity.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface EmployeeService {
    String saveEmployee(@RequestBody Employee employee);
    List<Employee> getAll();
    List<Employee> getEmployeeByName(@PathVariable String name);
    String index();
}
