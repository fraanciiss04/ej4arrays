/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import java.util.Scanner;

/**
 *
 * @author Francisco Puras
 */
public class Alfanumericos {
     public static String pedirString(String mensaje) {
        String dato;
        Scanner entrada = new Scanner(System.in);
        System.out.println(mensaje);
        dato = entrada.next();
        return dato;
    }
}

