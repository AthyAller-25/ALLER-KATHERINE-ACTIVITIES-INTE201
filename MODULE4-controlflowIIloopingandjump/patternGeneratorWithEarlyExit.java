
public class patternGeneratorWithEarlyExit {
    public static void main(String[] args) {

        System.out.println("\t\t=====ADVANCED=====");
        System.out.println("\n\n==========Pattern Generator With Early Exit==========\n");

        /*
        Use nested loops to print a right-triangle pattern,
        incorporating break and continue.
        */

        int size = 5;
        for (int row = 1; row <= size; row++) {

            if (row == 3) {
                continue; // continue: Skip row 3
            }

            for (int column = 1; column <= row; column++) {

                if (column == 4) {
                    break; // break: Stop the INNER loop at column 4, so no row prints more than 3 (*)
                }

                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println("\n\n\nProgrammer's Name: Katherine P. Aller");
        System.out.println("Program and Section: DIT 2-6");
    }
}
