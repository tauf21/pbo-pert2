package Program;

import java.util.Scanner;
public class Latihan_A {
    public static void main(String[] args){
        int a;
        Scanner s = new Scanner(System.in);
        System.out.print("Masukan nilai = ");
        a = s.nextInt();
        if ((a>0) && (a%2==0)) {
            System.out.println(a+"adalah bilangan genap positif");         
        }else if((a<0)&& (a%2==0)){
            System.out.println(a+"adalah bilangan genap negaitf");
        }else if((a>0)&&(a%2!=0)){
            System.out.println(a+"adalah bilangan ganjil positif");
        }else{
            System.out.println(a+"adalah bilangan genap negatif");
        }
}
}

