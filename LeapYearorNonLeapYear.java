// In this program i have not used the else statement 
import java.util.*;
public class practice {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  System.out.println("Enter a year ");
  int year = sc.nextInt();
if(year%4==0) {
    System.out.println("Its a leap year");
} if(year%100!=0) {
    System.out.println("Its not a leap year");
}
    }
}
