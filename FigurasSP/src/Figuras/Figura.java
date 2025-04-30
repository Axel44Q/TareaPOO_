package Figuras;

import SuperH.Superheroes;

public class Figura extends Superheroes {
    private String codigo;
    private double precio;
    private Dimensiones.dimension dimension;

    public Figura(String nombre, String descripcion, boolean capa, String codigo, double precio,
                  Dimensiones.dimension dimension) {
        super(nombre, descripcion, capa);
        this.codigo = codigo;
        this.precio = precio;
        this.dimension = dimension;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Dimensiones.dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimensiones.dimension dimension) {
        this.dimension = dimension;
    }

 
    public String toString() {
        return "Código: " + codigo + ", Precio: " + precio + ", Dimensiones: " + dimension.toString();
    }

    public double subirPrecio(int dinero) {
        this.precio += dinero;
        return this.precio;
    }
}