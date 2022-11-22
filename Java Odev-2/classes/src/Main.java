public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager1 = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager1 = customerManager2;
        customerManager1.Ekle();
        customerManager1.Sil();
        customerManager1.Guncelle();

//değer
        int sayi = 10;
        int sayi2 = 20;
        sayi2 = sayi;
        sayi = 30;
        System.out.println(sayi2);

//referans
        int[] sayilar1 = new int[]{1,2,3};
        int[] sayilar2 = new int[]{4,5,6};
        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);

    }
}