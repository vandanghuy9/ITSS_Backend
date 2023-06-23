package manager.gym.Gym.Manager.controller;

import manager.gym.Gym.Manager.entity.Feedback;
import manager.gym.Gym.Manager.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/feedbacks")
public class FeedbackController {
    private final FeedbackService feedbackService;

    @Autowired
    public FeedbackController(FeedbackService feedbackService) {
        this.feedbackService = feedbackService;
    }

    @GetMapping
    public List<Feedback> getAllRegistrations(){
        return feedbackService.getAllFeedbacks();
    }

    @GetMapping("/{feedbackId}")
    public Feedback getFeedbackById(@PathVariable Integer feedbackId){
        return feedbackService.getFeedbackById(feedbackId);
    }

    @PostMapping
    public Feedback createFeedback(@RequestBody Feedback feedback){
        return feedbackService.createFeedback(feedback);
    }

    @DeleteMapping("/{feedbackId}")
    public void deleteFeedbackById(@PathVariable Integer feedbackId){
        feedbackService.deleteFeedback(feedbackId);
    }

    @PutMapping("/{feedbackId}")
    public Feedback updateFeedback(@PathVariable Integer feedbackId, @RequestBody Feedback feedback){
        return feedbackService.updateFeedback(feedbackId, feedback);
    }

}
