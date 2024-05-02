import java.util.ArrayList;

public class Multiplos7y4 {
    public static void main(String[] args) {
        ArrayList<Integer> entre7y4 = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            if (i % 4 == 0 & i % 7 == 0){
                entre7y4.add(i);
            }
        }

        System.out.println("Array de numeros divisibles entre 7 y 4: " + entre7y4);
    }
}
