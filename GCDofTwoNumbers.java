// This program calculates the GCD of two numbers using for loop
import java.util.*;
public class practice {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter 1st number: ");
int num1 = sc.nextInt();
System.out.println("Enter 2nd number: ");
int num2 = sc.nextInt();
int gcd = 1;
    for(int i=1;i<=num1 && i<=num2; i++) {
      if(num1%i==0 && num2%i==0) {
        gcd = i;
      }
    }
    System.out.println(gcd);

