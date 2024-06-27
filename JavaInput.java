/*Program that gets from the user 2 numbers and displays their division and remainder
 *
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // we getting input from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int FirstNum = input.nextInt();
        System.out.println("Please enter the Second number: ");
        int SecondNum = input.nextInt();

        float division = FirstNum/SecondNum;
        float remainder = FirstNum%SecondNum;

        System.out.println("FirstNum/SecondNum " + division);
        System.out.println("FirstNum%SecondNum "+ remainder);
    }
}