package manager.gym.Gym.Manager.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity

public class TrainingHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(insertable = false, updatable = false)
    private String memberId;


    private Date trainingDay;


    private String trainingTime;


    private Integer trainerId;

    @ManyToOne
    @JoinColumn(name = "memberId", referencedColumnName = "memberId", insertable = false, updatable = false)
    private Member member;

    public TrainingHistory() {
    }

    public TrainingHistory(String memberId, Date trainingDay, String trainingTime, Integer trainerId) {
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

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
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

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

}
