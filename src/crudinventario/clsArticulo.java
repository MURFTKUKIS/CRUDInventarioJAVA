/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudinventario;

/**
 *
 * @author chris
 */
public class clsArticulo {
    
    private String codigo;
    private String descripcion;
    private Double precio;
    
    public clsArticulo(String codigo, String descripcion, Double precio){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    public String aTexto(){
        String articulo = this.codigo + "|" + this.descripcion + "|" + this.precio;
        return articulo;
    }
    
    public void guardar(){
        mArticulo article = new mArticulo();
        article.insertar(this.aTexto());
        System.out.println(this.aTexto());
    }
}
