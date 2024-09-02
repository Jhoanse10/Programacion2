import java.util.Scanner;

class Persona {
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String email;

   
    public Persona(String nombre, String apellido, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


class Empleado extends Persona {
    private String nombreCargo;
    private double salario;
    private String jefeInmediato;
    private int ahosExperiencia;

    
    public Empleado(String nombre, String apellido, String direccion, String telefono, String email,
                    String nombreCargo, double salario, String jefeInmediato, int ahosExperiencia) {
        super(nombre, apellido, direccion, telefono, email);
        this.nombreCargo = nombreCargo;
        this.salario = salario;
        this.jefeInmediato = jefeInmediato;
        this.ahosExperiencia = ahosExperiencia;
    }

    
    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getJefeInmediato() {
        return jefeInmediato;
    }

    public void setJefeInmediato(String jefeInmediato) {
        this.jefeInmediato = jefeInmediato;
    }

    public int getAhosExperiencia() {
        return ahosExperiencia;
    }

    public void setAhosExperiencia(int ahosExperiencia) {
        this.ahosExperiencia = ahosExperiencia;
    }
}

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
