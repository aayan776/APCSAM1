import java.util.Scanner;
class Basic_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = sc.nextInt();

        if (num > 10){
            System.out.println("Number greater than 10");
        }else{
            System.out.println("Number less than 10");
        }
    }
}