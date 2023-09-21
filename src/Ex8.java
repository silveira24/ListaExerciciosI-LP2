public class Ex8 {
    public static boolean confereLinha(int matriz[][], int l, int tam) {
        int linha[] = new int[tam];
        for (int i = 0; i < tam; i++) {
            int valor = matriz[l][i];

            if (valor > tam) {
                return false;
            }

            linha[valor - 1] += 1;
        }
        for (int i = 0; i < tam; i++) {
            if (linha[i] != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean confereColuna(int matriz[][], int c, int tam) {
        int coluna[] = new int[tam];
        for (int i = 0; i < tam; i++) {
            int valor = matriz[i][c];

            if (valor > tam) {
                return false;
            }

            coluna[valor - 1] += 1;
        }
        for (int i = 0; i < tam; i++) {
            if (coluna[i] != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean confereMatriz(int matriz[][], int tam) {
        for (int i = 0; i < tam; i++) {
            if(!confereLinha(matriz, i, tam) || !confereColuna(matriz, i, tam)) {
                return false;
            }
        }
        return true;
    }

    public static void rodar() {
        // criação manual da matriz do exemplo da lista
        int matriz[][] = new int[4][4];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[0][3] = 4;
        matriz[1][0] = 2;
        matriz[1][1] = 3;
        matriz[1][2] = 4;
        matriz[1][3] = 1;
        matriz[2][0] = 4;
        matriz[2][1] = 1;
        matriz[2][2] = 2;
        matriz[2][3] = 3;
        matriz[3][0] = 3;
        matriz[3][1] = 4;
        matriz[3][2] = 1;
        matriz[3][3] = 2;

        if(confereMatriz(matriz, 4)){
            System.out.println("A matriz é um quadrado latino!");
        } else {
            System.out.println("A matriz não é um quadrado latino!");
        }
    }
}
