/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc1tarea4_201503723;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        btnSuma.setBounds(75, 150, 100, 100);

        JToggleButton btnResta = new JToggleButton("-", false);
        btnResta.setBounds(300, 150, 100, 100);

        JToggleButton btnMultiplicacion = new JToggleButton("*", false);
        btnMultiplicacion.setBounds(75, 300, 100, 100);

        JToggleButton btnDivision = new JToggleButton("/", false);
        btnDivision.setBounds(300, 300, 100, 100);

        //boton de igual para saber el resultado
        JButton btnIgual = new JButton("=");
        btnIgual.setBounds(525, 225, 100, 100);

        //label de error por si no esta sellecionado ningun toggle button
        JLabel lblError = new JLabel("");
        lblError.setBounds(75, 500, 200, 200);

        //Se instancia un objeto de tipo operacion
        Operacion operacion = new Operacion();
        
        //se crea un objeto de tipo listener
        ActionListener listener = new ActionListener() {
            
            //evento que se realiza al presionar el boton igual
            @Override
            public void actionPerformed(ActionEvent e) {
                /*se obtienen los numeros que se ingresan en los campos de texto
                y se convierten a  tipo double, luego se verifica que toggle button
                esta seleccionado, dependiendo del toggle button seleccionado se 
                envian los numeros a los metodos sumar, restar, multiplicar y dividir
                y se retornan los valores, se le coloca comillas para convertirlo a 
                string y se agrega al campo resultado*/
                double numero1 = Double.parseDouble(txtNumero1.getText());
                double numero2 = Double.parseDouble(txtNumero2.getText());
                String resultado = "";
                if (btnSuma.isSelected()) {
                    lblError.setText("");
                    txtResultado.setText("");
                    resultado = "" + operacion.sumar(numero1, numero2);
                } else if (btnResta.isSelected()) {
                    lblError.setText("");
                    txtResultado.setText("");
                    resultado = "" + operacion.restar(numero1, numero2);
                } else if (btnMultiplicacion.isSelected()) {
                    lblError.setText("");
                    txtResultado.setText("");
                    resultado = "" + operacion.multiplicar(numero1, numero2);
                } else if (btnDivision.isSelected()) {
                    lblError.setText("");
                    txtResultado.setText("");
                    resultado = "" + operacion.dividir(numero1, numero2);
                } else {
                    lblError.setText("SELECCIONE UNA OPERACION");
                }

                txtResultado.setText(resultado);
            }
        };
        //se agrega un listener al boton igual
        btnIgual.addActionListener(listener);

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
