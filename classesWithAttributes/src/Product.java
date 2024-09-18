public class Product {
    //attribute | field
    private int id; // private kullanilabilir sadece o blokta kullanilir
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String kod;
    //getter  okuma amacli
    //setter deger atamaya yarar

    //GETTER
    public int getId(){
        return id;
        //id yi okuyabilir
    }

    //SETTER
    public void setId(int id){
      //this.id=id;  //this icerisinde bulundugum class daki id
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getKod() {
        return this.name.substring(0,1) + this.id;
    }


}
