import java.util.Scanner;
class Items{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of items: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] name = new String[n];
        int[] id = new int[n];
        double[] price = new double[n];
        
        for (int i = 0; i < n; i++){
            System.out.println("Enter product name: ");
            name[i] = sc.nextLine();
            System.out.println("Enter product id: ");
            id[i] = sc.nextInt();
            System.out.println("Enter product price: ");
            price[i] = sc.nextDouble();
            sc.nextLine();
        }
        System.out.println("Product List: ");
        for (int i = 0; i < n; i++){
            System.out.println("Product item: " + (i+1));
            System.out.println("Product name: " + name[i]);
            System.out.println("Product id: " + id[i]);
            System.out.println("Product price: " + price[i]);
            System.out.println();
        }
    }
}