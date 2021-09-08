import java.util.Scanner;
class Matrix{
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter no of rows and column: ");
		int rows = s.nextInt();
		int column= s.nextInt();
        int a[][]  = new int[rows][column];
        int b[][]  = new int[rows][column];
        int sum[][]  = new int[rows][column];
		System.out.println("Enter elements for 1st matrix: ");
		for (int i =0; i< rows ;i ++ ) {
			for (int j=0;j< column ;j++ ) {
                  a[i][j] = s.nextInt();
				
			}
					
				}		
System.out.println("Enter elements for 2nd matrix: ");
		for (int i =0; i< rows ;i ++ ) {
			for (int j=0;j< column ;j++ ) {
                  b[i][j] = s.nextInt();
				
			}
					
		}	

		for (int i =0; i< rows ;i ++ ) {
			for (int j=0;j< column ;j++ ) {
                 sum[i][j] = a[i][j] + b[i][j];

				
			}
					
	}
System.out.println("Sum of 1st and 2nd Matrix: ");
		for (int i =0; i< rows ;i ++ ) {
			for (int j=0;j< column ;j++ ) {
                 System.out.print(sum[i][j] + " ");
				
			}
				System.out.println();	
		}		
		
}
}