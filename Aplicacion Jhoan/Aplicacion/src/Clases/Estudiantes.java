/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 
 */
public class Estudiantes {
    
    private int cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private int telefono;
    private String clave;
    private Map<String,String> Est = new HashMap();
    
    public Estudiantes(){
   
    Est.put("Cedula", "73227567");
    Est.put("Nombre", "Jhoan Sebastian");
    Est.put("Apellido", "Diaz Castro");
    Est.put("Direccion", "San Jose de los campanos");
    Est.put("Telefono", "3022922606");
    Est.put("Clave", "Jhoanse2024.");
        
    }
    
    public boolean ValidarDatos(String pCedula, String pClave){
       
        System.out.println(pCedula);
        System.out.println(pClave);
        
        boolean logueado = false;
        if( Est.get("Cedula").equals(pCedula)&& Est.get("Clave").equals(pClave))
        {
            logueado = true;
            return logueado;
            
        }
        return logueado;
       
    }

    /**
     * @return the cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * @return the Est
     */
    public Map<String,String> getEst() {
        return Est;
    }

    /**
     * @param Est the Est to set
     */
    public void setEst(Map<String,String> Est) {
        this.Est = Est;
    }
    
    
}
