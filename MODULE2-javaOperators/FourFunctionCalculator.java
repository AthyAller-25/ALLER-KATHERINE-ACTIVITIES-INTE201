public class FourFunctionCalculator {
    public static void main(String[] args) {
        
       /*
        Read two numbers and apply every basic arithmetic operator to them
        with clearly labeled outpur
       */
       System.out.println("\t=====BASIC=====");
       
        int a = -25, b = 7;
           
       
        System.out.println("\nThis is addition: " + (a + b));
        System.out.println("This is subtraction: " + (a - b));
        System.out.println("This is multiplication: " + (a * b));
        System.out.println("This is division: " + (a / b)); //Division removes the decimal part by moving toward zero
        System.out.println("This is a remainder(modulus): " + (a % b)); // Remainder follows the sign of the first number (dividend)
        
        System.out.println("\n\n\nProgrammer's Name: Katherine P. Aller");
        System.out.println("Program and Section: DIT 2-6");

        // Division and remainder behave differently with negative operands.
        // Integer division removes the decimal part by moving toward zero, and the remainder follows the dividend's sign.
    }
}
