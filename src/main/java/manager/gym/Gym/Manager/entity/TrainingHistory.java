package manager.gym.Gym.Manager.entity;

import jakarta.persistence.*;
import lombok.ToString;

import java.util.Date;

@Entity
@Table(name = "TRAINING_HISTORY")
public class TrainingHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;



    private Date trainingDay;


    private String trainingTime;


    private Integer trainerId;
    private Integer memberId;

//    @ManyToOne
//    @JoinColumn(name = "member_id",nullable = false)
//    private Member member;

    public TrainingHistory() {
    }

    public TrainingHistory(Integer memberId, Date trainingDay, String trainingTime, Integer trainerId) {
          this.memberId = memberId;
        this.trainingDay = trainingDay;
        this.trainingTime = trainingTime;
        this.trainerId = trainerId;
    }

    // Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Date getTrainingDay() {
        return trainingDay;
    }

    public void setTrainingDay(Date trainingDay) {
        this.trainingDay = trainingDay;
    }

    public String getTrainingTime() {
        return trainingTime;
    }

    public void setTrainingTime(String trainingTime) {
        this.trainingTime = trainingTime;
    }

    public Integer getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(Integer trainerId) {
        this.trainerId = trainerId;
    }

//    public Member getMember() {
//        return member;
//    }
//
//    public void setMember(Member member) {
//        this.member = member;
//    }

}
