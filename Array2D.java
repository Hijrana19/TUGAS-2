
package Projek;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
    // 3. Buat Array 2 Dimensi Dan lakukan Inputan unutk mengisi array
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris:");
        int baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom:");
        int kolom = input.nextInt();
        
        int[][] nilai = new int[baris][kolom];
        //Masukkan Nilai
        for (int a = 0; a< baris; a ++){
            for (int b = 0 ; b < kolom; b++){
                System.out.print("Masukkan nilai untuk baris ke-" + (a+1)+" kolom ke-" + (b+1) + "= ");
                nilai[a][b] = input.nextInt();
            }
        }
         System.out.println("Array 2 Dimensi:");
         for (int a = 0; a< baris; a++){
             for(int b = 0; b<kolom; b++){
                 System.out.println(nilai[a][b] + " ");
             }
             System.out.println("");
             
         }
         input.close();
    }
    
}
