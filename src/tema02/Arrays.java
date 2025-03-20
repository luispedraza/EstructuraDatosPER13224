package tema02;

public class Arrays {

    public static void main(String[] args) {
        // Creación de vectores (arrays de una dimensión)
        // Opción 1
        final int DIM = 5;
        int array1[] = new int[DIM];
        // Opción 2
        int[] array2 = new int[DIM];
        // Opción 3
        int array3[] = {1, 2, 3, 4, 5};
        int[] array4 = {1, 2, 3, 4, 5};

        // Obtención de valores:
        System.out.println("array4[2] vale: " + array4[2]);
        // Asignación de valores:
        array4[2] = 0;
        System.out.println("Ahora array4[2] vale: " + array4[2]);

        // Recorrido del array:
        for (int i = 0; i < array1.length; i++) {
            // Damos valores a los elementos
            array1[i] = i * 2;
        }
        // Recorrido del array (otra manera)
        System.out.println("Contenido de array1: ");
        for (int elemento : array1) {
            System.out.println(elemento + " ");
        }
    }
}
