import java.util.Scanner;
class Shop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice1;
        int choice2;
        int quantity;
        double price = 0;

        double bill1 = 0;
        double bill2 = 0;
        double bill3 = 0;
        double bill4 = 0;
        double bill5 = 0;
        double Total = 0;

        char continueOrder;

        int av_Tshirt = 9;
        int av_Jeans = 6;
        int av_Shirt = 5;
        int av_Trousers = 5;
        int av_Panjabi = 4;

        int av_soup = 10;
        int av_fries = 9;
        int av_burger = 4;
        int av_pizza = 2;
        int av_drinks = 12;
        //ADD SIZE OPTIONS
        int av_suit = 3;
        int av_panjabi = 4;
        int av_saree = 2;
        int av_twop = 3;

        int av_car = 8;
        int av_plane = 4;
        int av_gun = 5;
        int av_ball = 13;
        int av_horse = 3;

        int av_ring = 8;
        int av_necklace = 4;
        int av_earring = 5;
        int av_nosering = 9;
        int av_bracelet = 6;
        while(true){
            System.out.println("Shops availiable: ");

            System.out.println("1.) Gulshan Fabrics: ");
            System.out.println("2.) Atlas Restaurant: ");
            System.out.println("3.) Dhaka Tailors: ");
            System.out.println("4.) Toy shop: ");
            System.out.println("5.) Jewellery Store: ");
            System.out.println("6.) Exit: ");

            System.out.println("Enter choice(1-6): ");
            choice1 = sc.nextInt();
            switch(choice1){
                case 1:
                    while (true){
                    System.out.println("Welcome to Gulshan Fabrics. Here are our options: ");

                    System.out.println("1.) T-Shirt");
                    System.out.println("2.) Jeans");
                    System.out.println("3.) Shirt");
                    System.out.println("4.) Trousers");
                    System.out.println("5.) Panjabi");
                    System.out.println("6.) Exit");

                    System.out.println("Enter choice(1-6): ");
                    choice2 = sc.nextInt();
                    switch(choice2){
                        case 1:
                            price = 485.32;
                            System.out.println("Price of 1: " + price);
                            System.out.println("Enter amount to buy: ");
                            quantity = sc.nextInt();
                            if (quantity > av_Tshirt || quantity < 0){
                                System.out.println("Product unavailable at that quantity.");
                            }else{
                                av_Tshirt -= quantity;
                                bill1 = price * quantity;
                                Total += bill1;
                                System.out.println(quantity + " T-Shirt added to cart.");
                            }
                            break;
                        case 2:
                            price = 1264.2;
                            System.out.println("Price of 1: " + price);
                            System.out.println("Enter amount to buy: ");
                            quantity = sc.nextInt();
                            if (quantity > av_Jeans || quantity < 0){
                                System.out.println("Product unavailable at that quantity.");
                            }else{
                                av_Jeans -= quantity;
                                bill1 = price * quantity;
                                Total += bill1;
                                System.out.println(quantity + " Jeans added to cart.");
                            }
                            break;
                        case 3:
                            price = 644.56;
                            System.out.println("Price of 1: " + price);
                            System.out.println("Enter amount to buy: ");
                            quantity = sc.nextInt();
                            if (quantity > av_Shirt || quantity < 0){
                                System.out.println("Product unavailable at that quantity.");
                            }else{
                                av_Shirt -= quantity;
                                bill1 = price * quantity;
                                Total += bill1;
                                System.out.println(quantity + " Shirt added to cart.");
                            }
                            break;
                        case 4:
                            price = 426.12;
                            System.out.println("Price of 1: " + price);
                            System.out.println("Enter amount to buy: ");
                            quantity = sc.nextInt();
                            if (quantity > av_Trousers || quantity < 0){
                                System.out.println("Product unavailable at that quantity.");
                            }else{
                                av_Trousers -= quantity;
                                bill1 = price * quantity;
                                Total += bill1;
                                System.out.println(quantity + " Trousers added to cart.");
                            }
                            break;
                        case 5:
                            price = 2438.28;
                            System.out.println("Price of 1: " + price);
                            System.out.println("Enter amount to buy: ");
                            quantity = sc.nextInt();
                            if (quantity > av_Panjabi || quantity < 0){
                                System.out.println("Product unavailable at that quantity.");
                            }else{
                                av_Panjabi -= quantity;
                                bill1 = price * quantity;
                                Total += bill1;
                                System.out.println(quantity + " Panjabi added to cart.");
                            }
                            break;
                        case 6:
                            break;
                        default:
                            System.out.println("Invalid choice.");
                            break;
                    }
                    System.out.println("Do you want to continue ordering? (y/n): ");
                    continueOrder = sc.next().charAt(0);
                    if (continueOrder == 'n' || continueOrder == 'N'){
                        break;
                    }
                }
                break;
                case 2:
                    while (true){
                    System.out.println("Welcome to The Atlas Restaurant. Here are our options: ");

                    System.out.println("1.) Soup");
                    System.out.println("2.) French Fries");
                    System.out.println("3.) Burger");
                    System.out.println("4.) Pizza");
                    System.out.println("5.) Soft Drinks");
                    System.out.println("6.) Exit");

                    System.out.println("Enter choice(1-6): ");
                    choice2 = sc.nextInt();
                    switch(choice2){
                        case 1:
                            price = 350.5;
                            System.out.println("Price of 1: " + price);
                            System.out.println("Enter amount to buy: ");
                            quantity = sc.nextInt();
                            if (quantity > av_soup || quantity < 0){
                                System.out.println("Product unavailable at that quantity.");
                            }else{
                                av_soup -= quantity;
                                bill2 = price * quantity;
                                Total += bill2;
                                System.out.println(quantity + " Soup added to order.");
                            }
                            break;
                        case 2:
                            price = 175.25;
                            System.out.println("Price of 1: " + price);
                            System.out.println("Enter amount to buy: ");
                            quantity = sc.nextInt();
                            if (quantity > av_fries || quantity < 0){
                                System.out.println("Product unavailable at that quantity.");
                            }else{
                                av_fries -= quantity;
                                bill2 = price * quantity;
                                Total += bill2;
                                System.out.println(quantity + " French Fries added to order.");
                            }
                            break;
                        case 3:
                            price = 360.0;
                            System.out.println("Price of 1: " + price);
                            System.out.println("Enter amount to buy: ");
                            quantity = sc.nextInt();
                            if (quantity > av_burger || quantity < 0){
                                System.out.println("Product unavailable at that quantity.");
                            }else{
                                av_burger -= quantity;
                                bill2 = price * quantity;
                                Total += bill2;
                                System.out.println(quantity + " Burger added to order.");
                            }
                            break;
                        case 4:
                            price = 1230.60;
                            System.out.println("Price of 1: " + price);
                            System.out.println("Enter amount to buy: ");
                            quantity = sc.nextInt();
                            if (quantity > av_pizza || quantity < 0){
                                System.out.println("Product unavailable at that quantity.");
                            }else{
                                av_pizza -= quantity;
                                bill2 = price * quantity;
                                Total += bill2;
                                System.out.println(quantity + " Pizza added to order.");
                            }
                            break;
                        case 5:
                            price = 70.28;
                            System.out.println("Price of 1: " + price);
                            System.out.println("Enter amount to buy: ");
                            quantity = sc.nextInt();
                            if (quantity > av_drinks || quantity < 0){
                                System.out.println("Product unavailable at that quantity.");
                            }else{
                                av_drinks -= quantity;
                                bill2 = price * quantity;
                                Total += bill2;
                                System.out.println(quantity + " Soft Drinks added to order.");
                            }
                            break;
                        case 6:
                            break;
                        default:
                            System.out.println("Invalid choice.");
                            break;
                    }
                    System.out.println("Do you want to continue ordering? (y/n): ");
                    continueOrder = sc.next().charAt(0);
                    if (continueOrder == 'n' || continueOrder == 'N'){
                        break;
                    }
                }
                break;
                case 3:
                    while (true){
                    System.out.println("Welcome to The Dhaka Tailors. Here are our options: ");

                    System.out.println("1.) Suit");
                    System.out.println("2.) Panjabi");
                    System.out.println("3.) Saree");
                    System.out.println("4.) Two-Piece");
                    System.out.println("5.) Exit");

                    System.out.println("Enter choice(1-5): ");
                    choice2 = sc.nextInt();
                    switch(choice2){
                        case 1:
                            price = 14725.0;
                            System.out.println("Price of 1: " + price);
                            System.out.println("Enter amount to buy: ");
                            quantity = sc.nextInt();
                            if (quantity > av_suit || quantity < 0){
                                System.out.println("Product unavailable at that quantity.");
                            }else{
                                av_suit -= quantity;
                                bill3 = price * quantity;
                                Total += bill3;
                                System.out.println(quantity + " Suit added to order.");
                            }
                            break;
                        case 2:
                            price = 4550.0;
                            System.out.println("Price of 1: " + price);
                            System.out.println("Enter amount to buy: ");
                            quantity = sc.nextInt();
                            if (quantity > av_panjabi || quantity < 0){
                                System.out.println("Product unavailable at that quantity.");
                            }else{
                                av_panjabi -= quantity;
                                bill3 = price * quantity;
                                Total += bill3;
                                System.out.println(quantity + " Panjabi added to order.");
                            }
                            break;
                        case 3:
                            price = 12000.0;
                            System.out.println("Price of 1: " + price);
                            System.out.println("Enter amount to buy: ");
                            quantity = sc.nextInt();
                            if (quantity > av_saree || quantity < 0){
                                System.out.println("Product unavailable at that quantity.");
                            }else{
                                av_saree -= quantity;
                                bill3 = price * quantity;
                                Total += bill3;
                                System.out.println(quantity + " Saree added to order.");
                            }
                            break;
                        case 4:
                            price = 6250.0;
                            System.out.println("Price of 1: " + price);
                            System.out.println("Enter amount to buy: ");
                            quantity = sc.nextInt();
                            if (quantity > av_twop || quantity < 0){
                                System.out.println("Product unavailable at that quantity.");
                            }else{
                                av_twop -= quantity;
                                bill3 = price * quantity;
                                Total += bill3;
                                System.out.println(quantity + " Two-Piece added to order.");
                            }
                            break;
                        case 5:
                            break;
                        default:
                            System.out.println("Invalid choice.");
                            break;
                    }
                    System.out.println("Do you want to continue ordering? (y/n): ");
                    continueOrder = sc.next().charAt(0);
                    if (continueOrder == 'n' || continueOrder == 'N'){
                        break;
                    }
                }
                break;
                case 4:
                    while (true){
                    System.out.println("Welcome to The Toy shop. Here are our options: ");

                    System.out.println("1.) Toy Car");
                    System.out.println("2.) Toy Plane");
                    System.out.println("3.) Toy Gun");
                    System.out.println("4.) Bouncy ball");
                    System.out.println("5.) Toy Horse");
                    System.out.println("6.) Exit");

                    System.out.println("Enter choice(1-6): ");
                    choice2 = sc.nextInt();
                    switch(choice2){
                        case 1:
                            price = 125.5;
                            System.out.println("Price of 1: " + price);
                            System.out.println("Enter amount to buy: ");
                            quantity = sc.nextInt();
                            if (quantity > av_car || quantity < 0){
                                System.out.println("Product unavailable at that quantity.");
                            }else{
                                av_car -= quantity;
                                bill4 = price * quantity;
                                Total += bill4;
                                System.out.println(quantity + " Toy car added to cart.");
                            }
                            break;
                        case 2:
                            price = 320.5;
                            System.out.println("Price of 1: " + price);
                            System.out.println("Enter amount to buy: ");
                            quantity = sc.nextInt();
                            if (quantity > av_plane || quantity < 0){
                                System.out.println("Product unavailable at that quantity.");
                            }else{
                                av_plane -= quantity;
                                bill4 = price * quantity;
                                Total += bill4;
                                System.out.println(quantity + " Toy plane added to cart.");
                            }
                            break;
                        case 3:
                            price = 420.1;
                            System.out.println("Price of 1: " + price);
                            System.out.println("Enter amount to buy: ");
                            quantity = sc.nextInt();
                            if (quantity > av_gun || quantity < 0){
                                System.out.println("Product unavailable at that quantity.");
                            }else{
                                av_gun -= quantity;
                                bill4 = price * quantity;
                                Total += bill4;
                                System.out.println(quantity + " Toy gun added to cart.");
                            }
                            break;
                        case 4:
                            price = 120.4;
                            System.out.println("Price of 1: " + price);
                            System.out.println("Enter amount to buy: ");
                            quantity = sc.nextInt();
                            if (quantity > av_ball || quantity < 0){
                                System.out.println("Product unavailable at that quantity.");
                            }else{
                                av_ball -= quantity;
                                bill4 = price * quantity;
                                Total += bill4;
                                System.out.println(quantity + " Bouncy ball added to cart.");
                            }
                            break;
                        case 5:
                            price = 1250.28;
                            System.out.println("Price of 1: " + price);
                            System.out.println("Enter amount to buy: ");
                            quantity = sc.nextInt();
                            if (quantity > av_horse || quantity < 0){
                                System.out.println("Product unavailable at that quantity.");
                            }else{
                                av_horse -= quantity;
                                bill4 = price * quantity;
                                Total += bill4;
                                System.out.println(quantity + " Toy horse added to cart.");
                            }
                            break;
                        case 6:
                            break;
                        default:
                            System.out.println("Invalid choice.");
                            break;
                    }
                    System.out.println("Do you want to continue ordering? (y/n): ");
                    continueOrder = sc.next().charAt(0);
                    if (continueOrder == 'n' || continueOrder == 'N'){
                        break;
                    }
                }
                break;
                case 5:
                    while (true){
                    System.out.println("Welcome to The Jewellery shop. Here are our options: ");

                    System.out.println("1.) Ring");
                    System.out.println("2.) Necklace");
                    System.out.println("3.) Earring");
                    System.out.println("4.) Nose ring");
                    System.out.println("5.) Bracelet");
                    System.out.println("6.) Exit");

                    System.out.println("Enter choice(1-6): ");
                    choice2 = sc.nextInt();
                    switch(choice2){
                        case 1:
                            price = 8000.0;
                            System.out.println("Price of 1: " + price);
                            System.out.println("Enter amount to buy: ");
                            quantity = sc.nextInt();
                            if (quantity > av_ring || quantity < 0){
                                System.out.println("Product unavailable at that quantity.");
                            }else{
                                av_ring -= quantity;
                                bill5 = price * quantity;
                                Total += bill5;
                                System.out.println(quantity + " Ring added to cart.");
                            }
                            break;
                        case 2:
                            price = 4500.0;
                            System.out.println("Price of 1: " + price);
                            System.out.println("Enter amount to buy: ");
                            quantity = sc.nextInt();
                            if (quantity > av_necklace || quantity < 0){
                                System.out.println("Product unavailable at that quantity.");
                            }else{
                                av_necklace -= quantity;
                                bill5 = price * quantity;
                                Total += bill5;
                                System.out.println(quantity + " Necklace added to cart.");
                            }
                            break;
                        case 3:
                            price = 1500.1;
                            System.out.println("Price of 1: " + price);
                            System.out.println("Enter amount to buy: ");
                            quantity = sc.nextInt();
                            if (quantity > av_earring || quantity < 0){
                                System.out.println("Product unavailable at that quantity.");
                            }else{
                                av_earring -= quantity;
                                bill5 = price * quantity;
                                Total += bill5;
                                System.out.println(quantity + " Earring added to cart.");
                            }
                            break;
                        case 4:
                            price = 900.4;
                            System.out.println("Price of 1: " + price);
                            System.out.println("Enter amount to buy: ");
                            quantity = sc.nextInt();
                            if (quantity > av_nosering || quantity < 0){
                                System.out.println("Product unavailable at that quantity.");
                            }else{
                                av_nosering -= quantity;
                                bill5 = price * quantity;
                                Total += bill5;
                                System.out.println(quantity + " Nose ring added to cart.");
                            }
                            break;
                        case 5:
                            price = 1600.28;
                            System.out.println("Price of 1: " + price);
                            System.out.println("Enter amount to buy: ");
                            quantity = sc.nextInt();
                            if (quantity > av_bracelet || quantity < 0){
                                System.out.println("Product unavailable at that quantity.");
                            }else{
                                av_bracelet -= quantity;
                                bill5 = price * quantity;
                                Total += bill5;
                                System.out.println(quantity + " Bracelet added to cart.");
                            }
                            break;
                        case 6:
                            break;
                        default:
                            System.out.println("Invalid choice.");
                            break;
                    }
                    System.out.println("Do you want to continue ordering? (y/n): ");
                    continueOrder = sc.next().charAt(0);
                    if (continueOrder == 'n' || continueOrder == 'N'){
                        break;
                    }
                }
                break;
                case 6:
                    System.out.println("Total cost: " + Total);
                    System.out.println("Thanks for shopping with us!");
                    break;
            }
            break;
        }
    }
}