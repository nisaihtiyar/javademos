public class Main {
    public static void main(String[] args) {
        double[] myList = {1.1,6.2,3.3,4.4};
        double total = 0;
        double max= myList[0];
        for(double number:myList){
            if(max<number){
                max=number;
            }
            total = total+number;
            System.out.println(number);
        }
        System.out.println("Sayilarin toplami: "+total);
        System.out.println("En buyuk sayi: "+max);
    }

}