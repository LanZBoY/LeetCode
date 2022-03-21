package Program;

public class NumJewelsInStones {

    public static void main(String[] args){
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }


    public static int numJewelsInStones(String jewels, String stones){
        int total = 0;

        for (char jewel : jewels.toCharArray()){
            for(char search: stones.toCharArray()){
                if(jewel == search){
                    total++;
                }
            }
        }

        return total;
    }
}
