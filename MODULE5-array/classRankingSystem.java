public class classRankingSystem {

    static class Student {
        String name;
        int[] quizzes;
        double average;

        Student(String name, int[] quizzes) {
            this.name = name;
            this.quizzes = quizzes;

            int total = 0;

            for (int i = 0; i < quizzes.length; i++) {
                total += quizzes[i];
            }

            average = total / (double) quizzes.length;
        }
    }

    public static void main(String[] args) {

        System.out.println("\t    =====EXPERT=====");
        System.out.println("===========CLASS RANKING SYSTEM===========\n");

        String[] names = {
            "Samantha Clarize",
            "Austin Villafuento",
            "John Patrick Gonsales",
            "Princes Veronica Volivar",
            "Jasmin Kaira Bininsig"
        };

        int[][] quizData = {
            {90, 85, 95, 90},
            {80, 85, 90, 85},
            {95, 90, 95, 92},
            {80, 85, 90, 85},
            {88, 90, 85, 87}
        };

       
        Student[] students = new Student[names.length];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(names[i], quizData[i]);
        }

    
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {

                if (students[j].average < students[j + 1].average) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        
        System.out.println("===============LEADERBOARD===============");
        System.out.printf("%-8s %-25s %-15s%n", "Rank", "Name", "Average");
        System.out.println("-----------------------------------------");

        int rank = 1;

        for (int i = 0; i < students.length; i++) {

            if (i > 0 && students[i].average < students[i - 1].average) {
                rank = i + 1;
            }

            System.out.printf("%-8d %-25s %-15.2f%n",
                    rank, students[i].name, students[i].average);
        }

        
        String targetName = "Princes Veronica Volivar";
        int foundAt = -1;

        for (int i = 0; i < students.length; i++) {
            if (students[i].name.equalsIgnoreCase(targetName)) {
                foundAt = i;
                break;
            }
        }

        System.out.println("\n===========STUDENT RANK SEARCH===========");

        if (foundAt != -1) {
            int studentRank = 1;

            for (int i = 1; i <= foundAt; i++) {
                if (students[i].average < students[i - 1].average) {
                    studentRank = i + 1;
                }
            }

            System.out.println("Student Name: " + students[foundAt].name);
            System.out.printf("Average: %.2f%n", students[foundAt].average);
            System.out.println("Rank: " + studentRank);
        } else {
            System.out.println("Student not found.");
        }

        System.out.println("\n\nProgrammer's Name: Katherine P. Aller");
        System.out.println("Program and Section: DIT 2-6");
    }
}
