package recursion;

public class find_maxMinElement_inArr {
	
	public static int findMinValue(int A[], int n)
    {
      // if size = 0 means whole array
      // has been traversed
        if(n == 1)
        return A[0];
         
        return Math.min(A[n-1], findMinValue(A, n-1));
    }
     
  
     public static int findMaxValue(int A[], int n)
     {
      // if size = 0 means whole array
      // has been traversed
        if(n == 1)
        return A[0];
         
        return Math.max(A[n-1], findMaxValue(A, n-1));
    }
     
    // Driver code
      public static void main(String args[])
      {
           int A[] = {1,-1,0,2,3,-3,4,-4};
           int n = A.length;
         
        // Function calling
             System.out.println(findMinValue(A, n));
           System.out.println(findMaxValue(A, n));
    }
	 
}
