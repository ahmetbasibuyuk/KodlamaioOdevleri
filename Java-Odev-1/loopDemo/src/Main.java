public class Main {
    public static void main(String[] args) {


        // for

        // 1'den 10 sayısına kadar bir artırarak yazıdırır.
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("ilk for döngüsü bitti");


        // 1'den 10 sayısına kadar 2 artırarak yazıdırır.
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("ikinci for döngüsü bitti");


        // 2'den 10 sayısına kadar 2 artırarak yazıdırır.
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("üçüncü for döngüsü bitti");


        // while

        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("while döngüsü bitti");


        // do-while

        int j = 1;
        do {
            System.out.println(j);
            j+=2;
        } while (j < 10);
        System.out.println("do-while döngüsü bitti");




    }
}