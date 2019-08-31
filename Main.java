import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner inp = new Scanner(System.in);
        while (true) {
            System.out.print("Enter message;");
            String plain = inp.nextLine();
            System.out.print("Enter key;");
            String key = inp.nextLine();

            byte[] enc = CryptoChain.encryptBlockwise(key.getBytes(),plain.getBytes());
            System.out.println(CryptoChain.byteArrayToString(enc));
            System.out.println("");
            byte[] nplain = CryptoChain.decryptBlockwise(key.getBytes(), enc);
            System.out.println(CryptoChain.byteArrayToString(nplain));
            System.out.println("");
        }
    }
}
