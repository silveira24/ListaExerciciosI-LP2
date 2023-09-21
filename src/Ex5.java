import java.util.Scanner;

class Ex5 {
    public static void rodar() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int numeros[] = new int[n];

        for (int i = 0; i < n; i++){
            numeros[i] = scanner.nextInt();
        }

        Array.Ordenar(numeros, n);

        for (int i = 0; i < n; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }


    }
}