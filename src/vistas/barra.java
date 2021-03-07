/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import javax.print.attribute.standard.PresentationDirection;

/**
 *
 * @author edgar
 */
public class barra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//    VistaInicial pre = new VistaInicial();
//    pre.setVisible(true);
//    IngresoUsuario iniciar = new IngresoUsuario();
//    try{  
//    
//        for (int i = 0; i <= 100; i++) {
//            Thread.sleep(50);
//            pre.pro
//        }
    
//    }catch(Exeption e){}
//            
        VistaInicial pre = new VistaInicial();
      pre.setVisible(true);
      IngresoUsuario iniciar = new IngresoUsuario();
      try {
          for (int i = 0; i <= 100; i++) {
              Thread.sleep(90);
              pre.progreso.setText(Integer.toString(i)+"%");
              pre.barra.setValue(i);
              
              
              if(i==100){
                  pre.setVisible(false);
              iniciar.setVisible(true);
          }
          }
      
      }catch (Exception e){

}
    }
    
}
