import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String A = input.next();
        String B = input.next();

        // 1. Menjumlahkan panjang A dan B
        System.out.println(A.length() + B.length());

        // 2. Membandingkan A dan B secara leksikografis
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // 3. Mengubah huruf pertama menjadi huruf kapital
        String capitalA = Character.toUpperCase(A.charAt(0)) + A.substring(1);
        String capitalB = Character.toUpperCase(B.charAt(0)) + B.substring(1);

        System.out.println(capitalA + " " + capitalB);

        input.close();
    }
}