import java.util.Scanner;

// Clase base Persona
class Persona {
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String email;

    // Constructor de la clase Persona
    public Persona(String nombre, String apellido, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    // Métodos getter y setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos getter y setter para apellido
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Métodos getter y setter para dirección
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Métodos getter y setter para teléfono
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Métodos getter y setter para email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

// Clase derivada Empleado que hereda de Persona
class Empleado extends Persona {
    private String nombreCargo;
    private double salario;
    private String jefeInmediato;
    private int ahosExperiencia;

    // Constructor de la clase Empleado
    public Empleado(String nombre, String apellido, String direccion, String telefono, String email,
                    String nombreCargo, double salario, String jefeInmediato, int ahosExperiencia) {
        super(nombre, apellido, direccion, telefono, email);
        this.nombreCargo = nombreCargo;
        this.salario = salario;
        this.jefeInmediato = jefeInmediato;
        this.ahosExperiencia = ahosExperiencia;
    }

    // Métodos getter y setter para nombreCargo
    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    // Métodos getter y setter para salario
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Métodos getter y setter para jefeInmediato
    public String getJefeInmediato() {
        return jefeInmediato;
    }

    public void setJefeInmediato(String jefeInmediato) {
        this.jefeInmediato = jefeInmediato;
    }

    // Métodos getter y setter para ahosExperiencia
    public int getAhosExperiencia() {
        return ahosExperiencia;
    }

    public void setAhosExperiencia(int ahosExperiencia) {
        this.ahosExperiencia = ahosExperiencia;
    }
}

// Clase principal para ejecutar el programa
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
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
        
        scanner.nextLine(); // Limpiar el buffer del scanner
        
        System.out.print("Ingrese el jefe inmediato: ");
        String jefeInmediato = scanner.nextLine();
        
        System.out.print("Ingrese los ahos de experiencia: ");
        int ahosExperiencia = scanner.nextInt();

        // Crear instancia de Empleado
        Empleado empleado = new Empleado(nombre, apellido, direccion, telefono, email, nombreCargo, salario, jefeInmediato, ahosExperiencia);

        // Validar salario y experiencia
        if (salario > 5000000 && ahosExperiencia < 5) {
            System.out.println("Error: Un empleado con salario superior a $5.000.000 debe tener al menos 5 años de experiencia.");
        } else if (salario >= 900000 && salario <= 1200000 && ahosExperiencia < 1) {
            System.out.println("Este empleado es de rango Junior.");
        } else {
            System.out.println("Empleado registrado correctamente.");
        }
        
        scanner.close(); // Cerrar el scanner
    }
}
