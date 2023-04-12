import java.util.ArrayList;

public class Ronda {
    private String nro;
    private ArrayList<Partido>partidos;

    public Ronda(String nro, ArrayList<Partido> partidos) {
        this.nro = nro;
        this.partidos = partidos;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }


    public int puntos(){
        return 1;
    }

    @Override
    public String toString() {
        return "Ronda{" +
                "nro='" + nro + '\'' +
                ", partidos=" + partidos +
                '}';
    }
}
