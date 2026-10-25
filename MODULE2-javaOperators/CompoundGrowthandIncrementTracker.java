public class CompoundGrowthandIncrementTracker {
    public static void main(String[] args) {
        
        /* 
        Use compound assignment operators to track a value changing over time,
        and prove the difference between prefix and postfix increment
        */
         System.out.println("\t=====ADVANCED=====");
         
        //Compound Growth
        double balance = 1000.00;
        
        System.out.println("--- Compound Growth Tracker ---");
        System.out.println("Starting Balance: " + balance);

        balance += 100;
        System.out.println("After Step 1 (+100): " + balance);
        
        balance += 250;
        System.out.println("After Step 2 (+250): " + balance);

        balance *= 7.7;
        System.out.println("After Step 3 (*7.7): " + balance);

        //Postfix Increment
        int count = 5;

        System.out.println("\n--- Postfix Increment ---");
        System.out.println("count++: " + count++);
        System.out.println("Count after count++: " + count);

        // Postfix (count++) uses the current value first, then increases it by 1.

        //Prefix Increment
        System.out.println("\n--- Prefix Increment ---");
        System.out.println("++count: " + (++count));
        System.out.println("Count after ++count: " + count);

        // Prefix (++count) increases the value first, then uses the updated value.
        System.out.println("\n\n\nProgrammer's Name: Katherine P. Aller");
        System.out.println("Program and Section: DIT 2-6");
    }
}
