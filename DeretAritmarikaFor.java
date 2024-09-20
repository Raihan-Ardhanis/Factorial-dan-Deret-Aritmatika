package Perulangan.PR;

import java.util.Scanner;

public class DeretAritmarikaFor {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in); 
         int batasAwal, batasAkhir, beda; 

        System.out.print("Masukkan batas awal: ");
         batasAwal = input.nextInt();        
        System.out.print("Masukkan batas akhir: ");
         batasAkhir = input.nextInt();       
        System.out.print("Masukkan beda: ");
         beda = input.nextInt();    
        System.out.println("Deret Aritmatika: ");
        for (int i = batasAwal; i <= batasAkhir; i += beda) {
            System.out.print(i + " ");
        }

        input.close();
}
}
    