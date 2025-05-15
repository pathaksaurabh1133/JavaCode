package Spacial50;

public class test9 {

	public static void main(String[] args) {
		String s1 = "ramana";
        char target = 'a';
        char replacement = '@';

        String result = "";

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch == target) {
                result += replacement;
            } else {
                result += ch;
            }
        }

        System.out.println(result);

	}

}
