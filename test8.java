package Spacial50;

public class test8 {

	public static void main(String[] args) {
		 String s1 = "AssmnAN";
	        int[] count = new int[256]; 

	        
	        for (int i = 0; i < s1.length(); i++) {
	            count[s1.charAt(i)]++;
	        }

	       
	        boolean[] printed = new boolean[256];
	        for (int i = 0; i < s1.length(); i++) {
	            char c = s1.charAt(i);
	            if (!printed[c]) {
	                System.out.println(c + " = " + count[c]);
	                printed[c] = true;
	            }
	        }

	}

}
