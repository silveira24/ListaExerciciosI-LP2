import java.util.Scanner;
public class Ex3 {
    public static void rodar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com um inteiro não nulo: ");
        int x = scanner.nextInt();

        if (x < 0) {
            x = -x;
        }

        int cont = 0;

        while (x != 0) {
            x /= 10;
            cont++;
        }

        int n = cont - 1;

        System.out.println(n);
    }

}
