package org.example;

public class Musteri {
    // tek sorumluluk prensibi
    private String ad;
    private String soyad;

    public Musteri(String ad,String soyad){
        this.ad = ad;
        this.soyad = soyad;
    }
        public String getAd(){
        return ad;
        }
        public String getSoyad(){
        return soyad;
        }
}
