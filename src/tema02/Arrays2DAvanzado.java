package tema02;

public class Arrays2DAvanzado {
    public static void main(String[] args) {
        int[][] array = new int[3][]; // creamos un vector de 3 elementos. Cada elemento es int[]
        for (int i = 0; i < 3; i++) {
            // número de elementos de la fila:
            int n = i + 1;
            array[i] = new int[n];
            for (int j = 0; j < n; j++) {
                array[i][j] = i + j;
            }
        }
        // Mostramos el contenido del array:
        for (int[] fila : array) {
            for (int elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.print("\n");
        }
    }
}
