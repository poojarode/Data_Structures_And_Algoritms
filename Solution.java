import java.util.*;
class Solution {

public static void main(String[] args) {
    int arr[] = {3, 5,2, 2,2,2,2, 2, -1, 5};
    int len = arr.length-1;
    int x = 2;
    int countAll = count(arr, len, x);
    System.out.println(countAll);
}



    static int  count(int[] arr, int n, int x) {
        // code here
        Arrays.sort(arr);
        int noOf = binarySearch(arr,0, n-1, x );
        return noOf;
        
    }
    
    public static int binarySearch(int arr[], int i, int j, int x){
        int c = 0;
        if(j >= 1){
            int mid = i + (j-1) / 2;
            if (x > arr[mid]){
               return binarySearch(arr ,mid + 1 ,j , x);
            }else if( x < arr[mid]){
              return binarySearch(arr , i , mid - 1, x);
            }else{
                c++;
            }
            
    }
    return c;
    
    }
}