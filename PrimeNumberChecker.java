// This program checks whether a number is prime number or not
import java.util.*;
public class Practice {
  public sttaic void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int num = sc.nextInt();
    int divisor;
    for(divisor=2;divisor<num;divisor++) {
      if(num%divisor==0) {
        break;
      }
    }
    if(num==divisor) {
      System.out.println("Prime Number");
    } else {
      System.out.println("Non Prime");
    }
  }
}
