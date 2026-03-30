import java.util.Scanner;
public class Even_odd_and_square{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();

        evenorodd(n);
        perfect_square(n);
    }
    public static void evenorodd(int num) {
        if (num % 2 == 0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }
    public static void perfect_square(int num) {
        int sqrt = (int) Math.sqrt(num);
        if (sqrt * sqrt == num){
            System.out.println("Perfect square");
        }else{
            System.out.println("Not perfect square");
        }
    }
}