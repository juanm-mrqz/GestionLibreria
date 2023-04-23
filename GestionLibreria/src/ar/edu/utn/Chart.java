package ar.edu.utn;

import java.util.ArrayList;

public class Chart {
    //Collection para agregar productos
    ArrayList<Item> productos = new ArrayList<Item>();

    //Constructor por default
    public Chart() {}; 

    //Plantear Constructor con parametros? 


    //METODOS
    //Agregar producto al carrito
    public void addItem(Item p){
        this.productos.add(p); 
    }

    //Mostrar los items del carrito
    public void showItems(){
        System.out.println("\t\t~~MiCarrito~~");
        for (Item product : productos){
            System.out.println("=====================");
            product.describeItem();
            System.out.println("=======================");
        }
        System.out.println("\n"); //salto de linea
        System.out.println("Total: " + getTotalPrice());
    }

    //Precio total del carrito
    public double getTotalPrice() {
        double result=0.0; 
        for (Item item : productos) {
            result +=item.totalPrice();
        }
        return result; 
    }
}
