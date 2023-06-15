package manager.gym.Gym.Manager.service;

import manager.gym.Gym.Manager.entity.Employee;
import manager.gym.Gym.Manager.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private EmployeeRepository repository;


    @Override//    @PostMapping("/saveEmployee")
    public String save( Employee employee){
        repository.save(employee);
        return "Employee saved...";
    }

//    @PostMapping("/saveEmployee")
//    public String saveEmployee(){
//        repository.save(new Employee("Huy",1000));
//        return "Employee saved";
//    }
//    @GetMapping("/getAllEmployees")
    public List<Employee> getAll(){
        return repository.findAll();
    }
//    @GetMapping("/getEmployee/{name}")
    public List<Employee> getEmployeeById(@PathVariable int id){
        return repository.findById(id);
    }

    //    @GetMapping("/")
    public  String index(){
        return ("Server working on port 8080");
    }
}
