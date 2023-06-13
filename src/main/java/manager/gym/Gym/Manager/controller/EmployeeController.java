package manager.gym.Gym.Manager.controller;

import manager.gym.Gym.Manager.repository.EmployeeRepository;
import manager.gym.Gym.Manager.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {
    @Autowired
    private EmployeeRepository repository;

    @PostMapping("/saveEmployee")
    public String saveEmployee(@RequestBody Employee employee){
        repository.save(employee);
        return "Employee saved...";
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
