// This program is made using only if statement 
import java.util.*;
public class practice {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
System.out.println("Enter the marks");
int marks  = sc.nextInt();
if(marks>=0 && marks<=19) {
    System.out.println("F Grade");
} if(marks>=20 && marks<=39) {
    System.out.println("D Grade");
} if(marks>=40 && marks<=59) {
    System.out.println("C Grade");
} if(marks>=60 && marks<=80) {
    System.out.println("B Grade");
} if(marks>=81) {
    System.out.println("A Grade");
}
    }
}
