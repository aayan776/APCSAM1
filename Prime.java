import java.util.Scanner;
class Prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of cases: ");
        int t = sc.nextInt();

        for (int i = 1; i <= t; i++){
            System.out.println("Enter number: ");
            int n = sc.nextInt();
            int count = 0;
            for (int div = 2; div * div <= n; div++){
                if (n % div == 0){
                    count++;
                    break;
                }
            }
            if (count >= 1){
                System.out.println("Not prime");
            }else if (count == 0){
                System.out.println("Prime");
            }else{
                System.out.println("Not prime");
            }
        }
    }
}