import java.util.Scanner;

public class VerifyPassword {
    public static void main(String[] args) {
        int intentos = 5;
        String pw = "abc123";

        Scanner teclado = new Scanner(System.in);
        String intentoPw;
        do {
            System.out.println("Introduce tu contraseña");
            intentoPw = teclado.nextLine();

            if(pw.equals(intentoPw)){
                System.out.println("Contraseña correcta!");
                break;
            }else{
                System.out.println("La contraseña introducida no es válida.");
            }

            intentos--;

            if(intentos==0){
                System.out.println("Se han acabado sus intentos");
            }else{
                System.out.println("Te quedan " + intentos + " intentos");
            }
        }while (intentos > 0);

    }
}
