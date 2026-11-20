import java.util.Arrays;
public class Kata {
    public static int[] countBy(int x, int n) {
        int[] resultado = new int[n]; 
        for ( int i = 0; i < n; i++) {
            resultado[i] = x * (i + 1);
        }
        return resultado;
    }
    public static void main (String[] args){
        System.out.println(Arrays.toString(countBy(2,5)));
        System.out.println(Arrays.toString(countBy(1,10)));
        }
}