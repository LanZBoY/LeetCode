package Program;

import java.util.HashMap;

public class Final_Value_of_Variable_After_Performing_Operations {

    public static void main(String[] args){
        System.out.println(finalValueAfterOperations(new String[]{"++x", "x++"}));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("++x",1);
        hashMap.put("x++",1);
        hashMap.put("--x",-1);
        hashMap.put("x--",-1);
        for(String operation : operations){
            x += hashMap.get(operation);
        }
        return x;
    }
}
