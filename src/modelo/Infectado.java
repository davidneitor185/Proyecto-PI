/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Santiago
 */
public class Infectado extends Persona {
    private String estado;
    private String fecha_D;
    private String id_Persona;
    private String pais_Pro;
    private String tipo_cont;

    public Infectado() {
    }
    
    

    public Infectado(String estado, String fecha_D, String id_Persona, String pais_Pro, String tipo_cont) {
        this.estado = estado;
        this.fecha_D = fecha_D;
        this.id_Persona = id_Persona;
        this.pais_Pro = pais_Pro;
        this.tipo_cont = tipo_cont;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha_D() {
        return fecha_D;
    }

    public void setFecha_D(String fecha_D) {
        this.fecha_D = fecha_D;
    }

    public String getId_Persona() {
        return id_Persona;
    }

    public void setId_Persona(String id_Persona) {
        this.id_Persona = id_Persona;
    }

    public String getPais_Pro() {
        return pais_Pro;
    }

    public void setPais_Pro(String pais_Pro) {
        this.pais_Pro = pais_Pro;
    }

    public String getTipo_cont() {
        return tipo_cont;
    }

    public void setTipo_cont(String tipo_cont) {
        this.tipo_cont = tipo_cont;
    }
    
    
    
}
