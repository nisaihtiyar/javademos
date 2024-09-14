public class Main {
    public static void main(String[] args) {
        int num1 = 236,num2= 122,num3= 39;
        int larg = num1;

        if (larg<num2){
            larg=num2;
        }
        if(larg<num3){
            larg=num3;
        }

        System.out.println("En buyuk sayi: "+larg);
    }
}