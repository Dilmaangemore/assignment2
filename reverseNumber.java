package recursion;

public class reverseNumber {
	public static void Reverse(int num)
    {
 
        // base condition 
        if (num < 10) {
            System.out.println(num);
            return;
        }
 
        else {
 
          
            System.out.print(num % 10);
 
           
            Reverse(num / 10);
        }
    }
 
    // driver code
    public static void main(String args[])
    {
        // number to be reversed
        int num = 12345;
 
        System.out.print("Reversed Number: ");
 
       
        Reverse(num);
    }
}
