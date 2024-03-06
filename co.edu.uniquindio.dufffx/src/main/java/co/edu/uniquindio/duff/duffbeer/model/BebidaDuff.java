package co.edu.uniquindio.duff.duffbeer.model;

public class BebidaDuff {
    private String nombre;
    private String tipo;
    private int cantidad;
    private String color;
    private String volumenAlcohol;
    private int cafeina;
    private int azucar:
    private String limon;


    public BebidaDuff(BeerBuilder builder){
        this.nombre = builder.nombre;
        this.tipo = builder.tipo;
        this.cantidad = builder.cantidad;
        this.color = builder.color;
        this.volumenAlcohol = builder.volumenAlcohol;
        this.cafeina = builder.cafeina;
        this.azucar = builder.azucar;
        this.limon = builder.limom;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getColor() {
        return color;
    }

    public String getVolumenAlcohol() {
        return volumenAlcohol;
    }

     public String getCafeina() {
        return cafeina;
    }

    public int getAzucar() {
        return azucar;
    }

    public String getLimon() {
        return limon;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", cantidad=" + cantidad +
                ", color='" + color + '\'' +
                ", volumenAlcohol='" + volumenAlcohol + '\'' +
                ", cafeina='" + cafeina + '\'' +
                ", azucar='" + azucar + '\'' +
                ", limon='" + limon + '\'' +
                '}';
    }
}
