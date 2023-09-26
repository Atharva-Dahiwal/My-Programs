// This program is created using for loop this is user defined program that will print prime numbers
import java.util.*;
public class Practice {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    for(int i = 2;i<=num;i++) {
      int divisor;
      for(divisor=2;divisor<i;divisor++) {
        if(i%divisor==0) {
          break;
        }
      }
      if(i==divisor) {
        System.out.println(i +" ");
       }
          }
       }
    }
