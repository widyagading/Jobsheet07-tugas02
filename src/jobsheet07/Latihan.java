package jobsheet07;
import java.math.BigInteger;
import java.util.Scanner;
public class Latihan {
    public static void tampilJudul(String identitas)
    {
        System.out.println("Identitas: " + identitas);
        
        System.out.println("\nHitung Fibonacci");
        System.out.println("1, 1, 2, 3, 5, 8, 13, 21, ... dst.\n");
    }
    public static void main(String[] args) {
        String identitas = "Widya Gading Sejati / XRPL2 / 38";
        
        tampilJudul(identitas);
        int n = tampilInput();
    }
     private static int tampilInput() 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bilangan ke-:");
        int n = scanner.nextInt();
        
        return n;
    }
}
