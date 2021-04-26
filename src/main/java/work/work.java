package work;
import java.util.Scanner;
public class work {
    public static void main(String[] args) {
//1. Write a program from the user input 2 numbers and 1 math operation
// and print the output, int, double, float.
        int num1 = 15;
        float num2 = 12.3f;
        double num3 = 45.6893;
        double sum = num1 * num2 * num3;
        System.out.println("The answere is: " + sum);
//2. Write a program from the user input to print is the number even or not
        Scanner numeral = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int number = numeral.nextInt();
        if (number % 2 == 0)
            System.out.println("Your number is even");
        else
            System.out.println("Your number is odd");
//3. Take three numbers from the user and print the greatest number.
        Scanner newnum = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int newnum1 = numeral.nextInt();
        System.out.print("Please enter the second number: ");
        int newnum2 = numeral.nextInt();
        System.out.print("Please enter the tihrd number: ");
        int newnum3 = numeral.nextInt();

        if (newnum1 > newnum2 && newnum1 > newnum3)
            System.out.println("The greatest number is: " + newnum1);
        else if (newnum2 > newnum1 && newnum2 > newnum3)
            System.out.println("The greatest number is: " + newnum2);
        else
            System.out.println("The greatest number is: " + newnum3);
//4. Write a Java program to get a number from the user and print whether it is positive or negative
        Scanner x = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int xx = x.nextInt();

        if (xx > 0)
            System.out.println("Your number is positive: " + xx);
        else
            System.out.println("Your number is negative: " + xx);
//5. Write a program from your input to print the day of the week for example 1 = Monday
        Scanner weekdays = new Scanner(System.in);
        System.out.print("Write the number of the day needed: ");
        int days = weekdays.nextInt();

        switch (days) {
            case 1:
                System.out.println("Today is Monday: ");
                break;
            case 2:
                System.out.println("Today is Tuesday: ");
                break;
            case 3:
                System.out.println("Today is Wednesday: ");
                break;
            case 4:
                System.out.println("Today is Thursday: ");
                break;
            case 5:
                System.out.println("Today is Friday: ");
                break;
            case 6:
                System.out.println("Today is Saturday: ");
                break;
            case 7:
                System.out.println("Today is Sunday: ");
                break;
            default:
                System.out.println("No such a day: ");
//Flowcharts
                Scanner calcul = new Scanner(System.in);
                System.out.println("Start");
                System.out.print("Please enter xxx number: ");
                int xxx = calcul.nextInt();
                while (xxx >= 10) {
                    xxx -= 5;
                    System.out.println(xxx);
                    System.out.println("Do task");
                    System.out.println("Increment xxx");
                }
                if (xxx < 10)
                System.out.println("End");

        }


    }
}