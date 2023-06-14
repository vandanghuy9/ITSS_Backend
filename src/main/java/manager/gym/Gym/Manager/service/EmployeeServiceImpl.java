package manager.gym.Gym.Manager.service;

import manager.gym.Gym.Manager.entity.Employee;
import manager.gym.Gym.Manager.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    @PostMapping("/saveEmployee")
    public String saveEmployee(@RequestBody Employee employee){
        repository.save(employee);
        return "Employee saved...";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(){
        repository.save(new Employee("Huy",1000));
        return "Employee saved";
    }
    @GetMapping("/getAllEmployees")
    public List<Employee> getAll(){
        return repository.findAll();
    }
    @GetMapping("/getEmployee/{name}")
    public List<Employee> getEmployeeByName(@PathVariable String name){
        return repository.findByName(name);
    }
    @GetMapping("/")
    public  String index(){
        return ("Server working on port 8080");
    }
}
