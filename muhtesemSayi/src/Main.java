public class Main {
    public static void main(String[] args) {
        int sayi = 28;
        int toplam=0;

        for(int i=1;i<sayi;i++){
            if(sayi%i == 0){
                toplam += i;
            }
        }
        if(toplam == sayi){
            System.out.println(sayi +" sayisi muhtesem sayidir.");
        }
        else{
            System.out.println(sayi+ " sayisi muhtesem sayi degildir");
        }
    }
}