package recursion;

public class gcd {
	public static void main(String[]args){
		gcd main=new gcd();
		
	     var result =main.gcd(4,8);
	     
		System.out.println(result);
	}
	
	public int gcd(int a, int b)
	{
		if(b==0) {
			return a;
		}
		if(a<0||b<0) {
			return -1;
	
		}
		
		return gcd(a,a%b);
	}
	
	
}


