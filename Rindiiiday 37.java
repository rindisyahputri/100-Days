 package day37;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        String nama,nim,kelas,alamat;
        System.out.print("masukkan nama : " );
        nama = input.nextLine ();
        System.out.print("masukkan nim : " );
        nim = input.nextLine ();
        System.out.print("masukkan kelas : " );
        kelas = input.nextLine ();
        System.out.print("masukkan alamat : " );
        alamat=input.nextLine ();
        System.out.print("masukkan umur : " );
        int umur= input.nextInt  ();
        System.out.print("masukkan tinggi badan : " );
        double tinggi_badan=input.nextDouble();
        
        
        System.out.print("nama : " + nama);
        System.out.print("nim : " + nim );
        System.out.print("kelas : " + kelas );
        System.out.print("alamat : " + alamat );
        System.out.println("umur : " + umur + "tahun" );
        System.out.println("tinggi badan :" + tinggi_badan + "cm");
    }
    
}
