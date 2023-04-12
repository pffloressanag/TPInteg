import java.util.HashMap;

public class CopaLib {
    private HashMap<String,Equipo> equipos;

    public CopaLib() {
        equipos = new HashMap<>();
    }

    public HashMap<String, Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(HashMap<String, Equipo> equipos) {
        this.equipos = equipos;
    }
}
