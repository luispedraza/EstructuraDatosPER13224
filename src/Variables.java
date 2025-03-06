

public class Variables {

    public static void main(String[] args) {
        // Este es el punto de entrada al programa
        // Aquí puedo comenzar a definir varibales y utilizar clases

        // Tipos de datos primitivo
        int variableEntera = 15;
        System.out.println("La variable variebleEntera vale: " + variableEntera);
        float variableFloat = 13.5f;
        System.out.println("variableFloat = " + variableFloat);
        long variableLong = 1345;
        System.out.println("variableLong = " + variableLong);

        // Variables referenciadas.
        Integer objetoEntero = 45;
        System.out.println("objetInteger = " + objetoEntero);

        int suma = variableEntera + objetoEntero;
        Integer objetoSuma = variableEntera + objetoEntero;

        System.out.println("La suma de los dos enteros es: " + objetoSuma);



    }


}
