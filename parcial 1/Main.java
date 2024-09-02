
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese el apellido: ");
        String apellido = scanner.nextLine();
        
        System.out.print("Ingrese la dirección: ");
        String direccion = scanner.nextLine();
        
        System.out.print("Ingrese el teléfono: ");
        String telefono = scanner.nextLine();
        
        System.out.print("Ingrese el email: ");
        String email = scanner.nextLine();
        
        System.out.print("Ingrese el nombre del cargo: ");
        String nombreCargo = scanner.nextLine();
        
        System.out.print("Ingrese el salario: ");
        double salario = scanner.nextDouble();
        
        scanner.nextLine(); 
        
        System.out.print("Ingrese el jefe inmediato: ");
        String jefeInmediato = scanner.nextLine();
        
        System.out.print("Ingrese los ahos de experiencia: ");
        int ahosExperiencia = scanner.nextInt();

        Empleado empleado = new Empleado(nombre, apellido, direccion, telefono, email, nombreCargo, salario, jefeInmediato, ahosExperiencia);

        if (salario > 5000000 && ahosExperiencia < 5) {
            System.out.println("Error: Un empleado con salario superior a $5.000.000 debe tener al menos 5 años de experiencia.");
        } else if (salario >= 900000 && salario <= 1200000 && ahosExperiencia < 1) {
            System.out.println("Este empleado es de rango Junior.");
        } else {
            System.out.println("Empleado registrado correctamente.");
        }
        
        scanner.close(); 
    }
}