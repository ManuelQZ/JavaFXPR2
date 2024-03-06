package co.edu.uniquindio.duff.duffbeer.model;

public class BeerBuilder {

    protected String nombre;
    protected String tipo;
    protected int cantidad;
    protected String color;
    protected String volumenAlcohol;
    private int cafeina;
    private int azucar:
    private String limon;

    public BeerBuilder(){

    }

    public BeerBuilder nombre(String nombre){

        this.nombre = nombre;
        return this;
    }
    public BeerBuilder tipo(String tipo){

        this.tipo = tipo;
        return this;
    }
    public BeerBuilder cantidad(int cantidad){

        this.cantidad = cantidad;
        return this;
    }
    public BeerBuilder color(String color){

        this.color = color;
        return this;
    }
    public BeerBuilder volumenAlcohol(String volumenAlcohol){

        this.volumenAlcohol = volumenAlcohol;
        return this;
    }
    public BeerBuilder cafeina(int cafeina){

        this.cafeina = cafeina;
        return this;
    }
    public BeerBuilder azucar(int azucar){

        this.azucar = azucar;
        return this;
    }
    public BeerBuilder limon(String limon){

        this.limon = limon;
        return this;
    }

    public BebidaDuff build(){
        BebidaDuff cerveza = new BebidaDuff(this);
        return cerveza;
    }

}
