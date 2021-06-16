import java.util.Scanner;

public class FindPalindromeNumber {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a number:");

        int number = userInput.nextInt();
        int original = number;
        int reverse = 0;

        while(original != 0){
            reverse = reverse * 10 + original % 10;
            original = original / 10;
        }

        if (reverse == number){
            System.out.println(number + " is a palindrome number");
        }else{
            System.out.println(number + " is not a palindrome number");
        }
    }
}
