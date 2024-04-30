import java.util.Scanner;

public class EdadesCondicional {
    public static void main(String[] args) {

        System.out.println("Indica tu edad:");

        Scanner teclado = new Scanner(System.in);
        int edad = teclado.nextInt();
        if (edad >= 18) {
            System.out.println("Puedes acceder!");
        } else {
            System.out.println("No puedes acceder, vuelve en unos años!");
        }
    }
}