import java.util.Scanner;

public class VKI {
    public static void main(String[] args) {
        double boy;
        double kilo;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = input.nextDouble();

        double vke = kilo / (boy * boy);

        System.out.print("Vücüt Kitle İndeksiniz : " + vke);

    }
}
