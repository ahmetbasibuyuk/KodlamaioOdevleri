public class Main {
    public static void main(String[] args) {

        char harf = 'a';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın Sesli Harf: " + harf);
                break;
            default:
                System.out.println("İnce Sesli Harf: " + harf); //küçük harf gelirse burası yanlış yazar
        }


        if (harf == 'A' || harf == 'a' || harf == 'I' || harf == 'ı' ||
                harf == 'O' || harf == 'o' || harf == 'U' || harf == 'u') {
            System.out.println("kalın sesli bir harftir");
        } else if (harf == 'E' || harf == 'e' || harf == 'İ' || harf == 'i' ||
                harf == 'Ö' || harf == 'ö' || harf == 'Ü' || harf == 'ü') {
            System.out.println("ince sesli bir harftir");
        }

    }
}