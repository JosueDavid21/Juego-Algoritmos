/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import entes.GenerarDimension;
import entes.Isla;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author grace
 */
public class VistaIsla extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form Isla
     */
    private static int xJugador;
    private static int yJugador;
    private static String rutaPersonaje;
    private static String rutaIsla;
    private int[][] matrizIsla;

    GenerarDimension dimensiones;

    JLabel jLfondo = new JLabel();
    JLabel jLpersonaje = new JLabel();
    JLabel jLMapa = new JLabel();

    Timer tiempo1 = new Timer(5, this);
    boolean izquierda = false;
    boolean derecha = false;
    boolean arriba = false;
    boolean abajo = false;

    public VistaIsla(Isla isla) {
        dimensiones = new GenerarDimension(new Point(16, 10));
        xJugador = dimensiones.getPuntoInicioJugador().x;
        yJugador = dimensiones.getPuntoInicioJugador().y;

        rutaPersonaje = "src/imagenes/personajes/protagonista.jpg";

        rutaIsla = isla.getUrlImagen();
        matrizIsla = isla.getMatriz();
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setSize(dimensiones.getWIDTH(), dimensiones.getHEIGHT());
        this.setResizable(false);
        this.setLocation(0, 0);
        this.getContentPane().setBackground(Color.black);
        generarPersonaje(rutaPersonaje);
        generarIsla();
    }

    private void generarIsla() {
        jLMapa.setLocation(dimensiones.getPuntoInicioJuego());
        jLMapa.setSize(dimensiones.getDimensionJuego());
        ImageIcon fot = new ImageIcon(rutaIsla);
        Icon icono = new ImageIcon(fot.getImage().getScaledInstance(dimensiones.getDimensionJuego().width, dimensiones.getDimensionJuego().height, Image.SCALE_DEFAULT));
        jLMapa.setIcon(icono);
        add(jLMapa);
        this.repaint();
    }

    private void generarPersonaje(String ruta) {
        Image imgEscalada = new ImageIcon(ruta).getImage().getScaledInstance(dimensiones.getDimensionPersonaje().width,
                dimensiones.getDimensionPersonaje().height, Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        jLpersonaje.setSize(dimensiones.getDimensionPersonaje().width, dimensiones.getDimensionPersonaje().height);
        jLpersonaje.setIcon(iconoEscalado);
        jLpersonaje.setLocation(dimensiones.getPuntoInicioJugador());
        add(jLpersonaje);
    }

    private void mover(java.awt.event.KeyEvent evt) {
        xJugador = jLpersonaje.getLocation().x;
        yJugador = jLpersonaje.getLocation().y;
        if (comprobar(evt.getKeyChar(), xJugador, yJugador)) {
            switch (String.valueOf(evt.getKeyChar())) {
                case "w":
                    jLpersonaje.setLocation(xJugador, yJugador - dimensiones.getDimensionPersonaje().height);
                    break;
                case "s":
                    jLpersonaje.setLocation(xJugador, yJugador + dimensiones.getDimensionPersonaje().height);
                    break;
                case "a":
                    jLpersonaje.setLocation(xJugador - dimensiones.getDimensionPersonaje().width, yJugador);
                    break;
                case "d":
                    jLpersonaje.setLocation(xJugador + dimensiones.getDimensionPersonaje().width, yJugador);
                    break;
                default:
                    break;
            }
        }

    }

    public boolean comprobar(char tecla, int x, int y) {
        int i = x / dimensiones.getDimensionPersonaje().width;
        int j = y / dimensiones.getDimensionPersonaje().height;
        int valorProximo = 0;
        switch (String.valueOf(tecla)) {
            case "w":
                valorProximo = matrizIsla[i][j - 1];
                break;
            case "s":
                valorProximo = matrizIsla[i][j + 1];
                break;
            case "a":
                valorProximo = matrizIsla[i - 1][j];
                break;
            case "d":
                valorProximo = matrizIsla[i + 1][j];
                break;
            default:
                break;
        }
        return valorProximo < 11;
    }

    public void icono(JLabel foto_icono, String nodo) {
//        Dimension d = new Dimension(dimensiones.getDimensionPersonaje().width, dimensiones.getDimensionPersonaje().height);
//        foto_icono.setSize(d);
        Image imgEscalada = new ImageIcon(rutaPersonaje).getImage().getScaledInstance(dimensiones.getDimensionPersonaje().width,
                dimensiones.getDimensionPersonaje().height, Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        foto_icono.setIcon(iconoEscalado);
    }

    public void actionPerformed(ActionEvent c) {
//        x = personaje.getX();
//        y = personaje.getY();
//        actualizar();
//        if (comprobarnum(tecla, 4)) {
//            mover();
//        }
////        mover();
//        t = t + 1;
//        System.out.println(t);
////        p1.actualizar();
////        p1.mover(personaje);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });
        getContentPane().setLayout(null);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int i = 0;
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
//        mover(evt);
        tiempo1.start();
        System.out.println(i);
        if (evt.getKeyCode() == 65) {
            izquierda = true;
        } else if (evt.getKeyCode() == 68) {
            derecha = true;
        } else if (evt.getKeyCode() == 87) {
            arriba = true;
        } else if (evt.getKeyCode() == 83) {
            abajo = true;
        }
        if (evt.getKeyCode() == evt.VK_ESCAPE) {
            System.exit(0);
        }
    }//GEN-LAST:event_formKeyPressed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        i++;
        if (evt.getKeyCode() == 65) {
            izquierda = false;
            mover(evt);
            icono(jLpersonaje, "izquierda");
        } else if (evt.getKeyCode() == 68) {
            derecha = false;
            icono(jLpersonaje, "derecha");
            mover(evt);
        } else if (evt.getKeyCode() == 87) {
            arriba = false;
            icono(jLpersonaje, "arriba");
            mover(evt);
        } else if (evt.getKeyCode() == 83) {
            abajo = false;
            icono(jLpersonaje, "abajo");
            mover(evt);
        }
        if ((!arriba && !abajo && !izquierda && !derecha)) {
            tiempo1.stop();
        }
    }//GEN-LAST:event_formKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
