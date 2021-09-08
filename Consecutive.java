class Consecutive{
	
static long maxSum(long arr[] ,int n)
            {
		     long addition = 0;
		     long sub , abso = 0;
		    for(int i=0;i<=n-1;i++){
		         sub = arr[i] - arr[i+2];
		        abso = Math.abs(sub);
		        addition += addition;
		        if(i == n){
		           
		             for(int j=1;j<=n;j++){
		                 
		                  sub = arr[i] - arr[i+2];
		                  abso = Math.abs(sub);
		                 addition += addition;
		             }
		        }
		    
		    return addition;
		        
    }
    public static void main(String[] args) {
	int n = 5;
	long arr[] = {8, 9, 5, 4, 3}	;
	System.out.println(maxSum(arr, n));
	}
}