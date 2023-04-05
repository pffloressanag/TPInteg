import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Path archivo = Paths.get("resultados.txt");
        Scanner leer = new Scanner(archivo);

        leer.useDelimiter("[;\\r]");

        Resultado r = new Resultado();

        while (leer.hasNext()){ //En cada vuelta lee una línea del archivo
            String nome1 = leer.next();
            int ge1 = leer.nextInt();
            String nome2 = leer.next();
            int ge2 = leer.nextInt();
            Partido nuevo = new Partido(nome1,ge1,nome2,ge2);
            r.agregarPartido(nuevo);
        }

        System.out.println(r.toString());

        leer.close();

        }
    }