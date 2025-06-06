package tema09.grafomatriz;

public class Gasolinera implements NodoGrafo {
    // Atributos que se leen del CSV:
    private String clave;   // Clave única de la gasolinera
    private String rotulo;  // Rótulo de la gasolinera
    private String direccion;   // Dirección de la gasolinera
    private String municipio;   // Municipio de la gasolinera
    private String localidad;

    public Gasolinera(String clave, String rotulo, String direccion, String municipio, String localidad) {
        this.clave = clave;
        this.rotulo = rotulo;
        this.direccion = direccion;
        this.municipio = municipio;
        this.localidad = localidad;
    }

    @Override
    public String getClave() {
        return clave;
    }

    @Override
    public String toString() {
        return "{" +
                "clave='" + clave + '\'' +
                ", rotulo='" + rotulo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", municipio='" + municipio + '\'' +
                ", localidad='" + localidad + '\'' +
                '}';
    }
}
