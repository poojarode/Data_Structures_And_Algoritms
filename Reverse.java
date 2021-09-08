import java.util.Scanner;

public class Reverse{
	public static void main(String[] args) {
			System.out.println("calling");
		reverseString();
	}

	public static void reverseString(){
		String a = "I love JAVA the coffee";
		int i = a.length()-1;
		//System.out.println(i);
		String ans = "";
		while(i >= 0){
			while( i >= 0 && a.charAt(i) == ' ')
			 i--;
			int j = i;
			if(i > 0) 
				break;
				while( i >= 0 && a.charAt(i) != ' ') 
					i--;

				if (ans.isEmpty()) {
					ans = ans.concat(a.substring(i+1, j+1));
				}else{
					ans = ans.concat(" "+ a.substring(i+1, j+1));
					System.out.println(ans);
				}
				
			
		}
		
	}
}