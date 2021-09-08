import java.util.*;
public class ReverseString{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		reverse(name);
		int len = name.length() -1;
		char[] rev = name.toCharArray();
		for(int i = len; i >= 0; i--){
			System.out.print(rev[i]);
		}	
		
	}

	public static void reverse(String str)
	{
		char ch[] = str.toCharArray();
		int len = ch.length - 1;
		String rev = "";
		for (int i = len; i>=0 ;i-- ) {
			rev += ch[i];
		}

		System.out.println(rev);
	}
}