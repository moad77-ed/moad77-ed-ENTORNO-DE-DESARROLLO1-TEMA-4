import java.time.LocalDateTime;
public class Principal{
    public static void(String[] args){
        System.out.print("Hola mundo");
        mostrarHora();
    }
    public static void mostrarHora(){
    LocalDateTime ahora = LocalDateTime.now();
    System.out.print("Fecha:" + ahora);
    
    }
}
