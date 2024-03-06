package org.example;

class Sepet {
    private OdemeYontemi odemeYontemi;

    public Sepet(OdemeYontemi odemeYontemi) {
        this.odemeYontemi = odemeYontemi;
    }

    public void odemeYap(double tutar) {
        odemeYontemi.odemeYap(tutar);
    }
}
