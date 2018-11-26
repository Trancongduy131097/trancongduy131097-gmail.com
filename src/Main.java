import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        bai1();
        bai2();
        bai3();
    }

    public static void bai1() {
        int n = 2;
        int d = 0;
        do {
            if (soNguyenTo(n)) {
                System.out.print("  " + n);
                d++;
            }
            n++;
        } while (d < 20);
    }

    public static boolean soNguyenTo(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void bai2() {
        int nam, theKi;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nnhap nam can tinh the ki ");
        nam = sc.nextInt();
        theKi = (nam / 100) + 1;
        System.out.println("Nam do thuoc the ki thu: " + theKi);
    }

    public static void bai3() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap n : ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}

