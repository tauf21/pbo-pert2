/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;
import java.util.Scanner;
/**
 *
 * @author root
 */
public class hal17no2 {
    public static void main(String[] args){
            String nama,pilihan;
            double BBI,TB,BB;
            Scanner s = new Scanner(System.in);
              System.out.println("Menentukan Berat Badan Ideal\n");
              System.out.println("~Silahkan isi data dibawah ini~");
              System.out.print("Nama                          : ");
              nama = s.nextLine();
              System.out.print("Jenis Kelamin <pria/wanita>   : ");
              pilihan = s.nextLine();
              System.out.print("Tinggi Badan(cm)              : ");
              TB = s.nextDouble();
              System.out.print("Berat Badan(kg)               : ");
              BB = s.nextDouble();
              if(pilihan.equals("pria")){
                  BBI=(TB-100)-((TB-100)*10/100);
                  if(BB > BBI){
                      System.out.println("\n~SELAMAT BADAN ANDA IDEAL~");
                  }
                  else{
                      System.out.println("\n~MAAF BERAT ANDA TIDAK IDEAL~");
                  }
              }else if(pilihan.equals("wanita")){
                  BBI=(TB-100)-((TB-100)*15/100);
                  if(BB>BBI){
                      System.out.println("\n~SELAMAT BADAN ANDA IDEAL~");
                  }
                  else{
                      System.out.println("\n~MAAF BERAT ANDA TIDAK IDEAL~");
                  }
              }else{
                  System.out.println("\ndata yang anda inputkan terdapat kesalahan, silahkan ulangi program ini!");
              }


        }
}
