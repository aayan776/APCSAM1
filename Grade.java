import java.util.Scanner;
class Grade{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total final marks: ");
        double marks = sc.nextDouble();
        System.out.println("Enter total attendance: ");
        int attendance = sc.nextInt();

        if (marks >= 450 && attendance >= 120){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }
}