public class TypeSafeShoppingCalculator {
    public static void main(String[] args) {
        
        /* 
        Model a small purchase using correctly chosen types,
        then compute and print the total cost
        */
        System.out.println("\t     =====INTERMEDIATE=====");
        System.out.println("==========Type-Safe Shopping Calculator==========");
        
        String storeName = "BREAD PITT";
        String purItem = "Rasberry Croissant";
        int quan = 4;
        double unitPri = 49.75;
        double totalCost = quan * unitPri;
        
        //totalCost should not be an int data type because the total may contain decimal values.
        System.out.println("\n=====SHOPPING SUMMARY=====");
        System.out.println("Store Name: " + storeName);
        System.out.println("Item Name: " + purItem);
        System.out.println("Quantity: " + quan);
        System.out.println("Unit Price: " + unitPri);
        System.out.println("Total Cost: " + totalCost);
        
        System.out.println("\n\n\nProgrammer's Name: Katherine P. Aller");
        System.out.println("Program and Section: DIT 2-6");
        
    }
    
}
