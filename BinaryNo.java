import java.util.*;
public class BinaryNo{
	public static void main(String[] args) {
		
		System.out.println(generate(5));
	}
	public static ArrayList<String> generate(int N){
		Queue<String> q = new LinkedList();
		ArrayList <String> ans = ArrayList<String>();
		q.add("1");
		while(N-- > 0){
			String a = q.peek();
			q.remove();
			
			ans.add(a);
			String b = a;
			q.add(a + "0");
			q.add(b + "1");
		}
		return ans;
	}
}