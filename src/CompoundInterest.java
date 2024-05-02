public class CompoundInterest {
    public static void main(String[] args) {
        float initialCapital = 1000;
        float anualAddition = 1000;
        float anualInterestRate = 0.05f; // 5%
        int numberOfYears = 10;

        float finalAmount = initialCapital;

        for (int i = 0; i < numberOfYears; i++) {
            float anualIncrement = finalAmount * anualInterestRate;
            finalAmount = finalAmount + anualIncrement + anualAddition;

        }

        System.out.println("El monto al cabo de 5 años será de: " + finalAmount);
    }
}
