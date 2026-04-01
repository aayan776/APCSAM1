class StringPattern {
    public static void main(String[] args) {
        String java = "JAVA";
        for (int i = 0; i <= java.length(); i++){
            for (int j = 0; j < i; j++){
                System.out.print(java.charAt(j));
            }
            System.out.println(" ");
        }
    }
}