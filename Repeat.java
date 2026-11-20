public class Repeat {

    public static String repeatStr(final int repetitions, final String string) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < repetitions; i++) {
            resultado.append(string);
        }

        return resultado.toString();
    }

    public static void main(String[] args) {
        System.out.println(repeatStr(6, "I"));
        System.out.println(repeatStr(5, "Hello"));
        System.out.println(repeatStr(0, "abc"));
    }
}