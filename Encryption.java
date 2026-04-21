import java.math.BigInteger;
class Encryption{
    public static void main(String[] args) {
        BigInteger p = new BigInteger("37");
        BigInteger q = new BigInteger("53");

        BigInteger n = p.multiply(q);
        BigInteger phi = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
        BigInteger e = new BigInteger("17"); //public key

        BigInteger d = e.modInverse(phi);

        System.out.println("Public key: "+ e + ", " + n);
        System.out.println("private key: "+ d + ", " + n);

        int[] messages = {10, 20, 30, 50, 65};

        for (int i = 0; i < messages.length; i++){
            BigInteger message = BigInteger.valueOf(messages[i]);
            BigInteger cipher = message.modPow(e, n);
            BigInteger decrypted = cipher.modPow(d, n);

            System.out.println("Original: " + message);
            System.out.println("Encrypted: " + cipher);
            System.out.println("Decrypted: " + decrypted);
            System.out.println("");
        }
        System.out.println(n);
        System.out.println(phi);
        System.out.println(e);
        System.out.println(d);
    }
}