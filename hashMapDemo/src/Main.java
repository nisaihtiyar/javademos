import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //hashmap i sozluklere benzetebiliriz
        //kelime : karsiligi --> seklinde

        HashMap<String,String> sozluk = new HashMap<String,String>();
        sozluk.put("book","kitap");
        sozluk.put("table","masa");
        sozluk.put("computer","bilgisayar");
        System.out.println(sozluk.size());

        for (String item : sozluk.keySet()){//anahtar listesini verir
            System.out.println("Eleman-"+item+" Deger-"+sozluk.get(item)); //sirayla bastirmaz
        }

        sozluk.remove("book");
        sozluk.clear();

        System.out.println(sozluk.get("book"));

    }
}