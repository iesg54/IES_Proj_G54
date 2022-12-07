package pt.ua.deti.ies.smarthome.smarthome_api.model.dispositivos;

import java.sql.Time;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pt.ua.deti.ies.smarthome.smarthome_api.model.Divisao;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Lampada extends Dispositivo{
    @Column(nullable = false)
    private Double luminosidade = 100.0;

    @Column(name="start_time")
    private Time startTime;

    @Column(name="end_time")
    private Time endTime;
}
