

 import java.util.Scanner;

public class IT26102771Lab4Q2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

       
        System.out.print("Please Enter exam marks (out of 100): ");
        double exammarks = scn.nextDouble();

      
        if (exammarks < 0 || exammarks > 100) {
            System.out.println("Invalid input for exam marks. Terminating program");
        } else {
         
            System.out.print("Please Enter lab submission marks (out of 100): ");
            double labmarks = scn.nextDouble();

          
            if (labmarks < 0 || labmarks > 100) {
                System.out.println("Invalid input for lab submission marks. Terminating program");
            } else {
         
                System.out.print("Enter exam percentage: ");
                double exampct = scn.nextDouble();

                System.out.print("Enter lab submission percentage: ");
                double labpct = scn.nextDouble();

         
                if (exampct + labpct != 100) {
                    System.out.println("The percentage must add up to 100. Terminating program");
                } else {
                 
                    double finalmark = (exammarks * exampct / 100) + (labmarks * labpct / 100);
                    
                    
                    System.out.println("Final exam mark is : " + finalmark);
                    
                }
            }
        }

      
    }
}