import java.util.Scanner;
class Whilea{
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
		int n = s.nextInt();
int sum = 0;
		while(n > 0){
			int lastD = n % 10;
			n /= 10;
			sum += lastD;
			System.out.println( lastD + " " + sum + " " + n );
		}
		System.out.println(" Sum of n is " + sum);
}
}