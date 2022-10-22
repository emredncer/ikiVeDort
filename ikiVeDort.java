import java.util.Scanner;

public class ikiVeDort {
    public static void main(String[] args) {
        int num, total = 0;
        Scanner reader = new Scanner(System.in);
        do {
            System.out.print("Bir sayı giriniz: ");
            num = reader.nextInt();
            if ((num % 2 == 0) && (num % 4 == 0)) {
                total += num;
            }
        } while (num % 2 == 0);
        System.out.print(total);
    }
}
