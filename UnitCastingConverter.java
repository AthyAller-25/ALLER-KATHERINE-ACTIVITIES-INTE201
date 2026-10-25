
public class UnitCastingConverter {
    public static void main(String[] args) {
        
        /* 
        Build a small converter that demonstrate both implicit widening
        and explicit narrowing costs correctly
        */
        // Convert centimeters to whole meters and remaining centimeters
        System.out.println("\t    =====ADVANCED=====");
        System.out.println("==========Unit Casting Converter==========");
        double centimeters = 256.75;

        int meters = (int) (centimeters / 100);
        double remainingCentimet = centimeters - (meters * 100);
      
        System.out.println("\n--- Unit Converter ---");
        System.out.println("Centimeters: " + centimeters);
        System.out.println("Whole Meters: " + meters);
        System.out.println("Remaining Centimeters: " + remainingCentimet);


        // Implicit Widening: int to double
        int number = 25;
        double widenedNumber = number;

        // No cast is needed because double can store the integer value without losing it (conversion is automatic).
        System.out.println("\n--- Implicit Widening ---");
        System.out.println("Integer Value: " + number);
        System.out.println("Double Value: " + widenedNumber);


        // Explicit Narrowing: double to int
        double decimalNumber = 15.89;
        int narrowedNumber = (int) decimalNumber;

        // The decimal part (.89) is lost leaving only 15 because casting double to int does not round off the value; it simply removes the decimal part.
        System.out.println("\n--- Explicit Narrowing ---");
        System.out.println("Double Value: " + decimalNumber);
        System.out.println("Integer Value: " + narrowedNumber);
        
        System.out.println("\n\n\nProgrammer's Name: Katherine P. Aller");
        System.out.println("Program and Section: DIT 2-6");
    }
}
