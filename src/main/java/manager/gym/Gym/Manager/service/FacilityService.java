package manager.gym.Gym.Manager.service;

import manager.gym.Gym.Manager.entity.Facility;
import manager.gym.Gym.Manager.repository.FacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class FacilityService implements IFacilityService {
    @Autowired
    private FacilityRepository facilityRepository;

    @PostMapping("/saveFacility")
    public String save(Facility facility) {
        facilityRepository.save(facility);
        return "Saved facility";
    }
    @GetMapping("/getAllFacilities")
    @Override
    public List<Facility> getAll() {
        return facilityRepository.findAll();
    }

    @Override
    public List<Facility> getFacilityById(int id) {
        return facilityRepository.findById(id);
    }




}
