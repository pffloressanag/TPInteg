import java.util.ArrayList;

public class Apostador {
    private int dni;
    private String nombre;
    private  String apellido;
    private ArrayList <Pronostico> apuesta_apost;

    //Creamos el constructor con sus atributos
    public Apostador(int dni, String nombre, String apellido){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Apostador(){
        this.apuesta_apost = new ArrayList<>();
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Pronostico> getApuesta_apost() {
        return apuesta_apost;
    }

    public void setApuesta_apost(ArrayList<Pronostico> apuesta_apost) {
        this.apuesta_apost = apuesta_apost;
    }
}
