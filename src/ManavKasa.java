import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        Scanner g = new Scanner(System.in);

        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;
        double armutkg, elmakg, domateskg, muzkg, patlicankg;
        double armutfiyat, elmafiyat, domatesfiyat, muzfiyat, patlicanfiyat;

        System.out.println("Armut kaç kilo");
        armutkg = g.nextDouble();
        armutfiyat=armut * armutkg;

        System.out.println("Elma kaç kilo");
        elmakg = g.nextDouble();
        elmafiyat = elma * elmakg;

        System.out.println("Domates kaç kilo");
        domateskg = g.nextDouble();
        domatesfiyat=domates*domateskg;

        System.out.println("muz kaç kilo");
        muzkg=g.nextDouble();
        muzfiyat=muz*muzkg;

        System.out.println("patlican kaç kilo");
        patlicankg=g.nextDouble();
        patlicanfiyat=patlican*patlicankg;

        double total = armutfiyat+elmafiyat+muzfiyat+domatesfiyat+patlicanfiyat;

        System.out.println("Toplam tutar : " + total);
    }
}
