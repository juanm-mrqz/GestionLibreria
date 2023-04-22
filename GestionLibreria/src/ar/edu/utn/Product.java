package ar.edu.utn;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Product {
    static DateTimeFormatter formato = DateTimeFormatter.ISO_DATE; //formato de fecha para pasr como string a LocalDate
    
    //Fields
    protected double precioCompra; 
    protected LocalDate fechaPublicacion ; 
    protected int codigo; 

    //El precio de compra se usa para calcular despues el precio de venta
    double getPrecioCompra(){ 
        return this.precioCompra; 
    }

    void setPrecioCompra(double price){
        this.precioCompra = price;
    }

    //Metodos abstractos que se implementa despues en las clases Book y Magazine
    abstract double getPrecioDigital();
    abstract double getPrecioFisico();
    abstract void descripcion();
}
