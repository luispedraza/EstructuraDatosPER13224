package ejerciciostema02.ejercicio04;

public class MatrizCuadradaEnteros {

    private int[][] matriz;
    private int capacidad = 0;

    /**
     * Constructor de la clase
     *
     * @param n: define el tamaño de la matriz cuadrada
     * @throws Exception: Lanza una excepción si el tamaño no es positivo
     */
    public MatrizCuadradaEnteros(int n) throws Exception {
        if (n <= 0) {
            throw new Exception("La capacidad de la matriz debe ser un valor positivo");
        }
        this.capacidad = n;
        matriz = new int[n][n];
    }

    // Actualiza el valor en una posición específica de la matriz
    public void actualizar(int valor, int fila, int columna) throws Exception {
        validarIndices(fila, columna);
        this.matriz[fila][columna] = valor;
    }

    // Resetea a cero un elemento en una posición específica
    public void resetear(int fila, int columna) throws Exception {
        validarIndices(fila, columna);
        this.matriz[fila][columna] = 0;
    }

    // Resetea toda la matriz a ceros
    public void resetear() {
        for (int i = 0; i < this.capacidad; i++) {
            for (int j = 0; j < this.capacidad; j++) {
                this.matriz[i][j] = 0;
            }
        }
    }

    // Busca un valor en la matriz
    public boolean buscar(int valor) {
        for (int i = 0; i < this.capacidad; i++) {
            for (int j = 0; j < this.capacidad; j++) {
                if (this.matriz[i][j] == valor) {
                    return true;
                }
            }
        }
        return false;   // si no se ha encontrado el valor
    }

    // Cuenta las repeticiones de un valor en la matriz
    public int repeticiones(int valor) {
        int contador = 0;
        for (int i = 0; i < this.capacidad; i++) {
            for (int j = 0; j < this.capacidad; j++) {
                if (this.matriz[i][j] == valor) {
                    contador++;
                }
            }
        }
        return contador;
    }

    // Devuelve la capacidad de la matriz (número de filas/columnas)
    public int capacidad() {
        return this.capacidad;
    }

    // Devuelve la representación en string de la matriz
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.capacidad; i++) {
            for (int j = 0; j < this.capacidad; j++) {
                sb.append(this.matriz[i][j]).append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    // Valida que los índices estén dentro de los límites de la matriz
    private void validarIndices(int fila, int columna) throws Exception {
        if (fila < 0 || fila >= capacidad || columna < 0 || columna >= this.capacidad) {
            throw new Exception("Índices fuera de los límites.");
        }

    }
}
