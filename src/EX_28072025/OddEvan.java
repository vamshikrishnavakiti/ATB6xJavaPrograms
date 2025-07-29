package EX_28072025;

import java.util.Scanner;

public class OddEvan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Number");
        int number = scanner.nextInt();
        if (number / 2 == 0) {
            System.out.println("even");
        }
       else  {
            System.out.println("odd");
        }

    }
}
