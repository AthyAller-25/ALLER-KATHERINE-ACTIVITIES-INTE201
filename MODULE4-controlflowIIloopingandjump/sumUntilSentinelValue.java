import java.util.Scanner;
public class sumUntilSentinelValue {
    public static void main(String[] args) {

        System.out.println("\t=====INTERMEDIATE=====");
        
        /*
        Use a while loop to keep accumulating input until a special stop value is entered
        */
        
        Scanner input = new Scanner(System.in);

        System.out.println("\n===========Sum Until Sentinel Value===========\n");

        int number = 0;
        int total = 0;

        while (number != -1) {
            System.out.print("Enter an integer: ");
            number = input.nextInt();

            if (number != -1) {
                total += number;
            }
        }

        System.out.println("\nFinal Total: " + total);

        input.close();
        System.out.println("\n\n\nProgrammer's Name: Katherine P. Aller");
        System.out.println("Program and Section: DIT 2-6");
    }
    
}
