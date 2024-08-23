/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.evaluacion;

import java.util.Scanner;

/**
 *
 * @author Sala de Sistemas
 */

        import java.util.Scanner;

public class Evaluacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Cual es su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("cual es su apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Cual es tu edad: ");
        int edad = scanner.nextInt();

        System.out.print("Cual es su sexo (Masculino/Femenino): ");
        String sexo = scanner.next();

        
        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }

        
        if (sexo.equalsIgnoreCase("Masculino")) {
            System.out.println("Es un Hombre.");
        } else if (sexo.equalsIgnoreCase("Femenino")) {
            System.out.println("Es una Mujer.");
        } else {
            System.out.println("Sexo no reconocido.");
        }
    }
}                                
 

