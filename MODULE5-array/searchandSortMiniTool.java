import java.util.Arrays;
public class searchandSortMiniTool {
    public static void main(String[] args) {

        System.out.println("\t\t=====ADVANCED=====");
        System.out.println("===========SEARCH & SORT MINI-TOOL===========");
        
        /*
        Combine searching and sorting on the same array of data
        */

        int[] scores = {85, 90, 78, 92, 88, 75, 95, 80};

        // LINEAR SEARCH
        int target = 88;
        int foundAt = -1;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                foundAt = i;
                break;
            }
        }

        System.out.println("\n===========LINEAR SEARCH===========");

        if (foundAt != -1) {
            System.out.println("Target Score: " + target);
            System.out.println("Result: Score found!");
            System.out.println("Found at index: " + foundAt);
        } else {
            System.out.println("Target Score: " + target);
            System.out.println("Result: Score not found.");
        }

        // SORTING A COPY OF THE ARRAY
        // Sorting a copy keeps the original order unchanged,
        // which matters if we still need the scores in their original order.
        int[] sortedScores = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sortedScores);

        System.out.println("\n===========ARRAY COMPARISON===========");
        System.out.println("Original Scores: " + Arrays.toString(scores));
        System.out.println("Sorted Scores: " + Arrays.toString(sortedScores));

        System.out.println("\n\n\nProgrammer's Name: Katherine P. Aller");
        System.out.println("Program and Section: DIT 2-6");
    }
}
