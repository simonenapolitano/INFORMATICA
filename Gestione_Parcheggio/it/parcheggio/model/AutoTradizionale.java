import java.time.Duration;
import java.time.LocalDateTime;
import java.time.chrono.ChronoZonedDateTime;
import java.time.temporal.ChronoUnit;

public class AutoTradizionale extends Veicolo {
    private final Double tariffaOraria = 2.0;
    public AutoTradizionale(String targa){
        super(targa);
    }

    public Double calcolaTariffa(LocalDateTime orarioUscita){
        return ChronoUnit.HOURS.between(orarioUscita, orarioUscita) 
    }
}
