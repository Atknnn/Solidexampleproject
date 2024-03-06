package org.example;

public class Main {
    public static void main(String[] args) {
        /**
         * SOLİD prensipleri
         * 1-Tek sorumluuluk prensibi(single responsibility)
         * bir sınıfın bir amacı bir görevi olmasıdır
         * ---------------------------------------------
         * 2- Açık-Kapalı prensibi(open/close prensible)
         * bir kodun geliştirilmeye açık ancak değişikliğe ise kapalı olması durumudur.
         * ----------------------------------------------
         * 3-Liskov Yerine koyma prensibidir  (Liskov Substitution Principle - LSP)
         * Alt sınıfların üst sınıfların yerine geçebilmesini sağlar
         * ----------------------------------------------
         * 4- Arayüz Ayırma Prensibi (Interface Segregation Principle - ISP)
         * bir sınıf ihtiyac duymadığı metotları içermemelidir
         * ----------------------------------------------
         * 5- Bagımlılık tersine çevirme prensibi (Dependency Inversion Principle - DIP)
         * üst seviye modüller alt seviye modüllere baımlı olmamalıdır her ikiside
         * syoutlama yani abstractiona bagımlı olmalıdır bu sayede ust seveyi modulun dusuge olan bagımlılıgı azalır
         */

        // Tek Sorumluluk Prensibi
        Musteri musteri = new Musteri("ATAKAN", "TAS");
        MusteriYonetimi musteriYonetimi = new MusteriYonetimi();
        musteriYonetimi.musteriEkle(musteri);

        // Açık/Kapalı Prensibi
        OdemeYontemi krediKarti = new KrediKarti();
        Sepet sepet = new Sepet(krediKarti);
        sepet.odemeYap(100.0);

        // Liskov Yerine Koyma Prensibi
        OdemeYontemi bonusKrediKarti = new BonusKrediKarti();
        sepet = new Sepet(bonusKrediKarti);
        sepet.odemeYap(150.0);

        // Arayüz Ayırma Prensibi
        Raporlama finansRaporu = new FinansRaporu();
        Raporlama satisRaporu = new SatisRaporu();
        finansRaporu.raporOlustur();
        satisRaporu.raporOlustur();

        // Bağımlılıkların Tersine Çevrimesi Prensibi
        Raporlama emailBildirim = new EmailBildirim();
        emailBildirim.raporOlustur();



    }
}