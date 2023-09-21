// In this program I have not used the else statement 
import java.util.*;
public class practice {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
System.out.println("Enter a character ");
char x = sc.nextLine().charAt(0);
if(x=='a'|| x=='e' || x=='i' || x=='o'||x=='u') {
System.out.println("Vowel");
} if(x!='a' && x!='e' && x!='i' && x!='o'&& x!='u') {
    System.out.println("Consonant");
}
}
    }
