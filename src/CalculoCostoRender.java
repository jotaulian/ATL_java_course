import java.util.Scanner;

public class CalculoCostoRender {
    public static void main(String[] args) {
        double precioPorMinuto = 0.05f;

        System.out.println("Indica la cantidad de minutos que necesitas renderizar:");

        Scanner teclado = new Scanner(System.in);
        double cantidadMinutos = teclado.nextDouble();
        double precioFinal = precioPorMinuto * cantidadMinutos;
        System.out.println("Precio final: $" + precioFinal);
    }
}
