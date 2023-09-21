import java.util.Scanner;
public class Ex1 {
    public static void rodar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o número inteiro: ");

        int n = scanner.nextInt();

        for (int i = 2; i <= n; i++) {
            boolean primo = true;
            for (int j = 2; j < (i / 2) + 1; j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println(i);
            }
        }
    }
}
