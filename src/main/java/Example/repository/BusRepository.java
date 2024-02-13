package Example.repository;

import Example.model.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepository extends JpaRepository<Bus,Long> {
}
