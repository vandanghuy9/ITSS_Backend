package manager.gym.Gym.Manager.controller;

import manager.gym.Gym.Manager.entity.Facility;

import manager.gym.Gym.Manager.service.FacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/ap1/v1/facility")
@RestController
public class FacilityController  {
    @Autowired
    private FacilityService facilityService;
    @GetMapping("/getAllFacilities")
    public ResponseEntity<List<Facility>> getAll(){
        return new ResponseEntity<List<Facility>>(facilityService.getAll(),HttpStatus.OK);
    }
}
