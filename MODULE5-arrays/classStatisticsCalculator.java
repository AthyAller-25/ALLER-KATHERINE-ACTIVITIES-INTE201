public class classStatisticsCalculator {
    public static void main(String[] args) {

        System.out.println("\t\t=====INTERMEDIATE=====");
        System.out.println("===========CLASS STATISTICS CALCULATOR===========");

        /*
        Process an array of student scores to compute
        the sum, average, highest score, and lowest score.
        */

        int[] scores = {85, 90, 78, 93, 88, 75, 95, 80};

        int sum = 0;
        int high = scores[0];
        int low = scores[0];

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];

            if (scores[i] > high) {
                high = scores[i];
            }

            if (scores[i] < low) {
                low = scores[i];
            }
        }

        double average = sum / (double) scores.length;
        
        System.out.println("Sum of Scores: " + sum);
        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + high);
        System.out.println("Lowest Score: " + low);

        System.out.println("\n\n\nProgrammer's Name: Katherine P. Aller");
        System.out.println("Program and Section: DIT 2-6");
    }
}
