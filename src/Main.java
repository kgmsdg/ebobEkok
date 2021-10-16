import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz : ");
        int n1 = input.nextInt();

        System.out.print("n2 sayısını giriniz : ");
        int n2 = input.nextInt();

        int bNumber, sNumber, ebob = 1, ekok = 1, i, j;

        if (n1 < n2) {
            bNumber = n2;
            sNumber = n1;
        } else {
            bNumber = n1;
            sNumber = n2;
        }

        i = sNumber;
        while (i >= 1) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
                break;
            }
            i--;
        }
        System.out.println("Ebob : " + ebob);

        j = bNumber;
        while (j <= (n1 * n2)) {
            if (j % n1 == 0 && j % n2 == 0) {
                ekok = j;
                break;
            }
            j++;
        }
        System.out.println("Ekok : "ekok);
/*
        for (int i = sNumber; i >= 0; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
                System.out.println("Ebob : " + ebob);
                break;
            }
        }
        for (int j = 1; j <= (n1 * n2); j++) {
            if (j % n1 == 0 && j % n2 == 0) {
                System.out.println("Ekok : " + j);
                break;
            }
        }

 */
    }
}
