import java.util.Scanner;

public class App{
    
    public static boolean ehBissexto(int ano){
        return ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0);
    }

    public static int diasNoMes(int ano, int mes){
        switch(mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            
            case 2:
                if(ehBissexto(ano)) return 29;
                return 28;
            
            default:
                return -1;
        }
    }
    public static void main(String[] args){
        int ano, mes, dias;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o ano");
        ano = input.nextInt();
        System.out.println("Digite o mês");
        mes = input.nextInt();

        dias = diasNoMes(ano, mes);
        System.out.printf("Dias no mês: %d \n", dias);
        input.close();

    }
}