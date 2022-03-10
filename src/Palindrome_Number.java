import java.util.Scanner;

public class Palindrome_Number {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        Integer reverseNumber = 0;
        while(number != 0){
            reverseNumber *= 10;
            reverseNumber += number % 10;
            number /= 10;
        }
        System.out.println(reverseNumber);
    }
}
