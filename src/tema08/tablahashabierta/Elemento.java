package tema08.tablahashabierta;

public class Elemento {
    private String clave;
    private Integer valor;

    public Elemento(String clave, Integer valor) {
        this.clave = clave;
        this.valor = valor;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "(" + clave + "," + valor + ")";
    }
}
