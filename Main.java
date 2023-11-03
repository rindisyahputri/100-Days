package day26;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        
		     String nama,nim,alamat;
        int umur;
        Scanner input = new Scanner(System.in);
        System.out.print("Nama : ");
        nama = input.nextLine();
        System.out.print("nim : ");
        nim = input.nextLine();
        System.out.print("alamat : ");
        alamat = input.nextLine();
        System.out.print("umur : ");
        umur = input.nextInt();
        System.out.println(" nama "+nama+ " nim "+nim+ " alamat "+alamat+ " umur  "+umur);
    }
}
        