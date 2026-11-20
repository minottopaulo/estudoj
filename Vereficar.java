import java.util.Scanner;

/*public class Logica {
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    int n = 1; 
    while (n != 0){
        System.out.println("Digite 0 para sair do do menu: ");
        n = teclado.nextInt();
        System.out.println("Você digitou " + n); 
    }
    System.out.println("fim do programa!");
    }
}*/

/*public class Tabuada {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número ");
        int numero = teclado.nextInt(); 

        for (int i = 0; i <= 10; i++ ) {
            System.out.println(numero + " x " + i + "=" + numero * i); 
        }
    }
}*/

public class Vereficar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Precisamos da sua idade ?"); 
        int idade = teclado.nextInt(); 
        if (idade <= 11) {
            System.out.println("crinca somente com ao companhamento dos pais! "); 
        }else if(idade <= 17){
            System.out.println("Entrada somente com documento de autorzacao! "); 
        }else if(idade >= 18){
            System.out.println("Pode prosseguir! ");
        }
    }
}