public class MultiTierDiscountSystem {
    public static void main(String[] args) {

        
        /* 
        Use an else-if ladder to assign a discount tier based on purchase amount
        */
        
        System.out.println("\t=====INTERMEDIATE=====");
        System.out.println("\n\n===========Multi-Tier Discount System===========\n");

        double purAmount = 2500.00;
        double discount;

        if (purAmount < 1000) {
            discount = 0.00;
        } else if (purAmount < 2000) {
            discount = 0.05;
        } else if (purAmount < 3000) {
            discount = 0.10;
        } else {
            discount = 0.15;
        }

        double discountAmount = purAmount * discount;
        double finalPrice = purAmount- discountAmount;

        System.out.println("Purchase Amount: " + purAmount);
        System.out.println("Discount Tier: " + (discount * 100) + "%");
        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Final Discounted Price: " + finalPrice);
        
        System.out.println("\n\n\nProgrammer's Name: Katherine P. Aller");
        System.out.println("Program and Section: DIT 2-6");
    }
}
