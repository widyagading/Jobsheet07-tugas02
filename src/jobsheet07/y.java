package jobsheet07;
import java.util.Scanner;
public class Tugas02 {
    public static void tampilJudul(String identitas)
    {
        System.out.println("Identitas: " + identitas);
    }    
public static void main(String[] args)
    {
        
        Scanner sistem = new Scanner(System.in);
        int arr[] = {4, 5, 2, 3, 7};
        int arr1[] = {5000, 7000, 2000, 3000, 1000};
        int bayaran = 0;
        String identitas = "Widya Gading Sejati / XRPL2 / 38";        
        tampilJudul(identitas);
        
        System.out.print("Berat Maksimal: ");
        int x = sistem.nextInt();
        
        for(int i = 0; i < arr.length; i++)
        {
            int hasil = x / arr[i];
            x = x - (arr[i] * hasil);
            bayaran += hasil * arr1[i];
        }
        System.out.println("Bayaran: " + bayaran);
                
    }
}