public class Main {
    public static void main(String[] args) {
        KronometreThread thread1= new KronometreThread("therad1");
        KronometreThread thread2= new KronometreThread("therad2");
        KronometreThread thread3= new KronometreThread("therad3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}