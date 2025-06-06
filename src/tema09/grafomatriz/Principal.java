package tema09.grafomatriz;

import java.util.*;
import java.io.*;
import java.nio.charset.Charset;

public class Principal {
    private static Grafo grafo = new Grafo();

    public static void main(String[] args) {
    	//Obtiene las rutas de los archivos CSV
        String directorioProyecto = System.getProperty("user.dir");
        String separador = System.getProperty("file.separator");
        String pathFicheroGasolineras = directorioProyecto + separador + "data" + separador + "gasolineras.csv";
        String pathFicheroDistanciasGasolineras = directorioProyecto + separador + "data" + separador + "distancias-gasolineras.csv";

        //Carga los datos de las gasolineras y distancias
        cargarGasolineras(pathFicheroGasolineras);
        cargarDistancias(pathFicheroDistanciasGasolineras);
        System.out.println(grafo);

    }

    /**
     * Carga en el grafo la información de los nodos desde el fichero "gasolineras.csv"
     * @param pathFichero ruta del archivo "gasolineras.csv"
     */
    private static void cargarGasolineras(String pathFichero) {
        try (BufferedReader br = new BufferedReader(new FileReader(pathFichero, Charset.forName("ISO-8859-1")))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
                if (datos.length == 5) {
                    // Lectura correcta
                	//  Crea una nueva Gasolinera y la inserta en el grafo
                    Gasolinera g = new Gasolinera(datos[2], datos[4], datos[3], datos[0], datos[1]);
                    if (grafo.insertarNodo(g)) {
                        System.out.println("Nodo insertado: " + g.getClave());
                    } else {
                        System.err.println("Error al insertar nodo: " + g.getClave());
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Carga la información de las aristas del fichero "distancias-gasolineras.csv"
     * @param pathFichero ruta del fichero "gasolineras.csv"
     */
    private static void cargarDistancias(String pathFichero) {
        try (BufferedReader br = new BufferedReader(new FileReader(pathFichero, Charset.forName("ISO-8859-1")))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
                if (datos.length == 3) {
                    String clave1 = datos[0];
                    String clave2 = datos[1];
                    double distancia = Double.parseDouble(datos[2].replace(",", "."));

                    //Inserta la arista en el grafo si ambos nodos existen
                    if (grafo.existeNodo(clave1) && grafo.existeNodo(clave2)) {
                        grafo.insertarArista(clave1, clave2, distancia);
                    } else {
                        System.err.println("Advertencia: Nodo(s) no encontrado(s) para la arista: " + clave1 + " - " + clave2);
                    }
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }




}