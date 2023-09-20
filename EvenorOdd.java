// This program is of even and odd it is created without using else statement 
import java.util.*;
public class practice {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int num = sc.nextInt();
    if(num%2==0) {
        System.out.println(num +" is Even");
    } if(num%2==1) {
        System.out.println(num+" is Odd");
    }
      
    }
}
