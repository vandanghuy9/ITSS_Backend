package manager.gym.Gym.Manager.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import manager.gym.Gym.Manager.entity.Employee;
import manager.gym.Gym.Manager.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/employee")
//@RequestMapping("/api/v1/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/getAllEmployees")
    public ResponseEntity<List<Employee>> getAllEmployees(){
        return new ResponseEntity<List<Employee>>(employeeService.getAll(), HttpStatus.OK);
    }
    @GetMapping("/")
    public ResponseEntity<String> index(){
        return new ResponseEntity<String>(employeeService.index(),HttpStatus.OK);
    }

    @PostMapping(value = "/saveEmployee")
    public ResponseEntity<String> saveEmployee(@RequestBody @JsonProperty Employee employee){
        return new ResponseEntity<String>(employeeService.save(employee),HttpStatus.CREATED);
    }


}
