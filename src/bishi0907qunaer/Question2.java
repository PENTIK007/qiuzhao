package bishi0907qunaer;

public class Question2 {
    public static void main(String[] args) {
        System.out.println(new Question2().Decrypt(4296,1601,4757));
    }
    public int Decrypt (int encryptedNumber, int decryption, int number) {
        // write code here
        int res = 1;
        while (decryption != 0) {
            if ((decryption & 1) != 0) {
                res = res * encryptedNumber % number;
            }
            encryptedNumber = encryptedNumber * encryptedNumber % number;
            decryption = decryption / 2;
        }
        return res;
    }
}
