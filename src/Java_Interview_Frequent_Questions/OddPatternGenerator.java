package Java_Interview_Frequent_Questions;

import java.util.Scanner;

public class OddPatternGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        int count = 1;

        for(int i = 1; i <= n; i++) {

            int odd = 1;

            for(int j = 1; j <= count; j++) {
                System.out.print(odd + " ");
                odd = odd+2;
            }

            count = count+ 2;
            System.out.println();
        }

        sc.close();
    }
}
