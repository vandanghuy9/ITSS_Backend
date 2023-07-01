package manager.gym.Gym.Manager.controller;

import manager.gym.Gym.Manager.entity.GymHasFacility;
import manager.gym.Gym.Manager.service.GymHasFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gymhasfacility")
@CrossOrigin(origins = "http://localhost:3000")
public class GymHasFacilityController {
    @Autowired
    private final GymHasFacilityService gymHasFacilityService;

    public GymHasFacilityController(GymHasFacilityService gymHasFacilityService) {
        this.gymHasFacilityService = gymHasFacilityService;
    }
    @GetMapping
    public List<GymHasFacility> getAllGymHasFacility(){
        return gymHasFacilityService.getAllGymHasFacility();
    }

    @GetMapping("/{id}")
    public GymHasFacility getGymHasFacilityById(@PathVariable Integer id){
        return gymHasFacilityService.getGymHasFacilityById(id);
    }

    @PostMapping
    public GymHasFacility createGymHasFacility(@RequestBody GymHasFacility gymHasFacility){
        return gymHasFacilityService.createGymHasFacility(gymHasFacility);
    }

    @PutMapping
    public GymHasFacility updateGymHasFacility(@PathVariable Integer id, @RequestBody GymHasFacility gymHasFacility){
        return gymHasFacilityService.updateGymHasFacility(id, gymHasFacility);
    }
    @DeleteMapping
    public void deleteGymHasFacilityById(@PathVariable Integer id){
        gymHasFacilityService.deleteGymHasFacility(id);
    }
}
