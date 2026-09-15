import java.util.Scanner;
import java.math.BigInteger;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Membaca jumlah test case
        int t = input.nextInt();
        
        for (int i = 0; i < t; i++) {
            String s = input.next();
            
            try {
                // Menggunakan BigInteger karena angka bisa bernilai sangat besar[cite: 1]
                BigInteger n = new BigInteger(s);
                
                boolean muat = false;
                
                // Cek apakah masuk dalam rentang long
                if (n.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 && 
                    n.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
                    muat = true;
                }
                
                if (muat) {
                    System.out.println(s + " can be fitted in:");
                    
                    // Cek byte (-128 sampai 127)[cite: 1]
                    if (n.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0 && 
                        n.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0) {
                        System.out.println("* byte");
                    }
                    
                    // Cek short (-32768 sampai 32767)[cite: 1]
                    if (n.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0 && 
                        n.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0) {
                        System.out.println("* short");
                    }
                    
                    // Cek int[cite: 1]
                    if (n.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0 && 
                        n.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0) {
                        System.out.println("* int");
                    }
                    
                    // Cek long[cite: 1]
                    if (n.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 && 
                        n.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
                        System.out.println("* long");
                    }
                    
                } else {
                    System.out.println(s + " can't be fitted anywhere.");
                }
                
            } catch (Exception e) {
                System.out.println(s + " can't be fitted anywhere.");
            }
        }
        
        input.close();
    }
}