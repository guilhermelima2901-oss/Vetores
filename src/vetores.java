import java.sql.SQLOutput;
import java.util.Scanner;

public class vetores {
    static void main(String[] args) {
        System.out.println("Digite o tamanho do vetor: ");
        Scanner scanner = new Scanner(System.in);

        int tamanhoDoVetor = scanner.nextInt();
        int vetorDoUsuario[] = new int[tamanhoDoVetor];



        for(int i=0; i < tamanhoDoVetor; i++){

            System.out.println("Digite o valor da posição "+ i +" do seu vetor: ");
            vetorDoUsuario[i] = scanner.nextInt();
        }

        //exibir os valores

        System.out.println("Digite um valor que multiplicará cada posição do vetor: ");
        int valorAMultiplicar = scanner.nextInt();

            System.out.println("Veja os valores do vetor criado por você multiplicados pelo número que você escolher: ");
            for(int i = 0; i < vetorDoUsuario.length; i++){
                vetorDoUsuario[i] = vetorDoUsuario[i] * valorAMultiplicar;
            }

        exibeVetor(vetorDoUsuario);
        scanner.close();
    }
    private static void exibeVetor(int[] vetorDoUsuario) {
        for (int i = 0; i < vetorDoUsuario.length; i++) {
            System.out.println(vetorDoUsuario[i]);
        }
    }
}

