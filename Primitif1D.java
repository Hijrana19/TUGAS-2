package Projek;

public class Primitif1D {
    public static void main(String[] args) {
    //1. Buat Array 1 Dimensi dengan 8 Tipe Data Primitif dan Berikan Nilai Di setiap Array
        //Integer
        int [] nilaiint = {2,4,5,6,7};
        for (int a : nilaiint){
            System.out.println(a);
        }
        //Float
        float [] nilaifloat = {12.5f, 30.2f, 20.12f};
        for (float b : nilaifloat){
            System.out.println(b);
        }
        //BYte
        byte [] nilaibyte = {-29, 21, 22, -30};
        for (byte c : nilaibyte){
            System.out.println(c);
        }
        //Short
        short [] nilaishort = {2021, 2022, 2023, 2024};
        for (short d : nilaishort){
            System.out.println(d);
        }
        //Long
        long [] nilailong = {199928, 2901929, 2910339};
        for (long e : nilailong){
            System.out.println(e);
        }
        //Double
        double [] nilaidouble = {3.14, 0.0, 3.1};
        for(double f : nilaidouble){
            System.out.println(f);
        }
        //Char
        char [] nilaichar = {'A','B','C','+'};
        for(char g : nilaichar){
            System.out.println(g);
        }
        //Boolean
        boolean [] nilaibool = {false,true};
        for(boolean h : nilaibool){
            System.out.println(h);
        }
    }
    
}
