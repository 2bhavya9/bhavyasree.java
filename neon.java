import java.util.Scanner;

public class neon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = sc.nextInt();
        int sq = num * num;
        int sum = 0;

        while (sq > 0) {
            int r = sq % 10;
            sum += r;
            sq /= 10;
        }

        if (sum == num) {
            System.out.println("Neon number");
        } else {
            System.out.println("Not a neon number");
        }

        sc.close();
    }
}
