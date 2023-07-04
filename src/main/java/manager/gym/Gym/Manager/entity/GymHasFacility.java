package manager.gym.Gym.Manager.entity;

import jakarta.persistence.*;
import manager.gym.Gym.Manager.entity.gym.YogaClass;

@Entity
@Table(name = "gym_has_facility")
public class GymHasFacility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "gym_id", referencedColumnName = "id")
    private YogaClass gymId;

    @ManyToOne
    @JoinColumn(name = "facility_id", referencedColumnName = "id")
    private Facility facilityId;

    @Column(name = "quantity")
    private Integer quantity;

    public GymHasFacility(){

    };

    public GymHasFacility(Integer id, YogaClass gymId, Facility facilityId, Integer quantity) {
        Id = id;
        this.gymId = gymId;
        this.facilityId = facilityId;
        this.quantity = quantity;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public YogaClass getGymId() {
        return gymId;
    }

    public void setGymId(YogaClass gymId) {
        this.gymId = gymId;
    }

    public Facility getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Facility facilityId) {
        this.facilityId = facilityId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
