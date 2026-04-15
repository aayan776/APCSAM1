import java.util.Scanner;
class Weather{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice1;
        int choice2;
        double price = 0;
        double Total = 0;
        char continueOrder;

        int av_Tshirt = 3;
        int av_Jeans = 2;
        int av_Shirt = 4;
        int av_Trousers = 2;
        int av_Panjabi = 1;

        while(true){
            System.out.println("Shops availiable: ");

            System.out.println("1.) Gulshan Fabrics: ");
            System.out.println("2.) Biryani House: ");
            System.out.println("3.) Dhaka Tailors: ");
            System.out.println("4.) Toy shop: ");
            System.out.println("5.) Jewellery Store: ");

            System.out.println("Enter choice(1-5): ");
            choice1 = sc.nextInt();
            switch(choice1){
                case 1:
                    System.out.println("Welcome to Gulshan Fabrics. Here are our options: ");

                    System.out.println("1.) T-Shirt");
                    System.out.println("2.) Jeans");
                    System.out.println("3.) Shirt");
                    System.out.println("4.) Trousers");
                    System.out.println("5.) Panjabi");

                    System.out.println("Enter choice(1-5): ");
                    choice2 = sc.nextInt();
                    switch(choice2){
                        case 1:
                            price = 485.32;
                            System.out.println("T-Shirt added to cart.");
                            av_Tshirt -= 1;
                            break;
                        case 2:
                            price = 1264.2;
                            System.out.println("Jeans added to cart.");
                            av_Jeans -= 1;
                            break;
                        case 3:
                            price = 644.56;
                            System.out.println("Shirt added to cart.");
                            av_Shirt -= 1;
                            break;
                        case 4:
                            price = 426.12;
                            System.out.println("Trousers added to cart.");
                            av_Trousers -= 1;
                            break;
                        case 5:
                            price = 2438.28;
                            System.out.println("Panjabi added to cart.");
                            av_Panjabi -= 1;
                            break;
                    }
                    System.out.println("Do you want to continue ordering? (y/n): ");
                    continueOrder = sc.next().charAt(0);
                    if (continueOrder == 'n' || continueOrder == 'N'){
                        break;
                    }
            }
        }
    }
}