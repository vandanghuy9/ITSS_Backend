package manager.gym.Gym.Manager.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer feedbackId;
    private Integer memberId;
    private Integer staffId;
    private String feedbackContent;
    private Integer feedbackType;
//    0 - PT feedback, 1 - Member feedback

    public Feedback(){

    }

    public Integer getFeedbackId() {
        return feedbackId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public String getFeedbackContent() {
        return feedbackContent;
    }

    public Integer getFeedbackType() {
        return feedbackType;
    }

    public void setFeedbackId(Integer feedbackId) {
        this.feedbackId = feedbackId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public void setFeedbackContent(String feedbackContent) {
        this.feedbackContent = feedbackContent;
    }

    public void setFeedbackType(Integer feedbackType) {
        this.feedbackType = feedbackType;
    }
}
