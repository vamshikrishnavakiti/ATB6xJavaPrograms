import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        //int number = 12121;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int revNum=0;
        while(number !=0){
            revNum=revNum * 10+number%10;
            number=number/10;
        }
        System.out.println("Reverse Number is :"+ revNum);


        if(revNum==originalNumber){
            System.out.println("Polindrum");
        }
        else {
            System.out.println("Not-polindrum");
        }
    }

}
