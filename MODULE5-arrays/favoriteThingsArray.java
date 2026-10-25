public class favoriteThingsArray {
    public static void main(String[] args) {

        System.out.println("\t\t=====BASIC=====");
        System.out.println("\n\n===========FAVORITE THINGS ARRAY===========");
        
        System.out.println("\t   MY FAVORITE THINGS:");

        /*
        Store and print a small list of personal favorites using
        a single-dimensional array.
        */
        String[] myfavorites = {
            "Cooking",
            "Music",
            "Manhwa",
            "Sudoku",
            "Organizing"
        };

        for (int i = 0; i < myfavorites.length; i++) {
            System.out.println((i + 1) + ". " + myfavorites[i]);
        }

        System.out.println("Total Favorites: " + myfavorites.length);

        System.out.println("\n\n\nProgrammer's Name: Katherine P. Aller");
        System.out.println("Program and Section: DIT 2-6");
    }
}
