package manager.gym.Gym.Manager.repository;

import manager.gym.Gym.Manager.entity.GymHasFacility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GymHasFacilityRepository extends JpaRepository<GymHasFacility, Integer> {
}
