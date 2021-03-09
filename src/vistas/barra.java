/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.attribute.standard.PresentationDirection;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author edgar
 */
public class barra {
    public String sonido = "C:\\Users\\edgar\\OneDrive\\Documentos\\NetBeansProjects\\Juego-Algoritmos\\src\\musica\\juego-de-tronos-2.wav";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
//        VistaInicial pre = new VistaInicial();
//      pre.setVisible(true);
//      IngresoUsuario iniciar = new IngresoUsuario();
//      barra d = new barra();
//        d.repr();
//      try {
//          for (int i = 0; i <= 100; i++) {
//              Thread.sleep(90);
//              pre.progreso.setText(Integer.toString(i)+"%");
//              pre.barra.setValue(i);
//                                  
//              
//              
//              if(i==100){
//                  pre.setVisible(false);
//              iniciar.setVisible(true);
//          }
//          }
//      
//      }catch (Exception e){
//
//}
//      
        barra d = new barra ();
        d.repr();
     
    }
     public void repr(){
         
      
         Timer tiempo = new Timer ();
         TimerTask reproducir;
        reproducir = new TimerTask() {
            @Override
            public void run() {
                try {
                    //                try {
//                    AudioSystem.getAudioInputStream(getClass().getResourceAsStream(sonido + ".wav"));
//                } catch (UnsupportedAudioFileException ex) {
//                    Logger.getLogger(barra.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (IOException ex) {
//                    Logger.getLogger(barra.class.getName()).log(Level.SEVERE, null, ex);
//                }
                AudioSystem.getAudioInputStream(getClass().getResourceAsStream(sonido + ".wav"));
                
                } catch (UnsupportedAudioFileException ex) {
                    Logger.getLogger(barra.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(barra.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        tiempo.schedule(reproducir, 1000,0);
                 
      
      
      }
}
