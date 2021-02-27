/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entes;

/**
 *
 * @author grace
 */
public class Isla {
    
    private final String nombre;
    private final String imagen;
    private final int[][] matriz;

    public Isla(final String nombre, final String imagen, final int [][] matriz) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.matriz = matriz;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUrlImagen() {
        return imagen;
    }

    public int[][] getMatriz() {
        return matriz;
    }
}
