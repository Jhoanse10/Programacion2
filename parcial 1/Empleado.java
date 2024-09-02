
import java.util.Scanner;

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

