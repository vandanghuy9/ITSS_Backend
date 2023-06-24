package manager.gym.Gym.Manager.entity.staff;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import manager.gym.Gym.Manager.entity.gym.YogaClass;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor // constructor using all fields as para
@NoArgsConstructor // constructor using no field as para
@Table(name = "GYM_STAFF")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class GymStaff extends Employee{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private int id;

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }
    private String role;
    private String workingFaculty;
//    @OneToOne(mappedBy = "employee")
//    private YogaClass yogaClass;
//
//    public YogaClass getYogaClass() {
//        return yogaClass;
//    }
//
//    public void setYogaClass(YogaClass yogaClass) {
//        this.yogaClass = yogaClass;
//    }

    public String getWorkingFaculty() {
        return workingFaculty;
    }

    public void setWorkingFaculty(String workingFaculty) {
        this.workingFaculty = workingFaculty;
    }

    public GymStaff(String name, Date dob, String workingFaculty, String phoneNum, String citizenIdentityID, Date startDate, Date finishContractDate, String role, String address) {
        super(name, dob, phoneNum, citizenIdentityID, startDate, finishContractDate, address);
        this.role =role;
        this.workingFaculty = workingFaculty;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    @Override
    public void setEmployee(Employee employee){
        GymStaff gymStaff = (GymStaff)employee;
        this.setName(gymStaff.getName());
        this.setDob(gymStaff.getDob());
        this.setWorkingFaculty(gymStaff.getWorkingFaculty());
        this.setPhoneNum(gymStaff.getPhoneNum());
        this.setCitizenIdentityID(gymStaff.getCitizenIdentityID());
        this.setStartDate(gymStaff.getStartDate());
        this.setFinishContractDate(gymStaff.getFinishContractDate());
        this.setRole(gymStaff.getRole());
    }


}
