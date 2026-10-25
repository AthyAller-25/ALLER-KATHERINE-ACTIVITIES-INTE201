public class SimpleGradeClassifier {
    public static void main(String[] args) {

        /* 
        Use a single if-else statement to classify a numeric score as passsing or failing
        */
        
        System.out.println("\t=====BASIC=====");
        System.out.println("\n\n===========Simple Grade Classifier===========\n");

        int score1 = 30;
        int score2 = 90;

        System.out.println("Your score: " + score1);
        if (score1 >=60){
            System.out.println("Result: PASSED");
        } else {
            System.out.println("Result: FAILED");
        }
        
        System.out.println();
        System.out.println("Your score: " + score2);
        if (score2 >= 60){
            System.out.println("Result: PASSED");
        } else {
            System.out.println("Result: FAILED");
        }  
        System.out.println("\n\n\nProgrammer's Name: Katherine P. Aller");
        System.out.println("Program and Section: DIT 2-6");
    }
}        
