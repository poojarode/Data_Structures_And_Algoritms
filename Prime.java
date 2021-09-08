import java.util.Scanner;
class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		boolean isPrime = true;
		if (n<2)
			isPrime = false;
		for (int i =2 ; i*i<= n ;i++)
		{
			if(n % i == 0){
				isPrime = false;
				break;
			}

		}
		System.out.println("isPrime " + isPrime);
	} 
}
 
