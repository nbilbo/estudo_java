import java.util.Calendar;

public class App {
    public static void main(String[] args) {
        // Constants
        final int NAOVOTA = 1;
        final int OBRIGATORIO = 2;
        final int OPCIONAL = 3;
        
        Calendar calendario =  Calendar.getInstance();
        int anoAtual = calendario.get(Calendar.YEAR);
        int anoNascimento = 2003;
        int situacao;
        

        System.out.printf("Idade: %d \n", anoAtual-anoNascimento);

        if(anoAtual-anoNascimento < 16){
            situacao = 1;
        }
        else if(anoAtual-anoNascimento >= 18 && anoAtual-anoNascimento < 70){
            situacao = 2;
        }
        else{
            situacao = 3;
        }

        switch(situacao){
            case NAOVOTA:
                System.out.println("Não vota");
                break;
            
            case OBRIGATORIO:
                System.out.println("Obrigatório");
                break;
            
            case OPCIONAL:
                System.out.println("Opcional");
                break;

        }

        
    }
}
