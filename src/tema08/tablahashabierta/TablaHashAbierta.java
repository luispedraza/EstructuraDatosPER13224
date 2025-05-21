package tema08.tablahashabierta;

import java.util.LinkedList;

public class TablaHashAbierta {

    private int tamVector;                    // Tamaño del vector de soporte
    private int numElementos;                   // Número de elementos almacenados en la tabla
    private LinkedList<Elemento>[] vector;    // Vector de soporte.
    // Recordemos: Cada elemento del vector es una lista de los elementos que colisionan
    private double FC;    // Factor de carga actual de la tabla (para redisperisón)
    // Recordemos: deberemos calcularlo cada vez que insertemos o eliminemos un elemento

    // NOta: SuppressWarnings("unchecked") se utiliza en Java para suprimir advertencias del compilador relacionadas
    // con conversiones no comprobadas (unchecked conversions). Es decir, cuando se realiza una conversión de tipo que
    // el compilador no puede verificar completamente que sea segura, genera una advertencia.
    // La anotación SuppressWarnings("unchecked") indica al compilador que el programador cree que la conversión
    // es segura y que no causará problemas en tiempo de ejecución, por lo que la advertencia se ignora.
    @SuppressWarnings("unchecked")
    public TablaHashAbierta(int tamVector) {

        this.tamVector = tamVector;
        this.vector = new LinkedList[this.tamVector];
        numElementos = 0;

        for (int i = 0; i < this.tamVector; i++) {
            // Inicializa cada una de las listas
            vector[i] = new LinkedList<>();
        }
        this.FC = 0;
    }

    /**
     * Función hash para un vector de soporte de tamaño dado
     *
     * @param clave clave del elemento de tipo string
     * @param tam   tamaño del vector de soporte
     * @return valor numérico de la función hash
     */
    private int hash(String clave, int tam) {
        int hash = clave.hashCode();
        return Math.abs(hash) % tam;
        // Implementación alternativa:
//		int hash = 0;
//		char c;
//		int indice;
//
//		for(int i = 0; i < clave.length(); i++) {
//			c = clave.charAt(i);
//			hash += (int) c;
//		}
//		indice = hash % tam;
//		return indice;
    }


    /**
     * Inserción de un elemento en la tabla
     * Solo se inserta si el elemento no existe
     * Implementación alternativa: actualizar el valor si existe
     *
     * @param clave clave del nuevo elemento (String)
     * @param valor valor del nuevo elemento (entero)
     */
    public void insertar(String clave, int valor) {
        if (buscar(clave) != null)  // La clave ya existe, no hacer nada
            return;

        int indice = hash(clave, tamVector);  // Cálculo del índice de inserción en el vector

        Elemento nuevoElemento = new Elemento(clave, valor);    // Crear el nuevo elemento
        vector[indice].add(nuevoElemento);                     // Insertar en nuevo elemento en la lista.
        // Nota: El método "add" de LinkedList añade al final de la lista

        numElementos++;
        calcularFC(); // hay que calcularlo tras insertar el nuevo elemento

        if (FC > 1) {
            // Es necesaria la redispersión
            redispersion();
            System.out.println("Redispersion necesaria, FC = " + FC);
        } else {
            System.out.println("La redispersion no es necesaria, FC = " + FC);
        }
    }

    /**
     * Calcula el factor de carga actual
     */
    private void calcularFC() {
        // actualizar el factor de carga
        FC = (double) numElementos / tamVector;
    }

    /**
     * Método que comprueba si un valor entero es primo
     *
     * @param n valor a comprobar
     * @return true si es primo, false si no lo es
     */
    public boolean esPrimo(int n) {
        if (n % 2 == 0)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    /**
     * Devuelve el siguiente valor primo al parámetro
     *
     * @param n parámetro entero
     * @return siguiente valor primo
     */
    public int siguientePrimo(int n) {
        int siguiente = n;
        while (!esPrimo(siguiente))
            siguiente++;
        return siguiente;
    }

    /**
     * Realiza la redispersión (en caso de que FC > 1)
     */
    @SuppressWarnings("unchecked")
    private void redispersion() {
        int indice, nuevoTamVector;
        LinkedList<Elemento> lista;

        // inicializar el nuevo vector de soporte
        nuevoTamVector = siguientePrimo(2 * tamVector);
        LinkedList<Elemento>[] nuevoVector = new LinkedList[nuevoTamVector];
        for (int i = 0; i < nuevoTamVector; i++) nuevoVector[i] = new LinkedList<>();

        // Ahora hay que copiar el contenido:
        for (int i = 0; i < tamVector; i++) {   // Recorrido del vector actual
            lista = vector[i];
            for (Elemento elem : lista) {
                indice = hash(elem.getClave(), nuevoTamVector);     // Cálculo del índice en el nuevo vector
                nuevoVector[indice].add(elem);                      // Inserción del elemento en la lista
            }
        }
        // actualización de los atributos
        vector = nuevoVector;
        tamVector = nuevoTamVector;
    }


    /**
     * Busca un elemento por su clave
     *
     * @param clave clave buscada
     * @return valor encontrado, null si no se encuentra
     */
    public Integer buscar(String clave) {
        int indice = hash(clave, tamVector);        // índice de la lista en la que estaría el elemento
        for (Elemento elem : vector[indice]) {      // Recorrido de la lista
            if (elem.getClave().equals(clave)) {
                return elem.getValor();     // Elemento encontrado
            }
        }
        return null;
    }


    /**
     * Representación de la tabla en formato string
     * @return Representación en formato string. En cada fila n se muestra el contenido de la lista correspondiente.
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        LinkedList<Elemento> lista;
        for (int i = 0; i < this.tamVector; i++) {
            sb.append("[posición ").append(i).append("] ->");
            lista = vector[i];
            for (Elemento elem : lista) {
                sb.append(elem);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
