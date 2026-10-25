public class OverflowandReferenceInvestigator {
    public static void main(String[] args) {

        
        /* 
        Combine primitive overflow behavior with reference-type
        sharing behavior in one investigative program
        */
        
        System.out.println("\t\t  =====EXPERT=====");
        System.out.println("==========Overflow & Reference Investigator==========");
        // Part I: Primitive Overflow
        byte number = 127;
        
        System.out.println("\n--- Primitive Overflow ---");
        System.out.println("Before Increment: " + number);

        number++;

        System.out.println("After Increment: " + number);
        // A byte can store values from -128 to 127.
        // After 127, it wraps around to -128.


        // Part II: String Comparison
        String str1 = new String("Katherine");
        String str2 = new String("Katherine");
        String str3 = "Katherine";

        System.out.println("\n--- String Comparison ---");

        System.out.println("str1 == str2: " + (str1 == str2));
        // False because str1 and str2 refer to different objects.

        System.out.println("str1.equals(str2): " + str1.equals(str2));
        // True because both Strings contain the same text.

        System.out.println("str1 == str3: " + (str1 == str3));
        // False because str1 refers to a new object, while str3 refers to the string literal.

        System.out.println("str1.equals(str3): " + str1.equals(str3));
        // True because both Strings contain the same text.

        System.out.println("str2 == str3: " + (str2 == str3));
        // False because str2 refers to a new object, while str3 refers to the string literal.

        System.out.println("str2.equals(str3): " + str2.equals(str3));
        // True because both Strings contain the same text.


        // Part III: Shared Array Reference
        int[] array1 = {10, 20, 30};
        int[] array2 = array1;

        System.out.println("\n--- Shared Array Reference ---");
        System.out.println("Before Modification: " + array2[2]);

        array1[2] = 98;

        System.out.println("After Modification: " + array2[2]);
        // Both variables refer to the same array.
        // Changing an element through array1 is also visible through array2.
        
        System.out.println("\n\n\nProgrammer's Name: Katherine P. Aller");
        System.out.println("Program and Section: DIT 2-6");
    }
}
