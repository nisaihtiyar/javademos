public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.price = 10;
        product.name= "Mouse";

        manager.add(product);

        //bu tarz yapilar onerilmez
        //solid in tek sorumluluk prensibine aykiri --> inner class lar
        //ayirmak daha mantikli
        DatabaseHelper.Crud.Delete();
        DatabaseHelper.Connection.createConnection();
    }
}