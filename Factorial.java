import java.util.Scanner;
class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int i = 1;
        int result = 1;
        while (i <= n){
            result *= i;
            i++;
        }
        System.out.println(result);
    }
}