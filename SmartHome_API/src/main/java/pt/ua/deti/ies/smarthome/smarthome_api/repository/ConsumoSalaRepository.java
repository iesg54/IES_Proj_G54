package pt.ua.deti.ies.smarthome.smarthome_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pt.ua.deti.ies.smarthome.smarthome_api.model.measurements.ConsumoSala;

import java.sql.Date;
import java.util.List;

@Repository
public interface ConsumoSalaRepository extends JpaRepository<ConsumoSala, Integer> {
    List<ConsumoSala> findAllByDiaEquals(Date dia);
}
