import java.util.Locale;
import java.util.Scanner;

public class vetores2 {
    static void main(String[] args) {
        System.out.println("Digite o tamanho do vetor: ");
        Scanner scanner = new Scanner(System.in);

        int tamanhoDoVetor = scanner.nextInt();
        String[] vetorDoUsuario = new String[tamanhoDoVetor];


        scanner.nextLine();
        for(int i=0; i < tamanhoDoVetor; i++){

            System.out.println("Digite o valor da posição "+ i +" do seu vetor: ");
            vetorDoUsuario[i] = scanner.nextLine();
        }

        //exibir os valores

        System.out.println("\nDigite uma palavra para ser acrescida em cada posição do vetor: ");
        String PalavraASerAcrescida = scanner.nextLine();

        System.out.println("\nVeja os valores do vetor criado por você com a palavra que você escolheu para ser acrescida em cada posição: ");
        for(int i = 0; i < vetorDoUsuario.length; i++){
            if(i > 0) {
                /*String aux = vetorDoUsuario[i - 1];
                vetorDoUsuario[i - 1] = vetorDoUsuario[i];
                vetorDoUsuario[i] = aux;*/


                vetorDoUsuario[i] = vetorDoUsuario[i].concat(PalavraASerAcrescida).toUpperCase();
                char primeiraPosição = vetorDoUsuario[i].charAt(0);
                vetorDoUsuario[i] = vetorDoUsuario[i].concat(String.valueOf(primeiraPosição));
            }
        }

        exibeVetor(vetorDoUsuario);
        scanner.close();
    }
    private static void exibeVetor(String[] vetorDoUsuario) {
        for (int i = 0; i < vetorDoUsuario.length; i++) {
            System.out.println(vetorDoUsuario[i]);
        }
    }
}
