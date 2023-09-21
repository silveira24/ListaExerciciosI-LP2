import java.util.Scanner;
import java.text.DecimalFormat;

class Ex2 {
    public static void rodar() {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00");

        System.out.println("digite o número inteiro: ");

        int segundos = scanner.nextInt();

        int horas = segundos / 3600;
        segundos = segundos % 3600;
        int minutos = segundos / 60;
        segundos = segundos % 60;

        System.out.println(df.format(horas) + ":" + df.format(minutos) + ":" + df.format(segundos));

    }
}