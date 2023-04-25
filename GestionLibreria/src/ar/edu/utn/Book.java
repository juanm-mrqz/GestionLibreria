package ar.edu.utn;

import java.time.LocalDate; 

public class Book extends Product {
    //Fields no previstos por la clase Product
    private String title; 
    private String authorName;
    private String authorLastName;
    private LocalDate fechaPublicacion; 
    private String editorial; 
    
    
    //Constructor por default
    public Book() {}

    //Constructor con parametros
    public Book(String title, String authorName, String authorLastName, String fechaPublicacion, String editorial,
            int codigo, double precioCompra) {
        this.title = title;
        this.authorName = authorName;
        this.authorLastName = authorLastName;
        this.setFechaPublicacion(fechaPublicacion);
        this.editorial = editorial;
        this.codigo = codigo;
        this.precioCompra = precioCompra; 
    }


    //Metodos Accesores
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public String getAuthorLastName() {
        return authorLastName;
    }
    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }
    public LocalDate getFechaPublicacion() {
        return this.fechaPublicacion;
    }
    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = LocalDate.parse(fechaPublicacion, formato);
    }
    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }   

    public double getPrecioCompra(){
        return this.precioCompra;
    }

    public void setPrecioCompra(double precioCompra){
        this.precioCompra = precioCompra;
    }
    //Sobreescritura de metodos de la clase padre (Product)
    @Override
    public double getPrecioDigital(){
        return getPrecioCompra() * 1.08;
    }

    @Override
    public double getPrecioFisico(){
        return getPrecioCompra() * 1.18; 
    }
    
    @Override
    public void descripcion (){
        System.out.println("Titulo: " + this.getTitle());
        System.out.println("Autor: " + this.getAuthorName() + " " + this.getAuthorLastName());
        System.out.println("fecha de publicacion: " + this.getFechaPublicacion());
        System.out.println("Editorial: " + this.getEditorial());
        System.out.println("Codigo: " + this.getCodigo());
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
}
