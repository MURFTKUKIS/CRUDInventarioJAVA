/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudinventario;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author chris
 */
public class clsCliente {
    
    private String numero;
    private String nombre;
    private String tipo;
    private String razon;
    
    public clsCliente(String numero, String nombre, String tipo, String razon){        
        this.numero = numero;
        this.nombre = nombre;
        this.tipo = tipo;
        this.razon = razon;
    }
    
    public clsCliente(){
        
    }
    
    public String aTexto(){
        String cliente = this.numero + "|" + this.nombre + "|" + this.tipo + "|" + this.razon;
        return cliente;
    }
    
    public void guardar(){
        mCliente client  = new mCliente();
        client.insertar(this.aTexto());
        System.out.println(this.aTexto());
    }
    
    public DefaultListModel<String> llenarLista(){
        mCliente mClient = new mCliente();
        ArrayList<String> datos = mClient.consultar();
        
        DefaultListModel<String> modelLista = new DefaultListModel<>();
        
        for (String registro: datos){
            modelLista.addElement(registro);
        }
        
        return modelLista;
    }
    
    
}
