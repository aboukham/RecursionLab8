package lab8.RecursionLab8;

public class RecursionMethods{
    public static String fromDecimalToBinary(int decimal){
        if (decimal == 0)
            return "";
        return fromDecimalToBinary(decimal / 2) + (decimal % 2);
    }

    public static int countVowels(String str){
        String  vowels = "aeiouAEIOU";
        if (str.length() == 0)
            return 0;
        int count = (vowels.contains("" + str.charAt(0))) ? 1 : 0;
        return count + countVowels(str.substring(1));
    }

    public static boolean containsCharacter(String str, char c){
        if (str.isEmpty())
            return false;
        if (str.charAt(0) == c)
            return true;
        return containsCharacter(str.substring(1), c);
    }

    public static void main(String[] args){
        System.out.println(fromDecimalToBinary(40));
        System.out.println(countVowels("abdelaziz ABOUKHAME"));
        System.out.println(containsCharacter("abdelaziz", 'A'));
    }
}
