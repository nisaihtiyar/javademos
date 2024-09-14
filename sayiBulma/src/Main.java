public class Main {
    public static void main(String[] args) {
        //dizi icerisinde sayi bulma
        int[] sayilar = new int[] {1,2,4,6,9,56,43};
        int aranan = 6;
        boolean varMi = false;

        for(int i=0;i<sayilar.length;i++){
            if(sayilar[i]==aranan){
                varMi = true;
                break;
            }

        }
        if(varMi){
            System.out.println(aranan+" sayisi dizide var.");
        }
        else{
            System.out.println(aranan+" sayisi dizide yok.");
        }
    }
}