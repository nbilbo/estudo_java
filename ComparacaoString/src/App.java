public class App {
    public static void main(String[] args) {
        String nome1 = "Sonic";
        String nome2 = "Sonic";
        String nome3 = new String("Sonic");
        String res;

        res = (nome1==nome2) ? "igual":"diferente";
        System.out.printf("nome1 == nome2 ? %s \n", res);

        res = (nome1==nome3) ? "igual":"diferente";
        System.out.printf("nome1 == nome3 ? %s \n", res);

        res = (nome1.equals(nome3)) ? "igual":"diferente";
        System.out.printf("nome1.equals(nome3) ? %s \n", res);

    }
}