package manager.gym.Gym.Manager.repository;

import jakarta.persistence.Table;
import manager.gym.Gym.Manager.entity.Feedback;
import manager.gym.Gym.Manager.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Table(name = "FEEDBACK")
public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {
}