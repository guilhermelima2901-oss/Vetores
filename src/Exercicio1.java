import java.util.Scanner;

public class Exercicio1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int tamanhoDoVetor = scanner.nextInt();

        int vetorDoUsuario[] = new int[tamanhoDoVetor];

        for (int i = 0; i < tamanhoDoVetor; i++) {
            System.out.println("Digite a posição " + i + " do vetor ");
            vetorDoUsuario[i] = scanner.nextInt();
        }
        System.out.println("\nAgora veja os valores que você digitou em ordem crescente\n");
        for(int i = 0; i < vetorDoUsuario.length; i++){
            for(int j = i; j< vetorDoUsuario.length; j++){

                if(vetorDoUsuario[j] < vetorDoUsuario[i]){
                    int aux = vetorDoUsuario[i];
                    vetorDoUsuario[i] = vetorDoUsuario[j];
                    vetorDoUsuario[j] = aux;
                }

            }
        }
        exibeVetor(vetorDoUsuario);
        scanner.nextLine();

        System.out.println("Digite seu nome: ");
        String texto = scanner.nextLine();

        int contador = 0;

        for(int i = 0; i < texto.length(); i++ ){

            char letra = texto.charAt(i);

            if(letra == 'a' || letra == 'e' || letra == 'i' ||
               letra == 'o' || letra == 'u'){


                contador++;
            }
        }

        System.out.println("Quantidade de vogais: "+ contador);
        scanner.close();

    }
    private static void exibeVetor(int[] vetorDoUsuario) {
        for (int i = 0; i < vetorDoUsuario.length; i++) {
            System.out.println(vetorDoUsuario[i]);
        }
    }
}
