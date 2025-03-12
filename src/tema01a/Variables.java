package tema01a;

public class Variables {

    public static void main(String[] args) {
        boolean valorBooleano = true;
        String nombre = "Hola";
        nombre = "Luis";

        System.out.println(nombre);
        // esto es un comentario de línea
        /*
        Esto es un comentario de bloque
         */

        String caracteresEspeciales = "uno\btoro\nrana\rratón";
        System.out.println(caracteresEspeciales);

        // Números enteros:
        // entre 128 y 127
        byte enteroByte = 127;
        System.out.println("enteroByte = " + enteroByte);
        Byte objetoByte = enteroByte;
        System.out.println("objetoByte = " + objetoByte);
        // entre 32768 a 32767
        short enteroShort = 32767;
        Short objetoShort = enteroShort;
        System.out.println("objetoShort = " + objetoShort);
        System.out.println("enteroShort = " + enteroShort);

        // entre 2147483648 a 2147483647
        int enteroInt = 2147483647;
        Integer objetoInteger = enteroInt;
        System.out.println("objetoInteger = " + objetoInteger);
        System.out.println("enteroInt = " + enteroInt);
        // entre 9223372036854775808 a 9223372036854775807
        long enteroLong = 9223372036854775807L;
        System.out.println("enteroLong = " + enteroLong);
        Long objetoLong = enteroLong;
        System.out.println("objetoLong = " + objetoLong);

        // Números reales
        // entre 1.4E-45 i 3.4028235E+38
        float realFloat = 3.1416f;
        System.out.println("realFloat = " + realFloat);
        // entre 4.9E-324 a 1.7976931348623157E+308
        double realDouble = 4.7029235E3;
        System.out.println("realDouble = " + realDouble);

        // caracter: comillas simples
        char letra = 'e';
        System.out.println("letra = " + letra);
        char simbolo = '*';
        System.out.println("simbolo = " + simbolo);
        // caracteres unicode (mapa de caracteres en windows)
        char unicode = '\u0398';
        System.out.println("unicode = " + unicode);

        var otro = 5;
        System.out.println();
    }


}
