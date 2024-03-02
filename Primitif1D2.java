
package Projek;

import java.util.Arrays;

public class Primitif1D2 {
    public static void main(String[] args) {
    //2. Buatlah Array 1 Dimensi bertipe data primitif apapun dan berikan nilai kemudian cetak dengan 5 metode
    
    int [] nilai = {10,30,40,20,50};
        System.out.println("1. Metode FOR");
        for (int a = 0; a< nilai.length; a++){
            System.out.println(nilai[a]);
        }
        System.out.println("2. Metode FOR-EACH");
        for (int b : nilai){
            System.out.println(b);
        }
        System.out.println("3. Metode WHILE");
        int c = 0;
        while (c < nilai.length){
            System.out.println(nilai[c]);c++;
        }
        System.out.println("4. Metode DO-WHILE");
        int d = 0;
        do{
            System.out.println(nilai[d]);d++;
        }while (d < nilai.length);
        
        System.out.println("5. Metode CHAR");
        System.out.println(Arrays.toString(nilai));
        
    }
    
}
