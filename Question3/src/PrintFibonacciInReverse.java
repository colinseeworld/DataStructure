import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PrintFibonacciInReverse {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a number:");

        int number = userInput.nextInt();
        int firstNumber = 0;
        int secondNumber = 1;
        int sum = 0;

        System.out.println("The original order of fibonacci of " + number + " is: ");

        for(int i=0; i<number; i++){
            System.out.print(firstNumber + ",");
            sum = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = sum;
        }

        System.out.println();
        System.out.println("The reversed order of fibonacci of " + number + " is: ");
        for(int j=number-1; j>=0; j--){
            int minus = secondNumber - firstNumber;
            secondNumber = firstNumber;
            firstNumber = minus;
            System.out.print(minus + ",");
        }
    }
}
