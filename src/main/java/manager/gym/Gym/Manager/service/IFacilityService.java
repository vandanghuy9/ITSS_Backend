package manager.gym.Gym.Manager.service;

import manager.gym.Gym.Manager.entity.Facility;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface IFacilityService {
    List<Facility> getAll();
    List<Facility> getFacilityById(@PathVariable int id);
    String save(Facility facility);

}
