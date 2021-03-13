/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author Josue
 */
public class Tecla {

    private boolean pulsada = false;
    private long ultimaPulsacion = System.nanoTime();

    public void teclaPulsada() {
        pulsada = true;
        ultimaPulsacion = System.nanoTime();
    }

    public void teclaLiberada() {
        pulsada = false;
    }

    public boolean estaPulsada() {
        return pulsada;
    }

    public long obtenerUltimaPulsacion() {
        return ultimaPulsacion;
    }
}
