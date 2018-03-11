/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc1tarea4_201503723;

import javax.swing.JFrame;
import javax.swing.JTextField;

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
        
        //se crean textField y se le establecen las posiciones dentro de la ventana
        JTextField txtNumero1 = new JTextField();
        txtNumero1.setBounds(25, 50, 200, 50);
        
        JTextField txtNumero2 = new JTextField();
        txtNumero2.setBounds(250, 50, 200, 50);
        
        JTextField txtResultado = new JTextField();
        txtResultado.setBounds(475, 50, 200, 50);
        txtResultado.setEditable(false);
        
        //se agregan los componentes a la ventana
        ventana.add(txtNumero1);
        ventana.add(txtNumero2);
        ventana.add(txtResultado);
        
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
