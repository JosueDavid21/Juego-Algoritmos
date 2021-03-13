/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;


import java.awt.Frame;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author edgar
 */
public class barra {

    /**
     * @param args the command line arguments
     */
    public barra() {

    }
    public static void main(String[] args) throws Exception {
        String musica= "src/musica/juego-de-tronos.wav";
        VistaInicial pre = new VistaInicial();
        System.out.println("hola");
//        IngresoUsuario usuario= new IngresoUsuario();
        pre.setVisible(true);
        pre.progres();
               
    }

    public void ReproducirSonido(String nombreSonido,Frame ven) throws LineUnavailableException, UnsupportedAudioFileException{
       Clip clip = AudioSystem.getClip();
//      if(ven.){
        try {
 
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(nombreSonido).getAbsoluteFile());
       
        clip.open(audioInputStream);
        clip.start();
        
       } catch(IOException | LineUnavailableException ex) {
         System.out.println("Error al reproducir el sonido.");
       }
          clip.stop();
      }
     }
//}

