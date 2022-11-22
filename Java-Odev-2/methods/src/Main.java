public class Main {
    public static void main(String[] args) {

        parametreliSayiToplama(1, 2); // bizden 2 tane rakam bekledi
        parametresizSayiToplama(); // bizden birşey istemedi neyse o


        String birlesikIsimSoyisim = parametreliIsimYazma("ahmet", "ali");
        System.out.println(birlesikIsimSoyisim);

        String isimSoyisim = parametresizIsimYazma();
        System.out.println(isimSoyisim);

        int tumSayilariTopla = secimliSayidaSayiToplama(1,2,3,4,5); // ister 1 tane ister 1000 tane. Boşta olabilir
        System.out.println(tumSayilariTopla);

    }

    //parametreli ve çağrıldığında sadece işlem yapar (return etmez -> geriye harici bir veri döndürmez).
    public static void parametreliSayiToplama(int sayi1, int sayi2) {
        int a = sayi1 + sayi2;
        System.out.println(a);
    }

    // parametresiz ve sabit işlem yapar (yine return yoktur).
    public static void parametresizSayiToplama() {
        int a = 1 + 2;
        System.out.println(a);

    }

    // parametreli ve geriye bir veri döndürür.
    public static String parametreliIsimYazma(String isim, String soyisim) {
        // parametre isteniyor sonunda ikisini birlesitiren bir islem yapıyor ve döndürüyor. Tabi bu döndürülen veri
        //          ister yazılır ister bununlada başka işlemler yapılır.
        return isim + " " + soyisim;
    }


    // parametresiz ve değer döndüren
    public static String parametresizIsimYazma() {
//        String adsoyad = "ali veli";
//        return adsoyad;

        return "ali veli";

        // bunun ikiside olur sonuçta algoritma nasılsa öyle şekillenir
    }


    public static int secimliSayidaSayiToplama(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;

        // bir dizide gönderilebilir ama ...(üç nokta) istenilen sayıda parametre gönderilmesini sağlar.
        // üstteki fonksiyonlarda -> int sayi1,int sayi2 yazıldı. En az 2 tane koyabilirsin.Üçüncüyü kabul etmez.Bu onun genişletilmiş halidir.
    }


}