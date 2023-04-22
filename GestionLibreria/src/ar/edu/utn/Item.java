package ar.edu.utn;

public class Item {
    private Product producto; 
    private int cantidad; 
    private boolean digital=false;
    public double precioUnitario; 
    
    //Default constructor
    public Item(){}

    //Params constructor
    public Item(Product producto, int cantidad, boolean digital){
        this.producto = producto; 
        this.cantidad = cantidad; 
        this.digital = digital; 
        this.precioUnitario = unitPrice();
    }

    //METODOS
    //precio unitario (Los metodos para obtener el precio estan implementados en Book y Magazine) 
    public double unitPrice(){
        if(this.digital){
            this.precioUnitario= producto.getPrecioDigital();
        }else{
            this.precioUnitario = producto.getPrecioFisico();
        }
        return this.precioUnitario; 
    }

    //Precio total de cada tipo de producto
    public double totalPrice() {
        return unitPrice()*cantidad; 
    }

    //Descripcion general del item
    public void describeItem(){
        producto.descripcion();
        System.out.println("Precio unitario: " + unitPrice());
        System.out.println("Cantidad: " + this.cantidad);
        System.out.println("Formato: " + (this.digital? "Digital" : "Fisico"));
        System.out.println("Subtotal :" + totalPrice());
    }

    }
    