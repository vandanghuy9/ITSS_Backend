package manager.gym.Gym.Manager.controller;

import manager.gym.Gym.Manager.entity.TrainingHistory;
import manager.gym.Gym.Manager.service.TrainingHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trainingHistories")
public class TrainingHistoryController {
    private final TrainingHistoryService trainingHistoryService;

    @Autowired
    public TrainingHistoryController(TrainingHistoryService trainingHistoryService) {
        this.trainingHistoryService = trainingHistoryService;
    }

    @GetMapping
    public List<TrainingHistory> getAllTrainingHistories() {
        return trainingHistoryService.getAllTrainingHistories();
    }

    @GetMapping("/{id}")
    public TrainingHistory getTrainingHistoryById(@PathVariable Integer id) {
        return trainingHistoryService.getTrainingHistoryById(id);
    }

    @PostMapping
    public TrainingHistory createTrainingHistory(@RequestBody TrainingHistory trainingHistory) {
        return trainingHistoryService.createTrainingHistory(trainingHistory);
    }

    @PutMapping("/{id}")
    public TrainingHistory updateTrainingHistory(@PathVariable Integer id, @RequestBody TrainingHistory trainingHistory) {
        return trainingHistoryService.updateTrainingHistory(id, trainingHistory);
    }

    @DeleteMapping("/{id}")
    public void deleteTrainingHistory(@PathVariable Integer id) {
        trainingHistoryService.deleteTrainingHistory(id);
    }
}
