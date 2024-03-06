package org.example;

public class BonusKrediKarti extends KrediKarti {// liskov prensibi
    @Override
    public void odemeYap(double tutar){
        System.out.println("odeme başarı ile yapıldı"+ tutar);
    }
}
