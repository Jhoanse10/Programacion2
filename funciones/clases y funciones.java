import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Clientes {
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String direccion;
    private String fechaNacimiento;

    
    public Clientes(String cedula, String nombre, String apellido, String telefono, 
                    String correo, String direccion, String fechaNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
    }

    
    public String obtenerAtributos() {
        return String.format("Cédula: %s\nNombre: %s\nApellido: %s\nTeléfono: %s\nCorreo: %s\nDirección: %s\nFecha de Nacimiento: %s",
                cedula, nombre, apellido, telefono, correo, direccion, fechaNacimiento);
    }

    
    public int calcularEdad() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate fechaNac = LocalDate.parse(fechaNacimiento, formatter);
        LocalDate hoy = LocalDate.now();
        Period periodo = Period.between(fechaNac, hoy);
        return periodo.getYears();
    }

    
    public void imprimirMensaje() {
        int edad = calcularEdad();
        String mensaje = String.format("Mi nombre es %s %s y vivo en %s y tengo %d años de edad",
                nombre, apellido, direccion, edad);
        System.out.println(mensaje);
    }

    
    public static void main(String[] args) {
        
        Clientes cliente = new Clientes(
                "123456789",
                "Juan",
                "Pérez",
                "555-1234",
                "juan.perez@example.com",
                "Calle Falsa 123",
                "1990/05/15"
        );

        
        cliente.imprimirMensaje();
    }
}
