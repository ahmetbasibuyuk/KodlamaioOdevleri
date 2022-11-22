public class Main {
    public static void main(String[] args) {


        String[] ogrenciler = new String[4];
        ogrenciler[0] = "ahmet";
        ogrenciler[1] = "mehmet";
        ogrenciler[2] = "ali";
        ogrenciler[3] = "veli";

        System.out.println("for döngüsü: uzun yol");
        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        System.out.println("\nfor döngüsü: kısa yol");
        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }




    }
}