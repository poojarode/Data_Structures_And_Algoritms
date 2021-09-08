import java.util.Scanner;
class Power {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result=1;
			for(int i= 0; i < b; i++)
			{
				result *= a;
				
			}
			
		System.out.println("Result Number" + result);
	}
}
 
