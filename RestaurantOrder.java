import java.util.Scanner;
class RestaurantOrder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int quantity;
        double price = 0;
        double TotalBill = 0;
        char continueOrder;
        System.out.println("Welcome to the Restaurant: ");
        while (true) { 
            System.out.println("1.) Burger - 350tk");
            System.out.println("2.) Pizza - 850tk");
            System.out.println("3.) Pasta - 400tk");
            System.out.println("4.) Coffee - 75.25tk");
            System.out.println("5.) Ice Cream - 100tk");

            System.out.println("Enter choice(1-5): ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    price = 350;
                    System.out.println("You have chosen burger.");
                    break;
                case 2:
                    price = 850;
                    System.out.println("You have chosen pizza.");
                    break;
                case 3:
                    price = 400;
                    System.out.println("You have chosen pasta.");
                    break;
                case 4:
                    price = 75.25;
                    System.out.println("You have chosen coffee.");
                    break;
                case 5:
                    price = 100;
                    System.out.println("You have chosen ice cream.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    continue;
            }
            System.out.println("Enter quantity: ");
            quantity = sc.nextInt();
            double itemTotal = price * quantity;
            TotalBill += itemTotal;
            System.out.println("Item total: " + itemTotal);

            System.out.println("Do you want to continue ordering? (y/n): ");
            continueOrder = sc.next().charAt(0);
            if (continueOrder == 'n' || continueOrder == 'N'){
                break;
            }
        }
        double discount = 0;

        if (TotalBill >= 500){
            discount = TotalBill * 0.1;
            System.out.println("You have recievied a 10% discount!");
        }else if (TotalBill >= 300){
            discount = TotalBill * 0.075;
            System.out.println("You have recievied a 7.5% discount!");
        }else if (TotalBill >= 200){
            discount = TotalBill * 0.05;
            System.out.println("You have recievied a 5% discount!");
        }else{
            System.out.println("No discount recieved.");
        }
        double FinalBill = TotalBill - discount;

        System.out.println("<=============== BILL ===============>");
        System.out.println("Total Bill: " + TotalBill);
        System.out.println("Discount: " + discount);
        System.out.println("Final Bill: " + FinalBill);
        System.out.println("<==============================>");
        System.out.println("Thank you for visiting The Restaurant!");
    }
}