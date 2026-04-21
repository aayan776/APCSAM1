import java.util.Scanner;
class DoWhile{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int i = 0;
        do { 
            System.out.println("Number: " + i);
            i++;
        } while (i <= n);
    }
}