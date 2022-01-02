package recursion;

public class powerofNum_XpowerY {
public static void main(String[]args){
	powerofNum_XpowerY main=new powerofNum_XpowerY();
	
	var result= main.power(2,5);
	System.out.println(result);
}


public int power(int base, int Y) {
	
	if(Y<0) {
		return -1;
	}
	
	if(Y==0) 
	{
		return 1;
	}
	return base * power (base, Y-1);
	
}
}
