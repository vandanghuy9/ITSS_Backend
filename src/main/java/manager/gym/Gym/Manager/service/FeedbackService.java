package manager.gym.Gym.Manager.service;

import manager.gym.Gym.Manager.entity.Feedback;
import manager.gym.Gym.Manager.entity.Registration;
import manager.gym.Gym.Manager.repository.FeedbackRepository;
import manager.gym.Gym.Manager.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FeedbackService {
    private final FeedbackRepository feedbackRepository;

    @Autowired
    public FeedbackService(FeedbackRepository feedbackRepository){
        this.feedbackRepository = feedbackRepository;
    }

    public List<Feedback> getAllFeedbacks(){
        return feedbackRepository.findAll();
    }

    public Feedback getFeedbackById(Integer id){
        return feedbackRepository.findById(id)
                .orElse(null);
    }

    public Feedback createFeedback(Feedback feedback){
        return feedbackRepository.save(feedback);
    }

    public void deleteFeedback(Integer id){
        feedbackRepository.deleteById(id);
    }

    public Feedback updateFeedback(Integer feedbackId, Feedback feedback) {
        feedback.setFeedbackId(feedbackId);
        return feedbackRepository.save(feedback);
    }


}
