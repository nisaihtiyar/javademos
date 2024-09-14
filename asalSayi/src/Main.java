public class Main {
    public static void main(String[] args) {
        int num = 2;
        int asalMi = 1;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                asalMi = 0;
            }

        }
        if (num == 1 || asalMi == 0) {
            System.out.println(num + " sayisi asal degildir.");
        } else {
            System.out.println(num + " sayisi asaldir.");
        }
    }
}