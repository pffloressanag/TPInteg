import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@Setter
@ToString

public class Partido {
    private String equipo1;
    private int golesEquipo1;
    private String equipo2;
    private int getGolesEquipo2;
    private ArrayList<Partido> resultado = new ArrayList<>();

    public Partido(String equipo1, int golesEquipo1,String equipo2, int getGolesEquipo2) {
        this.equipo1 = equipo1;
        this.golesEquipo1 = golesEquipo1;
        this.equipo2 = equipo2;
        this.getGolesEquipo2 = getGolesEquipo2;
    }

}