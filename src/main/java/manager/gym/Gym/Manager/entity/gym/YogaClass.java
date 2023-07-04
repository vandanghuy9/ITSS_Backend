package manager.gym.Gym.Manager.entity.gym;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import manager.gym.Gym.Manager.entity.staff.Employee;
import manager.gym.Gym.Manager.entity.staff.GymStaff;

@Entity
@Data
@AllArgsConstructor // constructor using all fields as para
@NoArgsConstructor // constructor using no field as para

public class YogaClass {
    @Id
    @Column(name = "id")
    private String id;
    private String name;
    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "manager_id", referencedColumnName = "id")

    private GymStaff employee;
    private int maximumNumber;
    private String location;
    private boolean isOccupied;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GymStaff getEmployee() {
        return employee;
    }

    public void setEmployee(GymStaff employee) {
        this.employee = employee;
    }

    public int getMaximumNumber() {
        return maximumNumber;
    }

    public void setMaximumNumber(int maximumNumber) {
        this.maximumNumber = maximumNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public YogaClass(String name, Employee employee, int maximumNumber, String id, boolean isOccupied, String location) {
        this.name = name;
//        this.employee = (GymStaff) employee;
        this.maximumNumber = maximumNumber;
        this.isOccupied = isOccupied;
        this.location = location;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setClass(YogaClass yogaClass){
        setMaximumNumber(yogaClass.getMaximumNumber());
        setName(yogaClass.getName());
//        setEmployee(yogaClass.getEmployee());
        setLocation(yogaClass.getLocation());
        setOccupied(yogaClass.isOccupied());
    }
}
