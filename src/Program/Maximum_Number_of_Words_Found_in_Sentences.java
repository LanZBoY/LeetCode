package Program;

import java.util.StringTokenizer;

public class Maximum_Number_of_Words_Found_in_Sentences {

    public static void main(String[] args){
        System.out.println(mostWordsFound(new String[]{"w jrpihe zsyqn l dxchifbxlasaehj","nmmfrwyl jscqyxk a xfibiooix xolyqfdspkliyejsnksfewbjom","xnleojowaxwpyogyrayfgyuzhgtdzrsyococuqexggigtberizdzlyrdsfvryiynhg","krpwiazoulcixkkeyogizvicdkbrsiiuhizhkxdpssynfzuigvcbovm","rgmz rgztiup wqnvbucfqcyjivvoeedyxvjsmtqwpqpxmzdupfyfeewxegrlbjtsjkusyektigr","o lgsbechr lqcgfiat pkqdutzrq iveyv iqzgvyddyoqqmqerbmkxlbtmdtkinlk","hrvh efqvjilibdqxjlpmanmogiossjyxepotezo","qstd zui nbbohtuk","qsdrerdzjvhxjqchvuewevyzlkyydpeeblpc"}));
    }


    public static int mostWordsFound(String[] sentences) {
        int maxsize = 0;
        for(String sentence: sentences){
            int wordNum = sentence.split(" ").length;
            if(maxsize < wordNum){
                maxsize = wordNum;
            }
        }
        return maxsize;
    }
}
