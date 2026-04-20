class loops{
    public static void main() {
        int i =1;
        while (i <= 10){
            System.out.println("Number: " + i);
            i++;
        }
        for (int j = 0; j<=5; ++j){
            System.out.println("Number: " + j);
        }
        int q = 4;
        do { 
            System.out.println("Hello");
            q++;
        } while (q <= 4);

        for (int p = 10; p >= 0; p--){
            System.out.println("Number: " + p);
        }
    }
}