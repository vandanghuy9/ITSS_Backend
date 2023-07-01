package manager.gym.Gym.Manager.service;

import manager.gym.Gym.Manager.entity.Facility;
import manager.gym.Gym.Manager.entity.Feedback;
import manager.gym.Gym.Manager.entity.GymHasFacility;
import manager.gym.Gym.Manager.entity.Member;
import manager.gym.Gym.Manager.entity.gym.YogaClass;
import manager.gym.Gym.Manager.entity.staff.GymStaff;
import manager.gym.Gym.Manager.repository.FacilityRepository;
import manager.gym.Gym.Manager.repository.GymHasFacilityRepository;
import manager.gym.Gym.Manager.repository.gym.YogaClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GymHasFacilityService {
    @Autowired
    private final GymHasFacilityRepository gymHasFacilityRepository;
    @Autowired
    private YogaClassRepository yogaClassRepository;
    @Autowired
    private FacilityRepository facilityRepository;
    public GymHasFacilityService(GymHasFacilityRepository gymHasFacilityRepository) {
        this.gymHasFacilityRepository = gymHasFacilityRepository;
    }

    public List<GymHasFacility> getAllGymHasFacility(){
        return gymHasFacilityRepository.findAll();
    }

    public GymHasFacility getGymHasFacilityById(Integer id){
        return gymHasFacilityRepository.findById(id)
                .orElse(null);
    }

//    public Feedback createFeedback(Feedback feedback){
//        int memberId = feedback.getMemberId().getMemberId();
//        int gymStaffId = feedback.getGymStaffId().getId();
//
//        Member foundMember = memberRepository.findById(memberId).orElse(null);
//        GymStaff foundGymStaff = gymStaffRepository.findByid(gymStaffId).get(0);
//
//        feedback.setMemberId(foundMember);
//        feedback.setGymStaffId(foundGymStaff);
//        return feedbackRepository.save(feedback);
//    }

    public GymHasFacility createGymHasFacility(GymHasFacility gymHasFacility){
        String gymId = gymHasFacility.getGymId().getId();
        Integer facilityId = gymHasFacility.getFacilityId().getId();

        YogaClass foundclass = yogaClassRepository.findById(gymId).orElse(null);
        Facility foundfacility = facilityRepository.findById(facilityId).orElse(null);

        gymHasFacility.setGymId(foundclass);
        gymHasFacility.setFacilityId(foundfacility);
        return gymHasFacilityRepository.save(gymHasFacility);
    }
    public GymHasFacility updateGymHasFacility(Integer id, GymHasFacility gymHasFacility){
        gymHasFacility.setId(id);
        return gymHasFacilityRepository.save(gymHasFacility);
    }
    public void deleteGymHasFacility(Integer id){
        gymHasFacilityRepository.deleteById(id);
    }
}
