package Perulangan.PR;

import java.util.Scanner;

public class menghitungFactorial {
    public static void main(String[] args) {
        int angka, temp=1;
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan Angka");
        angka = s.nextInt();
        for (int i = angka; i >=1 ; i--) {
            System.out.print(i+" X ");
            temp *=i;
            
        }
        System.out.println();
        System.out.println("Total Faktorial: "+temp);

        s.close();
    }
    
}
