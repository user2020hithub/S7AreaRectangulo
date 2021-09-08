/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;

/**
 *
 * @author Gerar
 */
public class Suma {
    private int vUno,vDos,resultado;
    public Suma(int valorUno,int valorDos){
        vUno=valorUno;
        vDos=valorDos;
       
        
    }
    
    public void Operacion(){
        resultado=vUno + vDos;
    }
    
    public void Imprimir(){
        Operacion();
        System.out.println("El resultado de la operación SUMA es: " + resultado);
    }
}
