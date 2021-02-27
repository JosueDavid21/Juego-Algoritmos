/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import entes.Mapa;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author grace
 */
public class Isla extends javax.swing.JFrame {

    /**
     * Creates new form Isla
     */
    private static int width = Toolkit.getDefaultToolkit().getScreenSize().width;
    private static int height = Toolkit.getDefaultToolkit().getScreenSize().height;
    private static int xJugador = width / 2;
    private static int yJugador = height / 2;
    private static String rutaPersonaje;
    private static String rutaIsla;
    private final Dimension cuadro;
    private int[][] matrizIsla;
    private static final int CUADROS_VERT = 20;
    private static final int CUADROS_HOR = 32;

    JLabel jLpersonaje = new JLabel();
    JLabel jLMapa = new JLabel();

    public Isla(Mapa isla) {
        rutaIsla = isla.getUrlImagen();
        rutaPersonaje = "src/imagenes/personajes/protagonista.jpg";
        matrizIsla = isla.getMatriz();
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setSize(width, height);
        this.setResizable(false);
        this.setLocation(0, 0);
        this.setBackground(Color.BLUE);

        cuadro = generarDimCuadro();
        generarPersonaje(rutaPersonaje);
        generarIsla();
    }

    private Dimension generarDimCuadro() {
        double w = width / CUADROS_HOR;
        double wDecimal = w % 1;
        double h = height / CUADROS_VERT;
        double hDecimal = h % 1;
        int wEntero = (int) (w - wDecimal);
        int hEntero = (int) (h - hDecimal);
        if(width - (wEntero*CUADROS_HOR) != 0)
            width = wEntero*CUADROS_HOR;
        if(height - (hEntero*CUADROS_VERT) != 0)
            height = hEntero*CUADROS_VERT;
        
        return new Dimension((int) (w - wDecimal), (int) (h - hDecimal));
    }

    private void generarIsla() {
        jLMapa.setLocation(0, 0);
        jLMapa.setSize(width, height);
        ImageIcon fot = new ImageIcon(rutaIsla);
        Icon icono = new ImageIcon(fot.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
        jLMapa.setIcon(icono);
        add(jLMapa);
        this.repaint();
    }

    private void generarPersonaje(String ruta) {
        Image imgEscalada = new ImageIcon(ruta).getImage().getScaledInstance(cuadro.width, cuadro.height, Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        jLpersonaje.setSize(cuadro.width, cuadro.height);
        jLpersonaje.setIcon(iconoEscalado);
        jLpersonaje.setLocation(xJugador, yJugador);
        jLpersonaje.setVisible(true);
        add(jLpersonaje);
    }
    
    private void mover(java.awt.event.KeyEvent evt) {
        xJugador = jLpersonaje.getLocation().x;
        yJugador = jLpersonaje.getLocation().y;
        if(comprobar(evt.getKeyChar(), xJugador, yJugador)){
            switch(String.valueOf(evt.getKeyChar())){
            case "w":
                jLpersonaje.setLocation(xJugador, yJugador-cuadro.height);
                break;
            case "s":
                jLpersonaje.setLocation(xJugador, yJugador+cuadro.height);
                break;
            case "a":
                jLpersonaje.setLocation(xJugador-cuadro.width, yJugador);
                break;
            case "d":
                jLpersonaje.setLocation(xJugador+cuadro.width, yJugador);
                break;
            default:
                break;
        }
        }
        
    }

    public boolean comprobar(char tecla, int x, int y) {
        int i = x/cuadro.width;
        int j = y/cuadro.height;
        int valorProximo = 0;
        switch(String.valueOf(tecla)){
            case "w":
                valorProximo = matrizIsla[i][j-1];
                break;
            case "s":
                valorProximo = matrizIsla[i][j+1];
                break;
            case "a":
                valorProximo = matrizIsla[i-1][j];
                break;
            case "d":
                valorProximo = matrizIsla[i+1][j];
                break;
            default:
                break;
        }
        return valorProximo < 11;
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
        setBackground(new java.awt.Color(51, 51, 255));
        setForeground(new java.awt.Color(51, 51, 255));
        setUndecorated(true);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        mover(evt);
    }//GEN-LAST:event_formKeyPressed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Isla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Isla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Isla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Isla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Isla().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
