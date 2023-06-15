package manager.gym.Gym.Manager.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor // constructor using all fields as para
@NoArgsConstructor // constructor using no field as para

public class Facility {
    @Id
    private int facilityID;
    private String facilityName;
    private String type;
    private Date dateOfPurchase;
    private Date warrantyDate;
    private String Origin;
    private String status;

}
