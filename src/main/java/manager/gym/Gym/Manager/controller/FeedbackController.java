package manager.gym.Gym.Manager.controller;

import manager.gym.Gym.Manager.entity.Feedback;
import manager.gym.Gym.Manager.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/api/feedback")
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class FeedbackController {
    @Autowired
    private final FeedbackService feedbackService;

    public FeedbackController(FeedbackService feedbackService) {
        this.feedbackService = feedbackService;
    }

    @GetMapping
    public List<Feedback> getAllFeedbacks(){
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
    public void deleteFeedback(@PathVariable Integer feedbackId){
        feedbackService.deleteFeedback(feedbackId);
    }

    @PutMapping("/{feedbackId}")
    public Feedback updateFeedback(@PathVariable Integer feedbackId, @RequestBody Feedback feedback){
        return feedbackService.updateFeedback(feedbackId, feedback);
    }
}