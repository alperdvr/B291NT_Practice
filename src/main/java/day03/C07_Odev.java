package day03;

public class C07_Odev {
    public static void main(String[] args) {
        /*
         *
         * *
         *****
         *     *
         *       *
         */
        int satir = 7;

        for (int bulSatir = 1; bulSatir <= satir; bulSatir++) {
            for (int yildiz = 1; yildiz <= 8; yildiz++) {
                if (yildiz == 1 || bulSatir == 1 || bulSatir == satir || bulSatir == satir / 2 + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}