// This program calculates the sum of even numbers from 1 to n using for loop
import java.util.*;
public class Practice {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int num = sc.nextInt();
    int sum=0;
    for(int i=2;i<=num;i++) {
      if(i%2==0) {
        System.out.printl(i);
        sum += i;
      }
    }
    System.out.println("Sum is "+sum);
  }
}
        
