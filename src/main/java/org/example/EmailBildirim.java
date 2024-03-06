package org.example;

public class EmailBildirim implements Raporlama{ //Bagımlılıkların tersine çevrilmesi prensibi
    @Override
    public void raporOlustur() {
        System.out.println("Email başarı ile gönderildi");
    }
}
