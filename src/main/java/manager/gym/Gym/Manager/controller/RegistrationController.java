package manager.gym.Gym.Manager.controller;

import manager.gym.Gym.Manager.entity.Registration;
import manager.gym.Gym.Manager.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/registrations")
@CrossOrigin(origins = "http://localhost:8080")
public class RegistrationController {
    private final RegistrationService registrationService;

    @Autowired
    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @GetMapping
    public List<Registration> getAllRegistrations(){
        return registrationService.getAllRegistration();
    }

    @GetMapping("/{registrationId}")
    public Registration getRegistrationById(@PathVariable Integer registrationId){
        return registrationService.getRegistrationById(registrationId);
    }

    @PostMapping
    public Registration createRegistration(@RequestBody Registration registration){
        return registrationService.createRegistration(registration);
    }

    @DeleteMapping("/{registrationId}")
    public void deleteRegistrationById(@PathVariable Integer registrationId){
        registrationService.deleteRegistration(registrationId);
    }

    @PutMapping("/{registrationId}")
    public Registration updateRegistration(@PathVariable Integer registrationId, @RequestBody Registration registration){
        return registrationService.updateRegistration(registrationId, registration);
    }
}