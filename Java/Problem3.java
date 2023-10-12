import java.util.HashSet;
import java.util.Set;

public class Problem3 {
    public static void main(String[] args) {

        String str = "The quick brown fox jumps over the lazy dog";
        String str2 = "A panagram is a sentence";
        String answer = panagramCheck(str) ? str+" : is a Panagram" : str+" : is not a Panagram";
        System.out.println(answer);
        String answer2 = panagramCheck(str2) ? str2+" : is a Panagram" : str2+" : is not a Panagram";
        System.out.println(answer2);

    }
    public static boolean panagramCheck(String sentence){

        sentence.replaceAll(" ","").toLowerCase();

        Set<Character> alphabetSet = new HashSet<>();

        for (int i = 0;i<sentence.length();i++){
            if(sentence.charAt(i)>='a' && sentence.charAt(i)<='z'){
                alphabetSet.add(sentence.charAt(i));
            }
        }

       return alphabetSet.size() == 26;

    }
}
