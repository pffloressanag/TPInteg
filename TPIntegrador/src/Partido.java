import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Partido {
    private int id_partido;
    private Equipo equipo1;
    private Equipo equipo2;
    private int golesEquipo1;
    private int golesEquipo2;

    public Partido(String nome1, int ge1, String nome2, int ge2) {

    }

    public ResultadoEnum resultado(Equipo equipo1) {
        Equipo uno = null;
        ResultadoEnum res = null;
        golesEquipo1 = 0;
        golesEquipo2 = 0;
        if (golesEquipo1>golesEquipo2){
            res = ResultadoEnum.ganador;
            String a = uno.getNombre();
        } else if (golesEquipo1<golesEquipo2) {
            res = ResultadoEnum.perdedor;
            String a = uno.getNombre();
        }else {
            res = ResultadoEnum.empate;
        }
        return res;
    }
}