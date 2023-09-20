// In this program I have not used else statement 
import java.util.*;
public class practice {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
System.out.println("Enter the age");
int age = sc.nextInt();
if(age>0 && age<=2) {
    System.out.println("Infant");
} if(age>=3 && age<=12) {
    System.out.println("Child");
} if(age>=13 && age<=19) {
    System.out.println("Teenager");
} if(age>=20 && age<=59) {
    System.out.println("Adult");
} if(age>=60) {
    System.out.println("Senior");
}
    }
}
