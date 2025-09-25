import java.util.Optional; 

public class HolaMundo {
    public static void main(String[] args) {

        // Obtiene la variable de entorno "USERNAME"        
		String username = System.getenv("USERNAME");  

        // Si no se encuentra, establece un valor por defecto: Usuario        
		username = Optional.ofNullable(username).orElse("Usuario"); 

        System.out.println("¡Hola "+ username + ", desde GitHub Actions!");
    }
}
