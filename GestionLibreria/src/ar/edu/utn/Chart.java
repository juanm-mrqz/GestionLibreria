package ar.edu.utn;

import java.util.ArrayList;

public class Chart {
    //Collection para agregar productos
    private ArrayList<Item> productos;

    //Constructor por default
    public Chart() {
        this.productos = new ArrayList<Item>();
    }; 




    //METODOS
    //Agregar producto al carrito
    public void addItem(Item p){
        this.productos.add(p); 
    }

    //Devolver Carrito

    public ArrayList<Item> getChart(){
        return this.productos; 
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

    //Eliminar item del carrito
    public void removeItem(Item item){
        if (getChart().contains(item)){
            this.productos.remove(item);
        }
    }

    //Eliminar todo el carrito
    public void removeChart(){
        this.productos = new ArrayList<Item>();
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
