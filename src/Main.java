import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int km;
    double perKm = 2.20, total, startPrice = 10;

    Scanner input = new Scanner(System.in);
    System.out.println("Mesafeyi KM cinsinden girin: ");
    km = input.nextInt();

    total = (km * perKm);
    total += startPrice;    // total = total + startPrice is same thing.

    total = (total < 20) ? 20 : total;  // total 20den küçükse 20, değilse totali yazdır komutu.
    System.out.println("Toplam Tutar: " + total);

    }
}