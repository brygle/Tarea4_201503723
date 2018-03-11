/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc1tarea4_201503723;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

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
        
        //togglebuttons para establecer la operacion que se realizara
        JToggleButton btnSuma = new JToggleButton("+", true);
        btnSuma.setBounds(75,150,100,100);
        
        JToggleButton btnResta = new JToggleButton("-", false);
        btnResta.setBounds(300,150,100,100);
        
        JToggleButton btnMultiplicacion = new JToggleButton("*", false);
        btnMultiplicacion.setBounds(75,300,100,100);
        
        JToggleButton btnDivision = new JToggleButton("/", false);
        btnDivision.setBounds(300,300,100,100);
        
        //boton de igual para saber el resultado
        JButton btnIgual = new JButton("=");
        btnIgual.setBounds(525,225,100,100);
        
        //label de error por si no esta sellecionado ningun toggle button
        JLabel lblError = new JLabel("");
        lblError.setBounds(75, 500, 200, 200);
        
        //se agregan los componentes a la ventana
        ventana.add(txtNumero1);
        ventana.add(txtNumero2);
        ventana.add(txtResultado);
        ventana.add(btnSuma);
        ventana.add(btnResta);
        ventana.add(btnMultiplicacion);
        ventana.add(btnDivision);
        ventana.add(btnIgual);
        ventana.add(lblError);
        
        //se agregan los toggle buttons a un grupo para que solo 1 pueda ser seleccionado a la vez
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(btnSuma);
        grupo.add(btnResta);
        grupo.add(btnMultiplicacion);
        grupo.add(btnDivision);
        
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
