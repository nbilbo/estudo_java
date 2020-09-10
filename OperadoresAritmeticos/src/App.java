

public class App {
    public static void main(String[] args){
        int n1 = 3;
        int n2 = 5;
        float media = (float)(n1+n2) / 2;
        float raizQ = (float) Math.sqrt(12);
        int absoluto = Math.abs( (int)Math.round(10.5) );
        double aleatorio = 5 + Math.random() * (10-5);
        System.out.printf("A média de %d e %d é %.3f \n", n1, n2, media);       
    }
}