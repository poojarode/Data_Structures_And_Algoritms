import java.util.Scanner;
class Series {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		float result = 0.0f;
		for (float i =1 ; i<= n ;i++)
		{
			if(i % 2 == 0){

				result -= 1/i;
			}else{
				result +=1/i;
			}

		}
		System.out.println("result " + result);
	} 
}
 
