public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();

        int toplamaIslemi = dortIslem.Topla(1, 1);
        System.out.println("1 + 1 = " + toplamaIslemi);

        int cikarmaIslemi = dortIslem.Cikar(1, 1);
        System.out.println("1 - 1 = " + cikarmaIslemi);

        int carpmaIslemi = dortIslem.Carp(1, 1);
        System.out.println("1 * 1 = " + carpmaIslemi);

        int bolmeIslemi = dortIslem.Bol(1, 1);
        System.out.println("1 / 1 = " + bolmeIslemi);
    }
}