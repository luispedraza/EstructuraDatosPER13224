package ejerciciostema01.ejercicio03;

/**
 * Clase que representa un número completo
 */
public class Complex {
    private double re;  // parte real
    private double im;  // parte imaginaria

    /**
     * Constructor que inicializa ambos atributos a cero
     */
    public Complex() {
        this.re = 0.0;
        this.im = 0.0;
    }

    /**
     * Constructor que incializa los tributos
     * @param re: parte real
     * @param im: parte imaginaria
     */
    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    /**
     * Calcula el módulo del número completo
     * Se emplea el método estático sqrt de la clase Math
     * @return
     */
    public double modulus() {
        return Math.sqrt(Math.pow(re,2) + Math.pow(im, 2));
    }

    // Setters y getters:

    public double getRe() {
        return re;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public double getIm() {
        return im;
    }

    public void setIm(double im) {
        this.im = im;
    }


    /**
     * Método toString que se pide en el ejercicio 3:
     */
    @Override
    public String toString() {
        return "Valor complejo: (" +
                this.re +
                " , " +
                this.im +
                "i)";
    }
}