import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        //arrays
        int vetor_a[] = new int[4];
        float vetor_b[] = {1, 56, 2, 7, 1, 6};        
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30,  31};
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", 
                        "Set", "Out", "Nov", "Dez"};

        //fill
        Arrays.fill(vetor_a, 0);

        // sort
        Arrays.sort(vetor_b);

        // search
        int index = Arrays.binarySearch(vetor_b, 6);

        //for each
        for(int valor: tot){
            System.out.println(valor);
        }
    }
}
