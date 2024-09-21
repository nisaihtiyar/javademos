public class BaseKrediManager {
    public double hesapla(double tutar){
        return tutar * 1.18;

        //final keyword u o metodun diger class larda baskin olmasina neden olur
        //yani override yapamazsin
        //public final double hesapla(double tutar)
    }
}
