import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Pronostico {

    private Partido partido;
    private Equipo equipo;
    private ResultadoEnum resultado;
    private int puntos = 0;
    private int pxa = 1;

    public Pronostico() {

    }

    public int puntos(){
        int punt=0;

        return punt;
    }
}

