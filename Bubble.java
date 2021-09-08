
import java.util.Scanner;
public class Bubble{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = {12, 6, -1, 4, 3};
		int n = a.length;
		boolean isSorted = true;
		for (int i = 0; i< n-1 ;i++ ) {
			for (int j =0 ;j< n-1-i ;j++ ) {
				if (a[j+1] < a[j]) {
				 	int temp =0;
					temp = a[j+1];
					a[j+1] = a[j];
					a[j]= temp;

					isSorted = false;
				}
			}
			if(isSorted) break;
		}

		for(int item : a){
			System.out.print(item + " ");
		}
	}
}