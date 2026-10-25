public class GradeThresholdChecker {
    public static void main(String[] args) {
        
        /*
        Combine relational and logical operators to
        evaluate a multi-condition eligibility rule.
        */
        
        System.out.println("\t=====INTERMEDIATE=====");
        
        double average = 95;
        int absences = 4;

        boolean passed = (average >= 75 && absences <= 3) || (average >= 90);
        
        System.out.println("Average Grade: " + average);
        System.out.println("Number of Absences: " + absences);
        System.out.println("Result: " + (passed ? "PASS" : "FAIL"));

        // The student passes if the average is at least 75 with no more than 3 absences,
        // OR if the average is at least 90 regardless of absences.

        if (average >= 90) {
            System.out.println("Reason: Average is at least 90.");
        } else if (average >= 75 && absences <= 3) {
            System.out.println("Reason: Average is at least 75 and absences are 3 or less.");
        } else {
            System.out.println("Reason: The student does not meet the passing conditions.");
        }
        System.out.println("\n\n\nProgrammer's Name: Katherine P. Aller");
        System.out.println("Program and Section: DIT 2-6");
    }
    
}
