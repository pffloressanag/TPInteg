import java.util.ArrayList;

public class Resultado {
    private ArrayList<Partido>partido;

    public Resultado() {
        partido = new ArrayList<Partido>();
    }

    public void agregarPartido(Partido nuevo){
        partido.add(nuevo);
    }

    @Override
    public String toString() {
        return partido.toString();
    }
}


