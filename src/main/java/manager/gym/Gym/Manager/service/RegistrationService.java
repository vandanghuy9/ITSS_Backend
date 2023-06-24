package manager.gym.Gym.Manager.service;

import manager.gym.Gym.Manager.entity.Member;
import manager.gym.Gym.Manager.entity.Registration;
import manager.gym.Gym.Manager.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationService {
    private final RegistrationRepository registrationRepository;

    @Autowired
    public RegistrationService(RegistrationRepository registrationRepository){
        this.registrationRepository = registrationRepository;
    }

    public List<Registration> getAllRegistration(){
        return registrationRepository.findAll();
    }

    public Registration getRegistrationById(Integer id){
        return registrationRepository.findById(id)
                .orElse(null);
    }

    public Registration createRegistration(Registration registration){
        return registrationRepository.save(registration);
    }

    public void deleteRegistration(Integer id){
        registrationRepository.deleteById(id);
    }

    public Registration updateRegistration(Integer registrationId, Registration registration) {
        registration.setRegistrationId(registrationId);
        return registrationRepository.save(registration);
    }
}
