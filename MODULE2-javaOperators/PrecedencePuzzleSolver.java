
public class PrecedencePuzzleSolver {
    public static void main(String[] args) {

        /*
        Design and verify your own tricky expressions that
        combine multiple operator categories.
        */

        System.out.println("\t=====EXPERT=====");

        // Puzzle 1
        // PREDICTED: true
        int a = 6, b = 4;
        System.out.println((a + b * 2) > 12 && a < b + 4);
        // Actual result: true

        // Puzzle 2
        // PREDICTED: 9
        int count = 8;
        System.out.println(count++ + 1);
        // Actual result: 9
        // Postfix ++ uses the current value first,
        // then increases count to 9.

        // Puzzle 3
        // PREDICTED: true
        int x = 6;
        System.out.println(++x > 6 || x * 2 == 14);
        // Actual result: true
        // Prefix ++ increases x to 7 before comparing it with 6.

        System.out.println("\n\n\nProgrammer's Name: Katherine P. Aller");
        System.out.println("Program and Section: DIT 2-6");
    }
}
