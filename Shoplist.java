import java.util.Scanner;
class Shoplist{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Total = 0;
        byte choice;
        do { 
            System.out.println("=============Shop List==============");
            System.out.println("1.) Vegetables");
            System.out.println("2.) Fruits");
            System.out.println("3.) Meat");
            System.out.println("4.) Fish");
            System.out.println("5.) Exit");
            System.out.println("Enter choice: ");
            choice = sc.nextByte();
            switch(choice){
                case 1:
                    Total += 225.4;
                    System.out.println("Vegetables added!");
                    System.out.println("Total = " + Total);
                    break;
                case 2:
                    Total += 350.26;
                    System.out.println("Fruits added!");
                    System.out.println("Total = " + Total);
                    break;
                case 3:
                    Total += 1143.68;
                    System.out.println("Meat added!");
                    System.out.println("Total = " + Total);
                    break;
                case 4:
                    Total += 2432.98;
                    System.out.println("Total = " + Total);
                    System.out.println(Total);
                    break;
                case 5:
                    System.out.println("Thank you for shopping!");
                    System.out.println("Total = " + Total);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while(choice != 5);
    }
}