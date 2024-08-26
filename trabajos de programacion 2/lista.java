/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<String> personas = new ArrayList<>();
            int opcion;
            
            do {
                System.out.println("Seleccione una opción:");
                System.out.println("1. Crear persona");
                System.out.println("2. Eliminar persona");
                System.out.println("3. Listar persona");
                System.out.println("4. Buscar persona");
                System.out.println("0. Salir");
                opcion = scanner.nextInt();
                scanner.nextLine();  
                
                switch (opcion) {
                    case 1 -> {
                        System.out.println("Ingrese el nombre de la persona:");
                        String nombre = scanner.nextLine();
                        personas.add(nombre);
                        System.out.println("Lista de personas: " + personas);
                    }
                        
                    case 2 -> {
                        System.out.println("Lista de personas: " + personas);
                        System.out.println("Ingrese el índice de la persona a eliminar:");
                        int indiceEliminar = scanner.nextInt();
                        if (indiceEliminar >= 0 && indiceEliminar < personas.size()) {
                            personas.remove(indiceEliminar);
                            System.out.println("Lista actualizada: " + personas);
                        } else {
                            System.out.println("Índice inválido.");
                        }
                        scanner.nextLine();  
                    }
                        
                    case 3 -> System.out.println("Lista de personas: " + personas);
                        
                    case 4 -> {
                        System.out.println("Ingrese el nombre de la persona a buscar:");
                        String nombreBuscar = scanner.nextLine();
                        if (personas.contains(nombreBuscar)) {
                            System.out.println("La persona fue encontrada.");
                        } else {
                            System.out.println("La persona no fue encontrada.");
                        }
                    }
                        
                    case 0 -> System.out.println("Saliendo...");
                        
                    default -> System.out.println("Opción inválida.");
                }
            } while (opcion != 0);
        }
    }
}
