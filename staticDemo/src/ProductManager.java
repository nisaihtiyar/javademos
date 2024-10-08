public class ProductManager {
    public void add(Product product){
        //ProductValidator validator = new ProductValidator();
        //Productvalidator da statik yaptigimizdan new lemeye gerek kalmadi
        //Statik kullanarak bir kere calistirip arac gibi her yerde kullanabiliriz
        if(ProductValidator.isValed(product)) {
            System.out.println("Eklendi");
        }else{
            System.out.println("Urun bilgileri gecersizdir.");
        }

        //Yaoici blogu calistimak icin
        //ProductValidator productValidator= new ProductValidator();
        //productValidator.bisey();
    }
}
