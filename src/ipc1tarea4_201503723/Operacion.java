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
    
    public double sumar(double numero1, double numero2){
        double resultado = numero1+numero2;
        return resultado;
    }
    
    public double restar(double numero1, double numero2){
        double resultado = numero1-numero2;
        return resultado;
    }
    
    public double multiplicar(double numero1, double numero2){
        double resultado = numero1*numero2;
        return resultado;
    }
    
    public double dividir(double numero1, double numero2){
        double resultado = numero1/numero2;
        return resultado;
    }
    
}
