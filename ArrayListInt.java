
package Projek;

import java.util.ArrayList;

public class ArrayListInt {
    public static void main(String[] args) {
    // 5. Buat ArrayList bertipe Integer dan lakukan proses penambahan, mengakses, mengganti, menghapus dan membaca ukuran array
        ArrayList<Integer> nilai = new ArrayList<>();
        nilai.add(10);
        nilai.add(20);
        nilai.add(30);
        nilai.add(40);
        nilai.add(50);
        System.out.println(nilai);
        System.out.println(" ");
        
        System.out.println("1. Membaca/Mengakses");
        System.out.println("Array:"+nilai);
        System.out.println(nilai.get(0));
        
        System.out.println("2. Mengganti");
        System.out.println("Sebelum diganti :" + nilai);
        nilai.set(2,100);
        System.out.println("Setelah Diganti:"+nilai);
        
        System.out.println("3.Menghapus");
        System.out.println("Array :"+nilai);
        nilai.remove(1);
        System.out.println("Hasil:"+nilai);
        
        System.out.println("4. Membaca Ukuran Array");
        System.out.println("Ukuran Array:"+nilai.size());
        
    }
    
}
