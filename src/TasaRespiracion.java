import java.util.Scanner;

public class TasaRespiracion {
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de respiraciones por minuto(RPM):");
        Scanner teclado = new Scanner(System.in);
        int cantidadRPM = teclado.nextInt();

        if (cantidadRPM >= 12 && cantidadRPM <= 20){
            System.out.println("tienes una tasa de respiracion normal");
        }else if(cantidadRPM < 12){
            System.out.println("Tu tasa de respiración esta en el rango BAJO");
        } else if (cantidadRPM > 20) {
            System.out.println("Tu tasa de respiración esta en el rango ALTO");
        }


    }
}
