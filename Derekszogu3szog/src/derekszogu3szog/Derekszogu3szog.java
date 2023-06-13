
package derekszogu3szog;
import java.util.Scanner;

public class Derekszogu3szog {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("'A' befogó: ");
      double befogo_a = scanner.nextDouble();
      System.out.print("'B' befogó: ");
      double befogo_b = scanner.nextDouble();
      
      double atfogo = Math.sqrt(Math.pow(befogo_a, 2) + Math.pow(befogo_b, 2));
      
      double atfogo_kerekitett = Math.round(atfogo * 100) / 100;
      
      System.out.println("Az átfogó hossza: "+ atfogo_kerekitett);
    }  
}
