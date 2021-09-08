import java.util.*;
public class Interviewed{
	public static void main(String[] args) {
		Solution solution = new Solution();
		int a[] = {5,3,2,1,4,5,6,8,1,2};
		int ans[] = solution.maxSlidingWindow(a, 3);
		for(int i : ans){
			System.out.print(i +" ");
		}
	}
	public static class Solution{
		public int[] maxSlidingWindow(int a[], int k){
			int n = a.length;
			Deque<Integer> dq = new LinkedList<>();
			int ans[] = new int[n-k+1];
			int i = 0;
			for (;i < k ;i++ ) {
				while(!dq.isEmpty() && a[dq.peekLast] <= a[i]){
					dq.removeLast();
				}
				dq.addLast(i);
			}
			for (;i < n ; i++) {
				ans[i-k] = a[dq.peekFirst()];
				while(!dq.isEmpty() && dq.peekFirst() <= i-k){
					dq.removeFirst();
				}
				while(!dq.isEmpty() && a[dq.peekLast] <= a[i]){
					dq.removeLast();
				}
				dq.addLast(i);
			}
			ans[i-k] = a[dq.peekFirst()];
			return ans;
		}
	}
}