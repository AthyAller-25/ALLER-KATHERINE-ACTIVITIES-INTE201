
import java.util.Scanner;

public class atmtransactionauthorizer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        Build a complete authorization system combining every
        selection statement from this week - no loops allowed.
        */

        System.out.println("\t\t=====EXPERT=====");
        System.out.println("===========ATM Transaction Authorizer===========\n");

        String username = "athyAdmin";
        String pin = "0225";

        System.out.print("Enter username: ");
        String enteredUsername = input.nextLine();

        if (enteredUsername.equals(username)) {

            System.out.print("Enter 4-digit PIN: ");
            String enteredPIN = input.nextLine();

            if (enteredPIN.equals(pin) && enteredPIN.length() == 4) {

                System.out.print("Enter account balance: ");
                double balance = input.nextDouble();

                System.out.print("Enter withdrawal amount: ");
                double withdrawalAmount = input.nextDouble();

                System.out.print("Enter previous daily withdrawals: ");
                double dailyWithdrawn = input.nextDouble();

                if (balance < 0 || dailyWithdrawn < 0) {
                    System.out.println("Status: DENIED");
                    System.out.println("Reason: Balance and previous daily withdrawals cannot be negative.");

                } else if (withdrawalAmount <= 0) {
                    System.out.println("Status: DENIED");
                    System.out.println("Reason: Withdrawal must be greater than zero.");

                } else {

                    String tier;
                    double dailyLimit;
                    double feeRate;

                   
                    if (balance < 5000) {
                        tier = "Bronze";
                        dailyLimit = 3000;
                    } else if (balance < 15000) {
                        tier = "Silver";
                        dailyLimit = 5000;
                    } else if (balance < 50000) {
                        tier = "Gold";
                        dailyLimit = 10000;
                    } else {
                        tier = "Platinum";
                        dailyLimit = 20000;
                    }

                   
                    switch (tier) {
                        case "Bronze":
                            feeRate = 0.02;
                            break;
                        case "Silver":
                            feeRate = 0.015;
                            break;
                        case "Gold":
                            feeRate = 0.01;
                            break;
                        default:
                            feeRate = 0.005;
                    }

                    double fee = withdrawalAmount * feeRate;
                    double totalDeduction = withdrawalAmount + fee;

                    System.out.println("\nAccount Tier: " + tier);
                    System.out.printf("Transaction Fee: %.2f%n", fee);

                    
                    if (balance >= totalDeduction) {

                        if (dailyWithdrawn + withdrawalAmount <= dailyLimit) {
                            System.out.println("Status: APPROVED");
                            System.out.printf("Remaining Balance: %.2f%n",
                                    balance - totalDeduction);
                        } else {
                            System.out.println("Status: DENIED");
                            System.out.println("Reason: Daily withdrawal limit exceeded.");
                        }

                    } else {
                        System.out.println("Status: DENIED");
                        System.out.println("Reason: Insufficient balance, including fee.");
                    }
                }

            } else {
                System.out.println("Status: DENIED");
                System.out.println("Reason: Invalid PIN. Enter the correct 4-digit PIN.");
            }

        } else {
            System.out.println("Status: DENIED");
            System.out.println("Reason: Invalid username.");
        }

        input.close();

        System.out.println("\n\n\nProgrammer's Name: Katherine P. Aller");
        System.out.println("Program and Section: DIT 2-6");
    }
}
