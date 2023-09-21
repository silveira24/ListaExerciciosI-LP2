import java.util.Scanner;
public class Ex7 {
    public static void rodar() {
        Scanner scanner = new Scanner(System.in);

        String frase = scanner.nextLine();
        int n = scanner.nextInt();
        char criptografia[] = frase.toCharArray();

        for (int i = 0; i < criptografia.length; i++) {
            char caracter = criptografia[i];
            char novoCaracter;

            if (caracter == ' '){
                novoCaracter = ' ';
            } else {
                novoCaracter = (char) ((((((int) caracter) + n) - 97) % 26) + 97);
            }

            criptografia[i] = novoCaracter;
        }

        String novaFrase = new String(criptografia);

        System.out.println(novaFrase);
    }
}
