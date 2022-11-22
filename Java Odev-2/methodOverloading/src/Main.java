public class Main {
    public static void main(String[] args) {

        DortIslem dortIslem = new DortIslem();

        int ikiRakamliToplama = dortIslem.topla(1,1);
        System.out.println(ikiRakamliToplama);

        int ucRakamliToplama = dortIslem.topla(1,1,1);
        System.out.println(ucRakamliToplama);

    }
}