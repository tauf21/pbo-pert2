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
public class hal17no3 {
    public static void main(String[] args){
        int a, b;
         a = 6;
         b = -3;

         if((a+b) >= (b - a))
         /* (6+(-3)) >= (-3-6)
            3 >= -9
          */
         {
             a += 2; // 6 + 2 = 8
             b += a; // -3 + 8 = 5
             if(a % 2 == 0){
                 a = b; // a=5 , b=5
             }else{
                 b += a + 1; //8 + 1 = 9
             }
         }
         a = -b -a; // -5 - 5 = -10
        System.out.println("a = "+a);//hasilnya  a = -10
        System.out.println("b = "+b);//hasilnya b = 5
    }
}
