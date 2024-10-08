import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList sayilar = new ArrayList();

        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Ankara");
        //System.out.println(sayilar.size());

        //sayilar.set(2,100); //indexi 2 olan elemani 100 yapar
        //sayilar.remove(0);//liste sola dogru kayar
        //System.out.println(sayilar.get(0));
        //sayilar.clear();  //butun listeyi temizler

        for(Object i : sayilar){ // "ankara" sayi olmadigindan obje olarak yazdirabiliriz!
            System.out.println(i);
        }
    }
}