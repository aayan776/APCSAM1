import java.util.Scanner;
class Eligibility{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Are you eligible? (Yes/No): ");
        String str = sc.nextLine().toLowerCase().trim();

        if (str.equals("yes")){
            System.out.println("Good");
        }else if (str.equals("no")){
            System.out.println("Thank you for being honest.");
        }else{
            System.out.println("Invalid response.");
        }
    }
}