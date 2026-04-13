import java.util.Scanner;
class Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter annual income: ");
        double income = sc.nextDouble();
        double tax = 0;

        if (income <= 300000){
            tax = 0;
        }else if (income <= 600000){
            tax = (income - 300000) * 0.05;
        }else if (income <= 1000000){
            tax = (300000 * 0.05) + (income - 600000) * 0.1;
        }else if (income <= 1500000){
            tax = (300000 * 0.05) + (400000  * 0.1) + (income - 1000000) * 0.15;
        }else{
            tax = (300000 * 0.05) + (400000  * 0.1) + (500000  * 0.15) + (income - 1500000) * 0.2;
        }
        double netIncome = income - tax;

        System.out.println("<----------------------Tax Summary---------------------->");
        System.out.println("Annual Income: " + income);
        System.out.println("Calculated tax: " + tax);
        System.out.println("Net Income: " + netIncome);
    }
}