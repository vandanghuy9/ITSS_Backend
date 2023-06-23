package manager.gym.Gym.Manager.repository;

import jakarta.persistence.Table;
import manager.gym.Gym.Manager.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Table(name = "EMPLOYEE")
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    public List<Employee> findById(int id);
}