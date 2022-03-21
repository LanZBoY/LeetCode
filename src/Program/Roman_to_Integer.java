package Program;

import java.util.HashMap;

public class Roman_to_Integer {

    public static void main(String[] args){
        System.out.println(RomanToInteger("XIX"));
    }

    public static int RomanToInteger(String s){
        HashMap<Character, Integer> increaseMap = new HashMap<>();
        increaseMap.put('M',1000);
        increaseMap.put('D',500);
        increaseMap.put('C',100);
        increaseMap.put('L',50);
        increaseMap.put('X',10);
        increaseMap.put('V',5);
        increaseMap.put('I',1);
        HashMap<String, Integer> decreaseMap = new HashMap<>();
        decreaseMap.put("IV",-2);
        decreaseMap.put("IX",-2);
        decreaseMap.put("XC",-20);
        decreaseMap.put("XL",-20);
        decreaseMap.put("CD",-200);
        decreaseMap.put("CM",-200);
        int sum = 0;
        for(char c : s.toCharArray()){
            sum += increaseMap.get(c);
        }
        for(String key : decreaseMap.keySet()){
            if(s.indexOf(key) != -1){
                sum += decreaseMap.get(key);
            }
        }
        return sum;
    }
}
