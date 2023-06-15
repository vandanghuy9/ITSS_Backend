package manager.gym.Gym.Manager.service;

import manager.gym.Gym.Manager.entity.Employee;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getAll();
    List<Employee> getEmployeeById(@PathVariable int id);
    String save(Employee employee);
}
