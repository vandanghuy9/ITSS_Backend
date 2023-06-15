package manager.gym.Gym.Manager.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
//import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor // constructor using all fields as para
@NoArgsConstructor // constructor using no field as para
//@Table(name = "EMPLOYEE")
public class Employee {
    @Id // every id of entity needs this notation
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    @JsonProperty @Column
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty @Column
    private double salary;
    @JsonProperty @Column
    private String address;
    public Employee (@JsonProperty("name") String name, @JsonProperty("salary") double salary, @JsonProperty("address") String address){
        super();
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}
