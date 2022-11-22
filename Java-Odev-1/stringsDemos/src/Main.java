public class Main {
    public static void main(String[] args) {

        String mesaj = "bu derste stringlerlE çalışıyorum";

        System.out.println("Mesaj: " + mesaj);
//
//        System.out.println("Mesajın eleman sayısı: " + mesaj.length());
//
//        System.out.println("Measjın 1.harfi: " + mesaj.charAt(0));
//        System.out.println("Mesajın 2.harfi: " + mesaj.charAt(1));
//        System.out.println("Mesajın 1. ve 2. harfini charAt metoduyla bulup,String birleştirme işlemi: " + mesaj.charAt(0) + mesaj.charAt(1));
//        System.out.println("Sonuna nokta koymayı unutmuşum. Mesajımın sonunu nokta ile birleştirdim: " + mesaj.concat("."));
//
//        if (mesaj.startsWith("b") && mesaj.endsWith("m")) {
//            System.out.println("Doğru! Mesajım b harfi ile başlıyor VE m harfi ile bitiyor");
//        } else {
//            System.out.println("Hayır! Bir yanlışlık var");
//        }
//
//        char[] karakterAktarimi = new char[10];
//        mesaj.getChars(0, 10, karakterAktarimi, 0);
//        System.out.println(karakterAktarimi);
//
//
//        System.out.println("Mesajımdaki b harfi baştan itibaren kaçıncı index'e denk geliyor: " + mesaj.indexOf('b'));
//        System.out.println("Mesajımdaki u harfi baştan itibaren kaçıncı index'e denk geliyor: " + mesaj.indexOf('u'));
//        System.out.println("Mesajımdaki derste kelimesi baştan itibaren kaçıncı index'ten başlıyor : " + mesaj.indexOf("derste"));
//        System.out.println("Mesajımdaki m harfi sondan itibaren kaçıncı index'e denk geliyor : " + mesaj.lastIndexOf('m'));


        System.out.println("Kelimeye küçük harfle başlanmış değiştirelim: " + mesaj.replace("bu", "Bu"));
        System.out.println("Bu kelimesini istemiyorum: " + mesaj.substring(2));
        System.out.println("Sadece derste kelimesini istiyorum: " + mesaj.substring(2, 9));

        System.out.println("Aradaki boşluklardan itibaren tek tek yazdırma ->");
        for (String tekTekKelime : mesaj.split(" ")) {
            System.out.println(tekTekKelime);
        }


        System.out.println("Hepsi küçük harf olsun : " + mesaj.toLowerCase());
        System.out.println("Hepsi büyük harf olsun: " + mesaj.toUpperCase());
        System.out.println("Başında ve sonunda boşluk varsa :" + mesaj.trim());

    }
}