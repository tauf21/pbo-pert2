/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

/**
 *
 * @author root
 */
import java.util.Scanner;
public class hal17no1 {
       public static void main(String[] args){
        //variabel lokal
        int nomorHari;
        Scanner s = new Scanner(System.in);
        System.out.print("Masukan nomor hari : ");
        nomorHari = s.nextInt();

        switch (nomorHari){
            case 1:
                System.out.println("Hari ke-"+nomorHari+" : Senin");
                break;
            case 2:
                System.out.println("Hari ke-"+nomorHari+" : Selasa");
                break;
            case 3:
                System.out.println("Hari ke-"+nomorHari+" : Rabu");
                break;
            case 4:
                System.out.println("Hari ke-"+nomorHari+" : Kamis");
                break;
            case 5:
                System.out.println("Hari ke-"+nomorHari+" : Jumat");
                break;
            case 6:
                System.out.println("Hari ke-"+nomorHari+" : Sabtu");
                break;
            case 7:
                System.out.println("Hari ke-"+nomorHari+" : Minggu");
                break;
            default:
                System.out.println("Tdiak ada hari ke-"+nomorHari);
        }
    }
    
}
