package recursion;

public class evenNumDecreasing {
	 static  void print (int i){
		 
		   //print even decreasing 
		       int n=76;
		           if (i>n) {
		            return;
		        }
		           print(i+1);
		          
		        if(i%2==0)
		        System.out.println("even no"+i);
		     
		        
		         
		    } 
	 
	 
		public static void main(String[] args) {
			int n=1;
			print  (n);//print  (1);  
		}
}
