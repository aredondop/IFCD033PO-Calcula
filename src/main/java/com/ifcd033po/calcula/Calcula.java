/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ifcd033po.calcula;

/**
 *
 * @author Ángel Redondo
 */

public class Calcula {

    public static void main(String[] args) {
        
        int miNumero = 5;
        //int miFactorial = calcularFactorial(miNumero);
        int miFactorial = calcularFactorialRecursiva(miNumero);
        
        System.out.println("El factorial de "+ miNumero + " es " + miFactorial);
        System.out.println("Los alumnos de este curso aprenden Programación en JAVA");
    }
    
    public static int calcularFactorial( int numero){
        int factorial = 1;
        
        for (int i = 1; i <= numero; i++) {
            factorial *=i;
        }
        
        return factorial;
    }
    
    public static int calcularFactorialRecursiva( int numero){
        
        return (numero == 0 || numero == 1) ? 1 : numero * calcularFactorialRecursiva( numero - 1);
       
    }
}
