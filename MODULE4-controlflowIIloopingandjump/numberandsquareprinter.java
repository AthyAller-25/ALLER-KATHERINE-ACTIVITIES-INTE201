public class numberandsquareprinter {
    public static void main(String[] args) {

        /*
        Use a for loop to print a sequence of numbers alongside their squares
        */
        
        System.out.println("\t=====BASIC=====");
        System.out.println("\n\n===========Number & Square Printer===========\n");

        for (int i = 1; i <= 20; i++) {  /* I already tested this using a loop bound of 10.
            I'll just change the 20 to 10 again if I want to recheck it.
            */
            System.out.println("Number: " + i + " ; Square: " + (i * i));
        }
        System.out.println("\n\n\nProgrammer's Name: Katherine P. Aller");
        System.out.println("Program and Section: DIT 2-6");
    }
}
