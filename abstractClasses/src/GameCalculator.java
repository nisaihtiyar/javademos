public abstract class GameCalculator {
    //class in absract olmasi icin abstract bi metod olmak zorunda degil
    public abstract void hesapla();
    //abstract ekleyerek aslinda her sinifin kendi icinde
    //bu metodu kullanmasini zorunlu kildik
    //yani her calculator clasinin icinde kendi hesapla metodu olmali
    //buna soyutlama deniyor

    public final void gameOver(){ //final override i engeller !!
        System.out.println("Oyun bitti.");
    }
}
