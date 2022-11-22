public class Main {

    public static void main(String[] args) {

        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 5;

        for (int sayi:sayilar){
            if (sayi == aranacak){
//                System.out.println(sayi);
                System.out.println(aranacak + " sayısı aranıyor: "+sayi + " uyuşuyor!");
            }
            else {
                System.out.println(aranacak + " sayısı aranıyor: "+sayi + " uyuşmuyor!");
            }
        }

    }
}