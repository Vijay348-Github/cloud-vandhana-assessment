import java.util.HashMap;

public class Problem2 {
    public static void main(String[] args) {
        System.out.println(romanToInteger("IX"));
        System.out.println(romanToInteger("XX"));
    }

    public static int romanToInteger(String roman){
        HashMap<Character,Integer> romanValues = new HashMap<>();
        romanValues.put('I',1);
        romanValues.put('V',5);
        romanValues.put('X',10);
        romanValues.put('L',50);
        romanValues.put('C',100);
        romanValues.put('M',500);
        romanValues.put('D',1000);


        int result = 0;
        int previousValue = 0;

        for (int i = roman.length()-1; i >= 0 ; i--) {
            int currentValue = romanValues.get(roman.charAt(i));

            if (currentValue < previousValue){
                result -= currentValue;
            }else {
                result += currentValue;
            }

            previousValue = currentValue;
        }
        return result;
    }
}
