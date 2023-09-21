import java.util.Scanner;

class Ex4 {
    public static void rodar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o número inteiro: ");

        int n = scanner.nextInt();

        double e = 1;
        for (int i = 1; i <= n; i++) {
            e += (double) 1 / Fatorial.fat(i);
        }

        System.out.println(e);
    }
}