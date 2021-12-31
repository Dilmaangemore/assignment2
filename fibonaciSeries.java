package recursion;

public class fibonaciSeries {
	
	static  int fibonaciSeries(int x){
		if(x==1) {
			return 1;
			
		}
		if(x==0) {
			return 0;
			
		}
		
	
		
		return fibonaciSeries(x-1)+ fibonaciSeries(x-2);
	       
		
	
	}
	
	
	
	
	
	
	
	
	
	
public static void main(String [] args) {
	int x, n;
	for(x=0;x<=10;x++) {
		System.out.println("fibonaci"+fibonaciSeries(x));
	}
	//System.out.println(fibonaciSeries(10 ));

		
	
	// TODO Auto-generated constructor stub
}
}
