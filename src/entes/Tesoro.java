/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entes;

/**
 *
 * @author Josue
 */
public class Tesoro {

    private final String nombre;
    private final int posicionX;
    private final int posicionY;
    private final String ulr;
    private boolean estado;

    public Tesoro(final String nombre, final int posicionX, final int posicionY, final String url,final boolean estado) {
        this.nombre = nombre;
        this.posicionX = posicionX;
        this.posicionY= posicionY;
        this.ulr = url;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPosicionX() {
        return posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public String getUlr() {
        return ulr;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
