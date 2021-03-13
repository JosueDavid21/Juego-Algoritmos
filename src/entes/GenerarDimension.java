/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entes;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;

/**
 *
 * @author Josue
 */
public class GenerarDimension {
    
    private final int WIDTH = Toolkit.getDefaultToolkit().getScreenSize().width;
    private final int HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height;
    private final int CUADROS_V = 20;
    private final int CUADROS_H = 32;
    private final int SOBRA_P = 4;
    private static final double POS_MENU = 0.1;

    //   Dimensiones de las pantallas
    private Point puntoInicioMenu;
    private Point puntoInicioJuego;
    private Point puntoInicioJugador;
    
    private static Dimension dimensionMenu , dimensionCuadro, dimensionPersonaje, dimensionJuego;

    public GenerarDimension() {
    }
    
    public GenerarDimension(Point puntoInicial) {
        int sobraY = (HEIGHT - (int)(HEIGHT*POS_MENU)) % CUADROS_V;
        int sobraX = WIDTH%CUADROS_H;
        dimensionMenu = new Dimension(WIDTH-sobraX, (int)(HEIGHT*POS_MENU)+sobraY);
        dimensionCuadro = new Dimension(WIDTH/CUADROS_H , (HEIGHT-dimensionMenu.height)/CUADROS_V);
        dimensionPersonaje = new Dimension(dimensionCuadro.width-SOBRA_P, dimensionCuadro.height-SOBRA_P);
        dimensionJuego = new Dimension(WIDTH-sobraX, HEIGHT-dimensionMenu.height);
        puntoInicioMenu = new Point(sobraX/2, dimensionJuego.height);
        puntoInicioJuego = new Point(sobraX/2, 0);
        puntoInicioJugador = new Point((puntoInicial.x*dimensionCuadro.width)+(SOBRA_P/2)+(sobraX/2), (puntoInicial.y*dimensionCuadro.height)+(SOBRA_P/2));
    }

    public Point getPuntoInicioMenu() {
        return puntoInicioMenu;
    }

    public Point getPuntoInicioJuego() {
        return puntoInicioJuego;
    }

    public Point getPuntoInicioJugador() {
        return puntoInicioJugador;
    }

    public Dimension getDimensionMenu() {
        return dimensionMenu;
    }

    public Dimension getDimensionPersonaje() {
        return dimensionPersonaje;
    }

    public Dimension getDimensionJuego() {
        return dimensionJuego;
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public static Dimension getDimensionCuadro() {
        return dimensionCuadro;
    }
    
    public int[] getPosicionActual(int posX, int posY){
        int[] retorno = new int[2];
        
        return retorno;
    }
}