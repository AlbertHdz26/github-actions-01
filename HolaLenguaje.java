import java.util.Optional; 

public class HolaLenguaje {
    public static void main(String[] args) {

        // Obtiene la variable de entorno "USERNAME"        
		String username = System.getenv("USERNAME");  

        // Obtiene la variable de entorno "LANGUAGE"        
		String language = System.getenv("LANGUAGE"); 

        // Si no se encuentra, establece un valores por defectos a la variables        
		username = Optional.ofNullable(username).orElse("Usuario"); 
        language = Optional.ofNullable(language).orElse("Java"); 

        System.out.println("¡Hola "+ username + ", desde GitHub Actions, mi lenguaje de programacion favorito es "+language);
    }
}
