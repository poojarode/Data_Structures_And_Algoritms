import java.util.*;
class BinarySearch {

public static void main(String[] args) {
    int arr[] = {-1, 1, 2, 2,2,2,2, 2, 4,5 };
    int len = arr.length;
    int x = 2;
    int firstIndex = binarySearch(arr, len, x, true);
    if(firstIndex == -1){
       System.out.println("Count of" + x + " is 0 times");
        //return 0;
    }else{
        int lastIndex = binarySearch(arr, len ,x ,false);
          int finall = lastIndex - firstIndex + 1 ;
          System.out.println("Count of" + x + " is " + finall + "times");
        //return (lastIndex - firstIndex + 1);
    }
    
    }

    public static int binarySearch(int arr[], int n, int x, boolean searhFirst) {
        int low = 0, high = n - 1, result = -1;
        while(low <= high){
            int mid = (low + high) /2;
            if(arr[mid] == x){
                result = mid;
                if(searhFirst) 
                    high = mid -1;
                else
                    low = mid +1 ;
            }else if (x < arr[mid])  high = mid -1;
            else low = mid +1 ;        
            } 
            return result;
        }
    }
