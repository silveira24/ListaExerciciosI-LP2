import java.util.Scanner;
public class Ex6 {
    public static void rodar() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int sequenciaN[] = new int[n];
        int sequenciaM[] = new int[m];
        int sequenciaFInal[] = new int[n + m];
        int contN = 0;
        int contM = 0;
        int contFinal = 0;

        for (int i = 0; i < n; i ++) {
            sequenciaN[i] = scanner.nextInt();
        }

        for (int i = 0; i < m; i ++) {
            sequenciaM[i] = scanner.nextInt();
        }

        while (contM < m && contN < n) {
            if (sequenciaN[contN] < sequenciaM[contM]) {
                sequenciaFInal[contFinal] = sequenciaN[contN];
                contN++;
            }
            else {
                sequenciaFInal[contFinal] = sequenciaM[contM];
                contM++;
            }
            contFinal++;
        }

        while (contM < m || contN < n) {
            if (contN < n) {
                sequenciaFInal[contFinal] = sequenciaN[contN];
                contN++;
            } else {
                sequenciaFInal[contFinal] = sequenciaM[contM];
                contM++;
            }
            contFinal++;
        }

        for (int i = 0; i < n + m; i++) {
            System.out.print(sequenciaFInal[i] + " ");
        }
    }
}
