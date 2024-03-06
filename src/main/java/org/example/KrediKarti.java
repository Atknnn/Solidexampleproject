package org.example;

public class KrediKarti implements OdemeYontemi{
    @Override
    public void odemeYap(double tutar) {
        System.out.println("Kredi kartı ile odeme yapıldı"+ tutar);
    }



}
