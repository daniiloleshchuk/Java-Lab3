package ua.lviv.iot.Lab3.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.Lab3.model.FlowerType;

@Repository
public interface FlowerTypeRepository extends JpaRepository<FlowerType, Integer> {
}
