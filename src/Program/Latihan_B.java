/*+
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import java.util.Scanner;

public class Latihan_B {
    public static void main(String[] args){
        int n;
        double b,jumlah=0,diskon;
        Scanner s = new Scanner(System.in);
        System.out.print ("masukan banyak barang = ");
        n = s.nextInt();
        for (int i=1 ;i<=n;i++){
            System.out.print("Masukan barangke-"+i+" = ");
            b = s.nextDouble();
            jumlah = jumlah + b;
            
        }
        if(jumlah > 10000 && jumlah < 20000) {
            diskon=jumlah*5/100;         
        }else if(jumlah>25000 && jumlah<100000){
            diskon=jumlah*10/100;
        }else{
            diskon=jumlah*25/100;
        }
        System.out.println("Dapat diskon = "+diskon);
        System.out.println("harga akhir = "+(jumlah-diskon));
    }
    
}
