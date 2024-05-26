import java.util.Random;

public class SortowanieTablicy {

    Random random = new Random();
    int[] a = new int[10];
    int score = 0;

    int[] testTab = {1,3,5};

    SortowanieTablicy(){

        System.out.println("zadanie 1");

        for (int i = 0; i < 10; i++) {
            a[i] = random.nextInt(10);
            System.out.println("liczba " + (i + 1) + " = " + a[i]);
        }

        System.out.println("wynik sumy wszystkich liczb = " + sumArray(a));
    }


    public int sumArray(int[] numbers){
        for (int number : numbers) {
            score = score + number;
        }

        return score;
    }



}
