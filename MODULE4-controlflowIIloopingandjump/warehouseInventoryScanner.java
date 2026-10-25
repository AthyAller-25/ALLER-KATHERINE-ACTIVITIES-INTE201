 import java.util.Scanner;
public class warehouseInventoryScanner {

    static Scanner input = new Scanner(System.in);
    static int[][] warehouse = {
        {10, 25, 5},
        {15, -1, 3},
        {20, 8, 12}
    };

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===========Warehouse Inventory Scanner===========");
            System.out.println("1. View Warehouse Inventory");
            System.out.println("2. Total Inventory");
            System.out.println("3. Find Critically Low Shelf");
            System.out.println("4. Restock Shelf");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    viewInventory();
                    break;
                case 2:
                    totalInventory();
                    break;
                case 3:
                    findLowShelf();
                    break;
                case 4:
                    restockShelf();
                    break;
                case 5:
                    System.out.println("Exiting Warehouse Inventory Scanner...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        input.close();
    }

    static void viewInventory() {
        System.out.println("\nWarehouse Inventory:");

        for (int row = 0; row < warehouse.length; row++) {
            for (int column = 0; column < warehouse[row].length; column++) {
                if (warehouse[row][column] == -1) {
                    System.out.print("DAMAGED\t");
                } else {
                    System.out.print(warehouse[row][column] + "\t");
                }
            }
            System.out.println();
        }
    }

    static void totalInventory() {
        int total = 0;

        for (int row = 0; row < warehouse.length; row++) {
            for (int column = 0; column < warehouse[row].length; column++) {

                if (warehouse[row][column] == -1) {
                    continue; // Skip damaged shelves
                }

                total += warehouse[row][column];
            }
        }

        System.out.println("Total Inventory: " + total);
    }

    static void findLowShelf() {
        boolean found = false;

        for (int row = 0; row < warehouse.length; row++) {
            for (int column = 0; column < warehouse[row].length; column++) {

                if (warehouse[row][column] == -1) {
                    continue; 
                }

                if (warehouse[row][column] <= 5) {
                    System.out.println("Critically low shelf found!");
                    System.out.println("Row: " + (row + 1));
                    System.out.println("Column: " + (column + 1));
                    System.out.println("Item Count: " + warehouse[row][column]);

                    found = true;
                    break;
                }
            }

            if (found) {
                break; 
            }
        }

        if (!found) {
            System.out.println("No critically low shelf found.");
        }
    }

    static void restockShelf() {
        System.out.print("Enter row number (1-3): ");
        int row = input.nextInt();

        System.out.print("Enter column number (1-3): ");
        int column = input.nextInt();

        if (row < 1 || row > warehouse.length
                || column < 1 || column > warehouse[0].length) {
            System.out.println("Invalid shelf position.");
            return;
        }

        if (warehouse[row - 1][column - 1] == -1) {
            System.out.println("Cannot restock a damaged shelf.");
            return;
        }

        int amount = 0;

        while (amount <= 0) {
            System.out.print("Enter restock amount (must be greater than 0): ");
            amount = input.nextInt();

            if (amount <= 0) {
                System.out.println("Invalid amount. Please enter a positive number.");
            }
        }

        warehouse[row - 1][column - 1] += amount;

        System.out.println("Restocking successful!");
        System.out.println("Updated Item Count: "
                + warehouse[row - 1][column - 1]);
    }
}
