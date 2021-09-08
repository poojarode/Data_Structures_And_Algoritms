import java.util.Scanner;
public class Pattern{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int t = 1;
		for (int i = 1; i<= n ;i++) {
			for (int j = 1; j<=n ;j++ ) {
                System.out.print( " * ");
				
			}
			System.out.println();
		}
		for (int i = 1; i<= n ;i++) {
			for (int j = 1; j<=i ;j++ ) {
                System.out.print( " * ");
				
			}
			System.out.println();
		}
		for (int i = 1; i<= n ;i++) {
			for (int j = 1; j<=i-1 ;j++ ) {
                System.out.print("   ");		
			}
			for (int j = 1; j<=n-i+1 ;j++ ) {
                System.out.print(" * ");
                
				
			}
			System.out.println();
		}

for (int i = 1; i<= n ;i++) {
			for (int j = n; j >= i ;j-- ) {
                System.out.print( " * ");
				
			}
			System.out.println();
		}



for (int i = 1; i<= n ;i++) {
			

			for (int j = 1; j <= i ;j++ ) {

                System.out.print( "   ");
				
			}
			for (int j = 1; j <= n-i+1 ;j++ ) {
                System.out.print( " * ");
				
			}
			System.out.println();
		}


	}





}