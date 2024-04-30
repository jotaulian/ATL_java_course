import java.util.Scanner;

public class CalculoFrecuenciaCardiaca {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su edad:");
        int edad = teclado.nextInt();

        System.out.println("Ingrese su nivel de actividad:");
        System.out.println("1) Sedentario");
        System.out.println("2) Moderado");
        System.out.println("3) Activo");
        int nivelDeActividad = teclado.nextInt();

        System.out.println("Ingrese su sexo:");
        System.out.println("1) Hombre:");
        System.out.println("2) Mujer:");
        int sexo = teclado.nextInt();
        boolean esHombre = sexo == 1;
        int frecuenciaMaxima;
        if(esHombre){
            frecuenciaMaxima = 220 - edad;
        }else{
            frecuenciaMaxima = 226 - edad;
        }
        System.out.println("Frecuencia cardiaca máxima " + frecuenciaMaxima);

        float rangoMinimo = 0.0f;
        float rangoMaximo = frecuenciaMaxima * 0.85f;

        final int SEDENTARIO = 1;
        final int MODERADO = 2;
        final int ACTIVO = 3;

        if(nivelDeActividad == SEDENTARIO){
            rangoMinimo = (frecuenciaMaxima * 0.5f);
        }else if(nivelDeActividad == MODERADO){
            rangoMinimo = (frecuenciaMaxima * 0.6f);
        }else if(nivelDeActividad == ACTIVO){
            rangoMinimo = (frecuenciaMaxima * 0.7f);
        }

        System.out.println("Su rango objetivo de frecuencia cardiaca debe situarse entre " + rangoMinimo +" y "+ rangoMaximo +" latidos por minuto.");

    }
}

