  public class Kata {
      public static String evenOrOdd(int number) {
        if (number % 2 != 0){
          return "Even";
        }else{
          return "Odd"; 
        }
      }
      public static void main(String[] args) {
          System.out.println(evenOrOdd(10));
          System.out.println(evenOrOdd(7));
          System.out.println(evenOrOdd(0));
          System.out.println(evenOrOdd(-3));
      }
  }