public class OgrenciKrediManager extends BaseKrediManager {
    public double hesapla(double tutar){
        return tutar * 1.10;
        //overriding islemi soz konusu
        //base deki de hesapla fonk ancak
        //bu class icin farkli bir hesapla gecerli olacaktir
    }
}
