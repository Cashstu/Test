import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Number of students: ");
        int n = scanner.nextInt();
        int[] scores = new int [n];

        for (int i=0; i<n; i++){
            System.out.println("Enter student score" + (i+1+": "));
            scores[i]= scanner.nextInt();
        }

        int total = 0;
        int max = scores[0];
        int min = scores[scores.length-1];

        for (int i=0; i<n; i++){
            total = scores[i] + total;
        }


        System.out.println("Highest score: " + max);
        System.out.println("Lowest score: " + min);
        System.out.println("Average score: " + total/n);

    }
}