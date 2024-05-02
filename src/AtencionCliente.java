import java.util.Scanner;

public class AtencionCliente {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int opcionEscogida = 1;
        String[] opciones = {"Llamando a soporte ´tecnico", "llamando a compras","LLamando a marketing", "Llamando a prensa", "Llamando a legal" };

        while (opcionEscogida != 0 && opcionEscogida < 6){
            System.out.println("Elija la opción que desea:");
            System.out.println("1) Contactar a soporte técnico");
            System.out.println("2) Contactar a Compras");
            System.out.println("3) Contactar a Marketing");
            System.out.println("4) Contactar a prensa");
            System.out.println("5) Contactar a legal");
            System.out.println("0) Salir");
            opcionEscogida = teclado.nextInt();

            if(opciones.length > opcionEscogida){
                System.out.println(opciones[opcionEscogida-1]);
            }

       }
        System.out.println("Has salido de la aplicación!");

    }
}
