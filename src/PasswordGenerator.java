public class PasswordGenerator {
    public static void main(String[] args) {
        String caracteres = "abcdefghij1234567";
        StringBuilder pw = new StringBuilder();
        int cantidadCaracteres = 10;
        int numeroRandom;

        for (int i = 0; i < cantidadCaracteres; i++) {
            double aleatorio = Math.random();
            numeroRandom = (int) Math.floor((aleatorio * caracteres.length()));
            pw.append(caracteres.charAt(numeroRandom));
        }
        System.out.println("Contraseña generada: "+ pw);
    }
}
