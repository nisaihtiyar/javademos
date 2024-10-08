//built-in (java nin icinde yazili bir fonksiyon - paket)
//import etmek gerekli


import matematik.DortIslem;
import matematik.Logaritma;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Adiniz: ");
//
//        String isim = scanner.nextLine();
//        System.out.println("Merhaba "+isim);

        ///////
        //////

        DortIslem islem = new DortIslem();
        System.out.println(islem.topla(2,5));

        Logaritma log = new Logaritma();
        System.out.println(log.logaritmaHesapla());
    }
}