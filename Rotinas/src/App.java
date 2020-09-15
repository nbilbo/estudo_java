
public class App {

    static void soma(int a, int b){
        System.out.printf("A soma é %d \n", a+b);
    }

    static int maior(int a, int b){
        if(a >= b) return a;
        return b;  
    }
    
    public static void main(String args[]) {
        soma(1, 5);
        System.out.printf("Maior numero: %d \n", maior(99, 199));
        System.out.println(Operacoes.contador(0, 10));
    }
}
