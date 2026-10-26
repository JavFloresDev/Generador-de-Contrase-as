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
        String password;
        int cantidad;
        boolean generar=false;
        
        
        System.out.println("Generar un contraseña segura\nescribir 'salir' para hacerlo.");
        while (!generar) {
            try{
                System.out.print("Ingrese longitud de contraseña\n---> ");cantidad = entrada.nextInt();
            }catch(Exception e){
                String palabra=entrada.next().toLowerCase();
                if("salir".equals(palabra)){
                    generar=true;
                }else{
                    System.out.println("error");
                }
                continue;
            }
            password="";
            for (int i = 0; i < cantidad; i++) {
                int caracter=rand.nextInt(characters.length())+1;
                password+=characters.charAt(caracter);
            }
            System.out.println("Contraseña generada...");
            System.out.println("La contraseña es: "+password);
            System.out.println("Generar otra contraseña? (Y/n) ");String opc=entrada.next().toLowerCase();
            if("n".equals(opc)){
                generar=true;
            }
        }
        System.out.println("Adios...");
    }
}
