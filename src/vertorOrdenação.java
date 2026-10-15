public class vertorOrdenação {
    static void main() {
        int[] vetorInteiros = new int[]{5, 44, 3, 99, 101, 45};

        /*System.out.println("Vetor ordenado de modo crescente:\n");
        ordenaVetorCrescente(vetorInteiros);

        System.out.println("\nVetor ordenado de modo decrescente:\n");
        ordenaVetorDecrescente(vetorInteiros);*/

        String[] vetorString = new String[]{"computador", "tela", "brasil", "alucard","naruto", "iron maiden"};

        for (int i = 0; i < vetorString.length; i++){
            for (int j = i; j < vetorString.length; j++){

                if(vetorString[j].compareTo(vetorString[i]) > 0) {
                    String aux = vetorString[i];
                    vetorString[i] = vetorString[j];
                    vetorString[j] = aux;
                }

            }

        }
        exibeVetor(vetorString);

    }

    //bubble sort
    private static void ordenaVetorCrescente(int[] vetorInteiros){
        for (int i = 0; i < vetorInteiros.length; i++){
            for (int j = i; j < vetorInteiros.length; j++){

                if(vetorInteiros[j] < vetorInteiros[i]) {
                    int aux = vetorInteiros[i];
                    vetorInteiros[i] = vetorInteiros[j];
                    vetorInteiros[j] = aux;
                }

            }

        }
        exibeVetor(vetorInteiros);
    }

    //bubble sort
    private static void ordenaVetorDecrescente(int[] vetorInteiros) {
        for (int i = 0; i < vetorInteiros.length; i++) {
            for (int j = i; j < vetorInteiros.length; j++) {

                if (vetorInteiros[j] > vetorInteiros[i]) {
                    int aux = vetorInteiros[i];
                    vetorInteiros[i] = vetorInteiros[j];
                    vetorInteiros[j] = aux;
                }

            }

        }
        exibeVetor(vetorInteiros);
    }
    private static void exibeVetor(String[] vetor) {
        for (int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }
    private static void exibeVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }


}
