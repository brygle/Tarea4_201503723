/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc1tarea4_201503723;

/**
 *
 * @author Bryan
 */
public class Operacion {
    
    //realiza la suma de dos numeros pasados por parametro
    public double sumar(double numero1, double numero2){
        double resultado = numero1+numero2;
        return resultado;
    }
    
    //realiza la resta de dos numeros pasados por parametro
    public double restar(double numero1, double numero2){
        double resultado = numero1-numero2;
        return resultado;
    }
    
    //realiza la multiplicacion de dos numeros pasados por parametro
    public double multiplicar(double numero1, double numero2){
        double resultado = numero1*numero2;
        return resultado;
    }
    
    //realiza la division de dos numeros pasados por parametro
    public double dividir(double numero1, double numero2){
        double resultado = numero1/numero2;
        return resultado;
    }
    
}
