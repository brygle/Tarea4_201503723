/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc1tarea4_201503723;

import javax.swing.JFrame;

/**
 *
 * @author Bryan
 */
public class Calculadora {

    public Calculadora() {
        //Creo la ventana 
        JFrame ventana = new JFrame();
        //Le pongo titulo a la ventana
        ventana.setTitle("Calculadora");
        //Tamaño de la ventana
        ventana.setSize(725, 550);
        //Layout nulo
        ventana.setLayout(null);
        //Ventana visible
        ventana.setVisible(true);
        //termina la ejecucion del programa al cerrar la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
