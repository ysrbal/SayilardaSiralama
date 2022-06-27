import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayiyi Giriniz : ");
        n1 = input.nextInt();
        System.out.print("2. Sayiyi Giriniz : ");
        n2 = input.nextInt();
        System.out.print("3. Sayiyi Giriniz : ");
        n3 = input.nextInt();

        if (n1 > n2 && n1 > n3) {
            if (n2 > n3) {
                System.out.println("n1 > n2 > n3");
            } else {
                System.out.println("n1 > n3 > n2");
            }
        } else if (n2 > n1 && n2 > n3) {
            if (n1 > n3) {
                System.out.println("n2 > n1 > n3");
            } else {
                System.out.println("n2 > n3 > n1");
            }
        } else {
            if (n1 > n2) {
                System.out.println("n3 > n1 > n2");
            } else {
                System.out.println("n3 > n2 > n1");

            }
        }
    }

}
