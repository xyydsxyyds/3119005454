package operations_created;

public class number_structure {
	public static void main(String[] args) {
    }
	
	int range;
	String[] result;
	
	public  number_structure(int range) {
		this.range=range;
		int a1=(int)(Math.random()*2+1);		
		if(a1==1) {result=fractional_number();}
		else 
		{int x=(int)(Math.random()*(range-1)+1);String inter=String.valueOf(x);String[] r= {inter,"","",inter};result=r;}
		}
		
	
	
//分数结构
	 public String[] fractional_number(){
		 int t = 0;
	     int x1=1+(int)(Math.random()*10);
	     int x2=1+(int)(Math.random()*10);//分母  
	       
	        if(x2<=x1 ){
	            t = x2;
	            x2 = x1;
	            x1 = t;
	            if( x1 == x2 ) {
	                x1 = x1 - 1;//保证分子比分母小
	            }
	        }	
	        int x_1=x1/(gcd(x1, x2));
	        int x_2=x2/(gcd(x1, x2));
	        String str_up = String.valueOf( x_1 );
	        String str_down = String.valueOf( x_2 );
            String str = str_up + "/" + str_down ;
            
            String[] arr = {str,str_up,str_down,""};
            return arr;
}
	//求公因子	
	 public int gcd(int a, int b) {
		 	while (b != 0) {
		 		int c = a % b;
		 		a = b;
		 		b = c;
		 	}
	        return a;
	    }
}
