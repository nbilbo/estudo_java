public class Operacoes {
    
    public static String contador(int begin, int end) {
        String s = "";

        for(int count=begin; count<=end; count++){
            s += count + " ";
        }

        return s;
    }
}
