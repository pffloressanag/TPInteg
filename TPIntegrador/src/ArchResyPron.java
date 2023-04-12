import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ArchResyPron {

    private static ArrayList cargaResultados() throws IOException {
        Path archivo = Paths.get("resultados.csv");
        Scanner leer = new Scanner(archivo);
        leer.useLocale(Locale.forLanguageTag("es-AR"));
        leer.useLocale(Locale.ENGLISH);

        leer.useDelimiter("[;\\r]");

        ArrayList r = new ArrayList<>();

        while (leer.hasNext()) { //En cada vuelta lee una línea del archivo
            String nome1 = leer.next();
            int ge1 = leer.nextInt();
            String nome2 = leer.next();
            int ge2 = leer.nextInt();
            Partido p1 = new Partido(nome1, ge1, nome2, ge2);
            r.add(p1);

        }

        leer.close();
        return r;
    }

    private static ArrayList cargaPronostico() throws IOException {
        Path pronostico = Paths.get("pronostico.csv");
        Scanner leer_pronostico = new Scanner(pronostico);
        leer_pronostico.useLocale(Locale.forLanguageTag("es-AR"));
        leer_pronostico.useLocale(Locale.ENGLISH);

        leer_pronostico.useDelimiter("[;\\n]");

        ArrayList p = new ArrayList<>();

        while (leer_pronostico.hasNextLong()) {
            long dni = leer_pronostico.nextLong();
            String nombre = leer_pronostico.next();
            String apellido = leer_pronostico.next();
            String apuestas_lev = leer_pronostico.next();
            Pronostico pronostico1 = new Pronostico();
        }


        leer_pronostico.close();
        return p;
    }
}
