public class App {
    public static void main(String[] args) {
        int ladoA, ladoB, ladoC;

        ladoA = 5;
        ladoB = 5;
        ladoC = 5;

        if(ladoA < ladoB+ladoC && ladoB < ladoA+ladoC && ladoC < ladoA+ladoB){
            System.out.print("Triangulo ");
            if(ladoA == ladoB && ladoB == ladoC){
                System.out.printf("Equilatero \n");
            }

            else if(ladoA != ladoB && ladoB != ladoC && ladoA != ladoC){
                System.out.printf("Escaleno \n");
            }
            else{
                System.out.printf("Isóceles \n");
            }
        }
        else{
            System.out.println("Não forma um triangulo.");
        }

    }
}