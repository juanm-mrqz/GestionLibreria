package ar.edu.utn;

import java.time.LocalDate;


public class Magazine extends Product  {
    //Fields que no estan previstas por la clase abstracta
    private String name; 
    private LocalDate fechaPublicacion; 
    private String editor; 

    //Default constructor
    public Magazine(){}

    //Constructor con parametros
    public Magazine(String name, String fechaPublicacion, String editor, int codigo, double precio) {
        this.name = name;
        this.fechaPublicacion = LocalDate.parse(fechaPublicacion,formato);
        this.editor = editor;
        this.codigo = codigo;
        this.precioCompra = precio; 
    }

    //Metodos accesores (Getters y Setters)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }
    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    public String getEditor() {
        return editor;
    }
    public void setEditor(String editor) {
        this.editor = editor;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    } 

    @Override
    public double getPrecioDigital(){
        return this.precioCompra * 1.12;
    }
    
    @Override
    public double getPrecioFisico(){
        return this.precioCompra * 1.22; 
    }

    //Sobreescritura de metodos de la clase padre (Product)
    @Override
    void descripcion () {
        System.out.println("Nombre: "+ this.getName());
        System.out.println("Fecha publicacion: " + this.getFechaPublicacion());
        System.out.println("Editor: " + this.getEditor());
        System.out.println("Codigo Referencia: "+ this.getCodigo());
    }
    
    
}
