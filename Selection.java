
import java.util.Scanner;
public class Selection{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = {12, 6, -1, 4, 3};
		int n = a.length;
		int minInd = 0;

		for (int i = 0; i< n-1 ;i++ ) {
			minInd = i;
			for (int j =i ;j< n ;j++ ) {
				if (a[minInd] > a[j]) {
				 	

					minInd = j;
				}
			}
					int temp =0;
					temp = a[minInd];
					a[minInd] = a[i];
					a[i]= temp;
		}

		for(int item : a){
			System.out.print(item + " ");
		}
	}
}