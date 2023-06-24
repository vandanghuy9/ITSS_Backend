package manager.gym.Gym.Manager.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import org.hibernate.Internal;

import java.util.Date;

@Entity
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer registrationId;

    private Integer memberId;
    private Integer membershipId;
    private Date registrationDate;
    private String registrationType;
    private String trainerId;

    public Registration(){

    }
    public Registration(Integer registrationId, Integer memberId, Integer membershipId, Date registrationDate, String registrationType, String trainerId) {
        this.registrationId = registrationId;
        this.memberId = memberId;
        this.membershipId = membershipId;
        this.registrationDate = registrationDate;
        this.registrationType = registrationType;
        this.trainerId = trainerId;
    }

    public Integer getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(Integer registrationId) {
        this.registrationId = registrationId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(Integer membershipId) {
        this.membershipId = membershipId;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getRegistrationType() {
        return registrationType;
    }

    public void setRegistrationType(String registrationType) {
        this.registrationType = registrationType;
    }

    public String getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(String trainerId) {
        this.trainerId = trainerId;
    }

}
