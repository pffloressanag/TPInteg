import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Pronostico {

    private Partido partido;
    private Equipo equipo;
    private ResultadoEnum resultadoEnum;
    private int puntos = 0;
    private int pxa = 1;

    public Pronostico() {
        this.partido = partido;
        this.equipo = equipo;
        this.resultadoEnum = resultadoEnum;
        this.puntos = puntos;
        this.pxa = pxa;
    }
}

