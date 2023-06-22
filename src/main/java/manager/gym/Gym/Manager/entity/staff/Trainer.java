package manager.gym.Gym.Manager.entity.staff;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data
@AllArgsConstructor // constructor using all fields as para
@NoArgsConstructor // constructor using no field as para
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "TRAINER")
public class Trainer extends Employee{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private String trainerType;

    public String getTrainerType() {
        return trainerType;
    }

    public void setTrainerType(String trainerType) {
        this.trainerType = trainerType;
    }

    public Trainer(String name, Date dob, String workingFaculty, String phoneNum, String citizenIdentityID, Date startDate, Date finishContractDate, String trainerType, String address) {
        super(name, dob, phoneNum, citizenIdentityID, startDate, finishContractDate, address);
        this.trainerType = trainerType;
    }

    @Override
    public void setEmployee(Employee employee) {
        Trainer trainer = (Trainer) employee;
        this.setName(trainer.getName());
        this.setDob(trainer.getDob());
        this.setPhoneNum(trainer.getPhoneNum());
        this.setCitizenIdentityID(trainer.getCitizenIdentityID());
        this.setStartDate(trainer.getStartDate());
        this.setFinishContractDate(trainer.getFinishContractDate());
    }
}
