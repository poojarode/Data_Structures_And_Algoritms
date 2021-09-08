import java.util.*;
public class TwoPointers{
	public static void main(String[] args) {
		int arr[] = {2, 4, 5};
		Arrays.sort(arr);
		 boolean x = false;
		//boolean isFound = 
		for (int i = 0; i < arr.length-2 ; i++) {
			if(TwoSum(arr, -arr[i], i+1)){
				x = true;
				break;
		}else{
			x = false;
		}
	}
		if(x){
			System.out.println(" Found");
		}else{
			System.out.println(" Not Found");
		}
		

		/* if(isFound){
			System.out.println(x +" Found");
		}else{
			System.out.println(x +" Not Found");
		} */
	}

	public static boolean TwoSum(int a[], int x , int i){
		int j = a.length-1;
		while(i < j){
			if (a[i] + a[j] > x) {
				j--;
			}else if (a[i] + a[j] < x) {
				i++;
			}else{
				return true;
			}

		}
		return false;
	}

} 