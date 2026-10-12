import java.util.Scanner;

public class IT26102771Lab4Q3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

                System.out.print("Enter a number: ");
        double number = scn.nextDouble();

               String final = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";

               System.out.println("The number is : " + final );

        
    }
}