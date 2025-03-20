package tema02;

public class Arrays2D {

    public static void mostrarMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // declaramos una matriz de enteros: arrays de dos dimensiones
        int[][] matriz = new int[2][3];
        // Inicializar valores: todos valen 2
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 2;
            }
        }
        // Mostramos el contenido en pantalla
        mostrarMatriz(matriz);
        matriz[0][0] = 0;
        mostrarMatriz(matriz);

    }
}
