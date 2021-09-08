import java.util.Scanner;
public class Patte{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int rows = 2 * n - 1;
		for (int i = 1; i<= rows ;i++) {
			if(i <= n)
			{

			for (int j = 1; j<=i ;j++ ) {
                System.out.print( " * ");
				
			}
		}else{
			for (int j = 1; j<= rows-i+1 ;j++ ) {
                System.out.print(" * ");
				
			}
			
		}System.out.println();
	}

     System.out.println("*");

for (int i = 2; i<= n-1 ;i++) {
	System.out.print("* ");
	for (int j = 1; j <= i-2 ;j++ ) {
		System.out.print("  ");
	}
System.out.println("* ");
}



	

for (int k = 1;k <= n; k++ ) {
	System.out.print("* ");
	
}
	}
}