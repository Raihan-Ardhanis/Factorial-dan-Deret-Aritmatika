package Perulangan.PR;

import java.util.Scanner;

public class DeretAritmatikaWhile {
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
        int i = batasAwal;
        while (i <= batasAkhir) {
            System.out.print(i + " ");
            i += beda;
        }

        input.close();

    }
}
