/*
 * Programa	: Relacionado.java
 * Fecha	: 06/04/2020
 * Objetivo	: Modela la tabla relacionado
 * Programador	: Deiby Rodriguez
 */
package modelo;

/**
 *
 * @author Deiby Rodriguez
 */
public class Relacionado extends Persona{
    
    private String id_persona;
    private String id_infectado;
    private String fecha;
    private String lugar;

    public Relacionado() {
    }

    public Relacionado(String id_persona, String id_infectado, String fecha, String lugar) {
        this.id_persona = id_persona;
        this.id_infectado = id_infectado;
        this.fecha = fecha;
        this.lugar = lugar;
    }

    public String getId_persona() {
        return id_persona;
    }

    public void setId_persona(String id_persona) {
        this.id_persona = id_persona;
    }

    public String getId_infectado() {
        return id_infectado;
    }

    public void setId_infectado(String id_infectado) {
        this.id_infectado = id_infectado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
}
