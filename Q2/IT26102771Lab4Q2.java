


      import java.util.Scanner;

public class IT26102771Lab4Q2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

     
        System.out.print("Please Enter exam marks (out of 100): ");
        double examM = scn.nextDouble();

        if (examM < 0 || examM > 100) {
            System.out.println("Invalid input for exam marks. Terminating program");
            return; 
        }

     
        System.out.print("Please Enter lab submission marks (out of 100): ");
        double labm = scn.nextDouble();


        if (labm < 0 || labm > 100) {
            System.out.println("Invalid input for lab submission marks. Terminating program");
            return; 
        }


        System.out.print("Please enter the percentage given for the exam:  ");
        double examp = scn.nextDouble();

        System.out.print("Please enter the percentage given for the lab submission: ");
        double labp = scn.nextDouble();

  
        if (examp + labp != 100) {
            System.out.println("The percentage must add up to 100. Terminating program");
            return; 
        }


        double Result = (examM * examp / 100) + (labm * labp / 100);
        
                System.out.println("Final exam mark is : " + Result);


    }
}
