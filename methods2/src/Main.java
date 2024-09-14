public class Main {
    public static void main(String[] args) {
        //parametreli metodlar
        int toplam = topla(2,4);
        String sehir = sehirVer();
        System.out.println(toplam);
        System.out.println(sehir);

        System.out.println(topla2(2,3,4,5,4,5,22,34));
    }

    //void metodlar ekle sil gibi bir geri donussuz islem yapar
    public static int topla(int a,int b){
        int toplam;
        toplam = a+b;
        return toplam;
    }
    public static String sehirVer(){
        return "Samsun";
    }

    //!! VERIABLE ARGUMENTS !!
    public static int topla2(int... sayilar){
        int toplam = 0;
        for(int sayi:sayilar){
            toplam += sayi;
        }
        return toplam;
    }

}