import java.util.Scanner;
public class Table{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int t = 1;
		for (int i = 1; i<= n ;i++) {
			for (int j = 1; j<=10 ;j++ ) {
                 t = i * j;
				System.out.print(t + " ");
				
			}
			System.out.println();
		}

	}
}