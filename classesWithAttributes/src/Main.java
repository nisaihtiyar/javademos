public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setId(1);
        product1.setName("Laptop");
        product1.setDescription("asus");
        product1.setPrice(6000);
        product1.setStockAmount(30);

        ProductManager productManager = new ProductManager();
        productManager.Add(product1);

        System.out.println(product1.getKod());


    }
}