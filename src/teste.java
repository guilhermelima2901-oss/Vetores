import java.util.Scanner;

public class teste {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        String palavra = scanner.nextLine();

        char[] letras = palavra.toCharArray();
        char[] invertida = new char[letras.length];

        for (int i = 0; i < letras.length; i++) {
            invertida[i] = letras[letras.length - 1 - i];
        }

        System.out.println("Palavra invertida: " + new String(invertida));

        scanner.close();


    }
}
