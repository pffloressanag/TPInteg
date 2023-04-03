import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws java.io.IOException {

        BufferedReader s1 = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader("equipos.txt"));
                String s2 = br.readLine();
                String[] l1 = s2.split(";");
                Equipo equipo1 = new Equipo(l1[0], l1[1]);

                s2 = br.readLine();
                String[] l2 = s2.split(";");
                Equipo equipo2 = new Equipo(l2[0], l2[1]);


            int ge1 = (int)(Math.random()*10+1);
            int ge2 = (int)(Math.random()*10+1);

                Partido partido1 = new Partido(equipo1,equipo2,ge1,ge2);


            System.out.println(partido1.resultado());
            System.out.println("Equipo: "+ partido1.getEquipo1().getNombre() + " -  Goles: " + partido1.getGolesEquipo1());
            System.out.println("Equipo: "+ partido1.getEquipo2().getNombre() + " -  Goles: " + partido1.getGolesEquipo2());






            } catch(FileNotFoundException ex){
                System.out.println("Error: Archivo no encontrado");
                ex.printStackTrace();
            } finally{
                try {

                    // Cerrar el archivo si se ha podido abrir
                    if (s1 != null) {
                        s1.close();
                    }
                } catch (Exception ex) {
                    System.out.println("Error al cerrar el archivo");
                    ex.printStackTrace();
                }
            }








        }
    }