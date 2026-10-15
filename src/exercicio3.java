import java.util.Scanner;

public class exercicio3 {
    static void main() {

        System.out.println("Digite o tamanho do vetor:" );
        Scanner scanner = new Scanner(System.in);
        String palavra = scanner.nextLine();

        char[] letras = palavra.toCharArray();
        char[] invertida = new char[letras.length];


        for(int i = 0; i < letras.length; i++){
            invertida[i] = letras[letras.length-1-i];
        }

        System.out.println("Palavra invertida: "+ new String(invertida));

        scanner.close();


    }
}
