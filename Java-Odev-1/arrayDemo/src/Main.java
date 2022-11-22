public class Main {
    public static void main(String[] args) {


        String[][] sehirler = new String[2][2];

        sehirler[0][0] = "istanbul";
        sehirler[0][1] = "bursa";

        sehirler[1][0] = "bilecik";
        sehirler[1][1] = "ankara";

        for (int i = 0; i < 2 ;i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(sehirler[i][j]);
            }
        }




    }
}