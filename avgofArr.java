package recursion;

public class avgofArr {
	 // Recursively computes average of arr[]
    static double avg(int arr[], int i, int n)
    {
        // Last element
        if (i == n-1)
            return arr[i];
      
        // When index is 0, divide sum computed so
        
        if (i == 0)
            return ((arr[i] + avg(arr, i+1, n))/n);
      
        //  sum
        return (arr[i] + avg(arr, i+1, n));
    }
      
    // Function that return average of an array.
    static double average(int arr[], int n)
    {
         return avg(arr, 0, n);
    }
     
    // main 
    public static void main (String[] args)
    {
        int arr[] = {1, 4, 3, 8, -5, 6, 7, 8, 9};
        int n = arr.length;
      
        System.out.println(average(arr, n));
    }
}
