package recursion;

public class recursive_binarySearch {
	
	  int binarySearch(int[] arr, int  start, int  end,int target ) {
		
		
	 while(start<end) {
		 int  mid=start+(end-start)/2;
		 if(arr[mid]==target) {
		 return binarySearch(arr,start, end, target);
			 
		 }
		 if(target<arr[mid])
		 binarySearch(arr, start,  mid-1, target);
		 else
			 binarySearch(arr,mid+1,end,target);	 
	 }
	 System.out.println(binarySearch(arr,start, end, target)); 
	   
	   return-1;
	 }
	
		
		
	
	public static void main(String[]args) {
	
		 int arr[]= {-1,0,3,5,9,12};
	     int target=9;
	      int end = arr.length-1;
	      //System.out.println(binarySearch(arr, mid)); 
		   
	}
	
} 
	 

