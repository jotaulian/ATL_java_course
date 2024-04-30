import java.util.Scanner;

public class CalculoIVA {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame el precio del producto:");
        float precioProducto = teclado.nextFloat();
        float IVA = 0.21f;
        float precioConIva = (precioProducto * IVA) + precioProducto;
        System.out.println("El precio del producto con IVA es de " + precioConIva);
    }
}
