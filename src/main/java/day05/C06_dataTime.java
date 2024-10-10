package day05;

import java.time.LocalDate;
import java.time.LocalTime;

public class C06_dataTime {
    public static void main(String[] args) {

        /*
        LocalDate->tarih objesi olusturmayi saglar
        LocalDateTime-> hem tarih hem saat objesi olusturmayi saglar
        LocalTime->saat objesi olusturmayi saglar
        icerisinde tarih ve saat icin gerekli methodlar bulunur
        DateTimeFormattir-> tarih ve saat objelerini istedigimiz formatta yazdırmayi saglar
        java'da normal kosullarda tarih objesi yıl/ay/gün olarak yazdılır
        biz istersek bunu formattir classımız ile degistirebiliriz
        */

         /*
       soru 1)
       -bugunun tarihini obje olusturarak yazdirin
       -bugun yilin kacinci gunu oldugunu yazdirin
       -hangi gunde oldugumuzu yazdirin
       -yılın bitmesine kac gun kaldıgını yazdırın
       -bugunden itibaren 3yil 5 ay 7gun sonraki tarihi yazdirin
       -bugunden itibaren 2yil 2 ay 2 gun sonraki tarihin ayin kacinci gunu oldugunu yazdirin
       -bugunden itibaren 7yil 7 ay 7 gun sonraki tarihin haftanin hangi gunu oldugunu yazdirin
       -ikinci bir tarih objesi olusturun ve iki tarihi karsilastirin ve bize eski olan tarihi dondurun
        */


        LocalDate tarih = LocalDate.now();
        System.out.println("tarih");

    }
}
