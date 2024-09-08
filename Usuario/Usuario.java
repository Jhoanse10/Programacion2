import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Usuario {
    private String nombreCompleto;
    private String nickname;
    private String clave;
    private String tipo;
    private String fechaCreacion;
    private Map<String, String> datosUsuario;

    
    public Usuario(String nombreCompleto, String nickname, String clave, String tipo, String fechaCreacion) {
        this.nombreCompleto = nombreCompleto;
        this.nickname = nickname;
        this.clave = clave;
        this.tipo = tipo;
        this.fechaCreacion = fechaCreacion;
        
        datosUsuario = new HashMap<>();
        datosUsuario.put("Nombre Completo", nombreCompleto);
        datosUsuario.put("Nickname", nickname);
        datosUsuario.put("Clave", clave);
        datosUsuario.put("Tipo", tipo);
        datosUsuario.put("Fecha de Creación", fechaCreacion);
    }

    
    public Map<String, String> getDatosUsuario() {
        return datosUsuario;
    }

    
    @Override
    public String toString() {
        return "Nombre Completo: " + nombreCompleto + "\nNickname: " + nickname + 
               "\nClave: " + clave + "\nTipo: " + tipo + "\nFecha de Creación: " + fechaCreacion;
    }
}

public class Main {
    static Map<String, Usuario> usuarios = new HashMap<>();

    
    public static void agregarUsuario(Scanner sc) {
        System.out.print("Ingrese el nombre completo: ");
        String nombreCompleto = sc.nextLine();
        System.out.print("Ingrese el nickname: ");
        String nickname = sc.nextLine();
        System.out.print("Ingrese la clave: ");
        String clave = sc.nextLine();
        System.out.print("Ingrese el tipo: ");
        String tipo = sc.nextLine();
        System.out.print("Ingrese la fecha de creación: ");
        String fechaCreacion = sc.nextLine();

        Usuario usuario = new Usuario(nombreCompleto, nickname, clave, tipo, fechaCreacion);
        usuarios.put(nickname, usuario);
        System.out.println("Usuario agregado exitosamente.");
    }

    
    public static void buscarUsuario(Scanner sc) {
        System.out.print("Ingrese el nickname del usuario a buscar: ");
        String nickname = sc.nextLine();
        Usuario usuario = usuarios.get(nickname);
        if (usuario != null) {
            System.out.println("Usuario encontrado:\n" + usuario);
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }

    
    public static void eliminarUsuario(Scanner sc) {
        System.out.print("Ingrese el nickname del usuario a eliminar: ");
        String nickname = sc.nextLine();
        if (usuarios.remove(nickname) != null) {
            System.out.println("Usuario eliminado exitosamente.");
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar Usuario");
            System.out.println("2. Buscar Usuario");
            System.out.println("3. Eliminar Usuario");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();  

            switch (opcion) {
                case 1:
                    agregarUsuario(sc);
                    break;
                case 2:
                    buscarUsuario(sc);
                    break;
                case 3:
                    eliminarUsuario(sc);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 4);

        sc.close();
    }
}
