import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author bossjjfl
 */
public class GeneradorContrasenias {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?";
        String password="";
        int cantidad;
        boolean generar=false;
        
        while (!generar) {
            System.out.println("Ingrese longitud de contraseña\n---> ");cantidad = entrada.nextInt();
            for (int i = 0; i < cantidad; i++) {
                int caracter=rand.nextInt(characters.length())+1;
                password+=characters.charAt(caracter);
            }
            System.out.println("La contraseña es:");
        }
    }
}
