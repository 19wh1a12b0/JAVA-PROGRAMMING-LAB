import java.util.Scanner;
public class CharToString {
   public static void main(String args[]){
      System.out.println("Enter a character ::");
      Scanner sc = new Scanner(System.in);
      char ch = sc.next().charAt(0);
      String str = Character.toString(ch);
      System.out.println(str);
   }
}