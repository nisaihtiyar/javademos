public class ProductValidator {
    //Statik kullanarak bir kere calistirip arac gibi her yerde kullanabiliriz
    //Static olarak bir kere olusur butun kullanicilar o sekilde kullanir
    //Statik tanimlaninca uygulama durana kadar bellekten atilmaz
    //o nedenle cok kullanilmaz

    static{
        System.out.println("Statik yapici blok calisti");
    }

    public ProductValidator(){
        System.out.println("Yapici blok calisti");
    }

    //Yapici blok orneginde new lemeden public olan calismaz ama static olan calisir

    public static boolean isValed(Product product){
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public void bisey(){

    }

    //class icerisinde class yazmaya inner class denir
    //temel class yapisi static olamaz ama icerisine static bi class yazilabilir
    public static class BaskaBirClass(){
        public static void sil(){

        }

    }
}
