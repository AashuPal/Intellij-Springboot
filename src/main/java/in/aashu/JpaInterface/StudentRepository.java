package in.aashu.JpaInterface;

import in.aashu.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    Optional<Object> findByAddress(String address);
    // Additional query methods can be defined here if needed
}
