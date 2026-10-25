public class NestedLoginValidator {
    public static void main(String[] args) {

        /*
        Use nested if statements to validate a login in stages, only checking each stage if the previous one passed
        */
        
        System.out.println("\t=====ADVANCED=====");
        System.out.println("\n\n===========Nested Login Validator===========\n");

        String username = "athyAdmin";
        String password = "022507";
        boolean accountLocked = true;

        if (username.equals("athyAdmin")) {
            if (password.equals("022507")) {
                if (!accountLocked) {
                    System.out.println("Login Successful");
                } else {
                    System.out.println("Login Failed: Wrong Username.");
                }
            } else {
                System.out.println("Login Failed: Wrong password.");
            }
        } else {
            System.out.println("Login Failed: Account is locked.");
        }
        System.out.println("\n\n\nProgrammer's Name: Katherine P. Aller");
        System.out.println("Program and Section: DIT 2-6");
    }
}
