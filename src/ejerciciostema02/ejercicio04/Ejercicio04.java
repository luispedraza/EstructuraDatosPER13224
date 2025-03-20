package ejerciciostema02.ejercicio04;

public class Ejercicio04 {
    public static void main(String[] args) {
        MatrizCuadradaEnteros matriz = null;
        try {
            matriz = new MatrizCuadradaEnteros(3);


            // Actualizar algunos valores
            matriz.actualizar(1, 0, 0);
            matriz.actualizar(2, 1, 1);
            matriz.actualizar(3, 2, 2);

            // Imprimir la matriz
            System.out.println(matriz.toString());

            // Buscar un valor
            System.out.println("Buscar 2: " + matriz.buscar(2));

            // Contar repeticiones
            System.out.println("Repeticiones de 0: " + matriz.repeticiones(0));

            // Resetear un elemento
            matriz.resetear(1, 1);
            System.out.println(matriz.toString());

            // Resetear toda la matriz
            matriz.resetear();
            System.out.println(matriz.toString());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
