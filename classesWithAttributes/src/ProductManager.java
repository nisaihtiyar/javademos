public class ProductManager {
    public void Add(Product product){
        //JDBC
        System.out.println("Urun eklendi: " + product.getName());
    }

    public void Add2(int id,String name,String description,int stockAmount,double price){
        //hatali kullanim
        //yeni ozellik eklenince kullanilan tum yerlerde bunu duzeltmek gerekir!!
    }
}
