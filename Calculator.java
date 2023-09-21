// This program is made using the if-else/else-if statement
import java.util.*;
public class practice {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
System.out.println("Enter a number ");
int num1 = sc.nextInt();
int num2 = sc.nextInt();
int result = 0;
char symbol = sc.next().charAt(0);
if(symbol=='+') {
    result = num1+num2;
} else if(symbol=='-') {
    result = num1-num2;
} else if(symbol=='*') {
    result = num1*num2;
}else if(symbol=='/') {
    result = num1/num2;
}
System.out.println(result);
    }
}
