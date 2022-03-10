import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        String s = scanner.next();
        for (Character c : s.toCharArray()){

        }
    }
}
