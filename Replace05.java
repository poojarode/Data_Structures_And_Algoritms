public class Replace05{
	public static void main(String[] args) {

		int n = 205;
		int ans = 0, ans1=0;

		ans = Reverse(n);
		ans1 = Reverse(ans);
		System.out.println("replaced number is:" + ans1);
		
	}

	public static int Reverse(int n){
		int lastDigit, rev = 0;
		while(n > 0){
		lastDigit = n % 10;
		if (lastDigit == 0) {

		 	lastDigit = 5;
		 } 

		 rev = rev * 10 + lastDigit;
		 n = n/10;

	}
	return rev;
} 
}