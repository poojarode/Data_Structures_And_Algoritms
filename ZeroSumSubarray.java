import java.util.*;
public class ZeroSumSubarray{
	public static void main(String[] args) {
		int arr[] = {3,4,-1,4,3,6,7,1};
		int n = arr.length;
		if (ZeroSum(arr, n)) {
			System.out.println("Found");
		}else{
			System.out.println("Not Found");
		}
	}
	public static boolean ZeroSum(int a[], int n)
	{
		Set<Integer> li = new HashSet<>();
		int sum =0;
		boolean isF = false;
		for(int element : a){
			li.add(sum);
			sum += element;
			if(li.contains(sum)){
				 return true;
				
			}
			
		}
		return false;
	}
}