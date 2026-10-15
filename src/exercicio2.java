import java.util.Scanner;

public class exercicio2 {
    static void main() {

        System.out.println("Digite o tamanho do vetor: ");
        Scanner scanner = new Scanner(System.in);

        int tamanhoDoVetor = scanner.nextInt();
        int vetorDoUsuario[] = new int[tamanhoDoVetor];

        for (int i = 0; i < tamanhoDoVetor; i++) {

            System.out.println("Digite o valor da posição " + i + " do vetor: ");
            vetorDoUsuario[i] = scanner.nextInt();
        }
        scanner.close();
        for (int i = 0; i < vetorDoUsuario.length; i++) {
            if (vetorDoUsuario[i] % 2 != 0) {
                vetorDoUsuario[i] = (int) Math.pow(vetorDoUsuario[i], 2);
                System.out.println(vetorDoUsuario[i]);
            }
            if (vetorDoUsuario[i] % 2 == 0) {
                vetorDoUsuario[i] = vetorDoUsuario[i] * 2;
                System.out.println(vetorDoUsuario[i]);
            }
        }
    }
}