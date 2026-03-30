import java.util.Scanner;
public class Series{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = 3; i <= n; i += 2){
            sum += i;
            count++;
            System.out.println(sum);
            System.out.println("Number of iterations: " + count);
        }
    }
}