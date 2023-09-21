public class Array {
    public static void Ordenar(int vetor[], int tam) {

        for (int i = 0; i < tam; i++) {
            int menor = vetor[i];
            int indiceMenor = i;
            for(int j = i; j < tam; j++) {
                if (vetor[j] < menor) {
                    menor = vetor[j];
                    indiceMenor = j;
                }
            }

            int aux = vetor[i];
            vetor[i] = menor;
            vetor[indiceMenor] = aux;
        }
    }
}
