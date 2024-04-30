import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indica cual es tu salario:");
        float salario = teclado.nextFloat();
        float necesidades = salario * 0.5f;
        float otrasCosas = salario * 0.3f;
        float ahorros = salario * 0.2f;

        System.out.println("Deberías asignar tu salario de la siguiente manera:");
        System.out.println("Necesidades: $"+necesidades);
        System.out.println("Otras cosas: $"+otrasCosas);
        System.out.println("Inversiones: $"+ahorros);
    }
}