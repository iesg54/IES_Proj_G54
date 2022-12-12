package pt.ua.deti.ies.smarthome.smarthome_api.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pt.ua.deti.ies.smarthome.smarthome_api.model.Divisao;
import pt.ua.deti.ies.smarthome.smarthome_api.model.measurements.ConsumoExterno;

@Repository
public interface ConsumoExternoRepository extends JpaRepository<ConsumoExterno, Integer> {

    List<ConsumoExterno> findByDivAndDiaGreaterThanEqualAndDiaLessThan(Divisao div, Date date1, Date date2);
    List<ConsumoExterno> findAllByDiaEquals(Date dia);
}
