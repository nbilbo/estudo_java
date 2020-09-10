import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float valor;
        int resto;
        float cubo;
        float raizQuad;
        float raizCubi;
        int absoluto;
        
        System.out.println("\n--Super Calculadora--");
        System.out.print("Informe um valor: ");
        valor = scanner.nextFloat();
        resto = (int) valor % 2;
        cubo = (float) Math.pow(valor, 3);
        raizQuad = (float) Math.sqrt(valor);
        raizCubi = (float) Math.cbrt(valor);
        absoluto = Math.abs( (int)valor );

        System.out.printf("Resto da Divisão por 2: %d \n", resto);
        System.out.printf("Elevado ao Cubo: %.3f \n", cubo);
        System.out.printf("Raiz Quadradada: %.3f \n", raizQuad);
        System.out.printf("Raiz Cubica %.3f \n", raizCubi);
        System.out.printf("Valor Absoluto: %d \n", absoluto);

        scanner.close();
    }
}