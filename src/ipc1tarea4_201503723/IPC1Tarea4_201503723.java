/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc1tarea4_201503723;

import javax.swing.UIManager;

/**
 *
 * @author Bryan
 */
public class IPC1Tarea4_201503723 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*se agrega la libreria jtattoo para agregar el lookandfeel aluminium
        para darle estilo a la aplicacion*/
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IPC1Tarea4_201503723.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IPC1Tarea4_201503723.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IPC1Tarea4_201503723.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IPC1Tarea4_201503723.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        Calculadora calculadora = new Calculadora();
    }
    
}
