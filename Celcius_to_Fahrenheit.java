import java.util.Scanner;
class test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float temperature = sc.nextInt();
    System.out.println("Enter Temperature: "+temperature);
    float fahrenheit;
    fahrenheit = (temperature*9/5) + 32;
    System.out.println("Fahrenheit is: "+fahrenheit);
