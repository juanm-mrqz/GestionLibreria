package ar.edu.utn;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Crear Productos
        Magazine revista = new Magazine("Titulo de una revista ", "2020-05-12", "Pepe", 201201, 200.40); 
        Product libro = new Book("IT", "Stephen", "King", "2001-02-12", "Editorial", 290113, 230.90);
        
        //Crear item del carrito
        Item i1 = new Item(libro, 2, true); 
        Item i2 = new Item(revista, 4, false); 
        
        Item i3 = new Item (new Book(), 2, false); 
        i3.setProducto(new Book("titulo","name", "lastname", "1998-02-01", "Lalo", 2010111, 120.40));

        //Crear carrito
        Chart carrito = new Chart();

        //Agregando items al carrito
        carrito.addItem(i1);
        carrito.addItem(i2);
        carrito.addItem(i3);

        //Mostrando resultados
        carrito.showItems();


    }
}
