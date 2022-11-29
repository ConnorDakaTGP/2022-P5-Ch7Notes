import java.util.Scanner;
public class VoidReturn {
   public static void main(String[] args){
      int total = addNums();

      System.out.println("Your total was: "+total);
   }
   public static int addNums(){

      /*
   Static: Non-object class, does the same thing no matter what (It is static)
   Void: Does not send information to store
    */

      System.out.println("We are going to add two numbers");
      System.out.println("Please add them below");

      Scanner scan = new Scanner(System.in);
      int num1 = scan.nextInt();
      int num2 = scan.nextInt();

      return (num1+num2);
   }
}
