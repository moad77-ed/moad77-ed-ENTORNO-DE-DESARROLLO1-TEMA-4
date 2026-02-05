import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de usuarios: ");
        int numUsuarios = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        Usuario[] usuarios = crearArrayUsuarios(numUsuarios);

        System.out.println("\nListado de usuarios:");
        for (Usuario u : usuarios) {
            System.out.println("Nombre: " + u.nombre);
            System.out.println("Apellidos: " + u.apellidos);
            System.out.println("Email: " + u.email);

        }

    }

    public static Usuario[] crearArrayUsuarios(int numero) {

        Scanner sc = new Scanner(System.in);
        Usuario[] usuarios = new Usuario[numero];

        for (int i = 0; i < numero; i++) {
            System.out.println("\nUsuario " + (i + 1));

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Apellidos: ");
            String apellidos = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            usuarios[i] = new Usuario(nombre, apellidos, email);
        }

        return usuarios;
    }
}

