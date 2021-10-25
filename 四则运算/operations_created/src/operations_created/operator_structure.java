package operations_created;

public class operator_structure {
	public static void main(String[] args) {
	}
	String inter1;
	String inter2;
	String str_up1;
	String str_down1;
	String str_up2;
	String str_down2;
	String site;
	String[] result;
	
	//String str_up3,String str_down3分数结果,String inter3整数结果
	public  operator_structure(String str_up1,String str_down1,String inter1,String str_up2,String str_down2,String inter2,String site) {
		this.inter1=inter1;
		this.inter2=inter2;
		this.str_up1=str_up1;
		this.str_down1=str_down1;
		this.str_up2=str_up2;
		this.str_down2=str_down2;
		this.site=site;
		if(site==" + "){
		if(inter1==""&&inter2=="") {result=operator_string1_1();}
		else if(inter1!=""&&inter2!="") {result=operator_string1_2();}
		else if(inter1==""&&inter2!="") {result=operator_string1_3();}
		else if(inter2==""&&inter1!="") {result=operator_string1_4();}}
		else if(site==" - "){
		if(inter1==""&&inter2=="") {result=operator_string2_1();}
		else if(inter1!=""&&inter2!="") {result=operator_string2_2();}
		else if(inter1==""&&inter2!="") {result=operator_string2_3();}
		else if(inter2==""&&inter1!="") {result=operator_string2_4();}}
		else if(site==" × "){
		if(inter1==""&&inter2=="") {result=operator_string3_1();}
		else if(inter1!=""&&inter2!="") {result=operator_string3_2();}
		else if(inter1==""&&inter2!="") {result=operator_string3_3();}
		else if(inter2==""&&inter1!="") {result=operator_string3_4();}}
		else if(site==" ÷ "){
	    if(inter1==""&&inter2=="") {result=operator_string4_1();}
		else if(inter1!=""&&inter2!="") {result=operator_string4_2();}
		else if(inter1==""&&inter2!="") {result=operator_string4_3();}
		else if(inter2==""&&inter1!="") {result=operator_string4_4();}}
	}
//加法
public String[] operator_string1_1(){
		int int_up1=Integer.parseInt(str_up1);
		 int int_up2=Integer.parseInt(str_up2);
		 int int_down1=Integer.parseInt(str_down1);
		 int int_down2=Integer.parseInt(str_down2);
		 int int_up3=(int_up1*int_down2+int_up2*int_down1)/gcd((int_up1*int_down2+int_up2*int_down1),int_down1*int_down2);
		 int int_down3=int_down1*int_down2/gcd((int_up1*int_down2+int_up2*int_down1),int_down1*int_down2);		
		 String str_up3=String.valueOf(int_up3);
		 String str_down3=String.valueOf(int_down3);
		 String[] arr =turn_esay(str_up3,str_down3);		 
		 return arr;}
	public String[] operator_string1_2(){		
		int int1=Integer.parseInt(inter1);
		 int int2=Integer.parseInt(inter2);
		 int int3=int1+int2;
		 String inter3=String.valueOf(int3);
		 String[] arr = {"","",inter3};
		 return arr;}
	public String[] operator_string1_3(){
		int int_up1=Integer.parseInt(str_up1); 
		 int int_down1=Integer.parseInt(str_down1);
		 int int2=Integer.parseInt(inter2);
		 int int_up3=(int_up1+int2*int_down1)/gcd(int_down1,(int_up1+int2*int_down1));
		 int int_down3=int_down1/gcd(int_down1,(int_up1+int2*int_down1));
		 String str_up3=String.valueOf(int_up3);
		 String str_down3=String.valueOf(int_down3);
		 String[] arr =turn_esay(str_up3,str_down3);
		 return arr;}
	public String[] operator_string1_4(){
		int int_up2=Integer.parseInt(str_up2); 
		 int int_down2=Integer.parseInt(str_down2);
		 int int1=Integer.parseInt(inter1);
		 int int_up3=(int_up2+int1*int_down2)/gcd(int_down2,(int_up2+int1*int_down2));
		 int int_down3=int_down2/gcd(int_down2,(int_up2+int1*int_down2));
		 String str_up3=String.valueOf(int_up3);
		 String str_down3=String.valueOf(int_down3);
		 String[] arr =turn_esay(str_up3,str_down3);
		 return arr;}
	
//减法
public String[] operator_string2_1(){
	    int int_up1=Integer.parseInt(str_up1);
	    int int_up2=Integer.parseInt(str_up2);
	    int int_down1=Integer.parseInt(str_down1);
	    int int_down2=Integer.parseInt(str_down2);
	    if(int_up1*int_down2<int_up2*int_down1) {int t1=int_up1;int_up1=int_up2;int_up2=t1;
	                                             int t2=int_down1;int_down1=int_down2;int_down2=t2;}
	    int int_up3=(int_up1*int_down2-int_up2*int_down1)/gcd((int_up1*int_down2-int_up2*int_down1),int_down1*int_down2);
	    int int_down3=int_down1*int_down2/gcd((int_up1*int_down2-int_up2*int_down1),int_down1*int_down2);
	    String str_up3=String.valueOf(int_up3);
	    String str_down3=String.valueOf(int_down3);
	    String[] arr =turn_esay(str_up3,str_down3);
	    return arr;}
	public String[] operator_string2_2(){
		 int int1=Integer.parseInt(inter1);
		 int int2=Integer.parseInt(inter2);
		 if(int1<int2) {int t=int1;int1=int2;int2=t;}
		 int int3=int1-int2;
		 String inter3=String.valueOf(int3);
		 String[] arr = {"","",inter3};
		 return arr;}
	public String[] operator_string2_3(){
		int int_up1=Integer.parseInt(str_up1); 
		 int int_down1=Integer.parseInt(str_down1);
		 int int2=Integer.parseInt(inter2);
		 int a_up2=int2*int_down1;
		 int a_down2=int_down1;
		 if(int_up1<int2*int_down1) {int t1=int_up1;int_up1=a_up2;a_up2=t1;
         int t2=int_down1;int_down1=a_down2;a_down2=t2;}
         int int_up3=(int_up1*a_down2-a_up2*int_down1)/gcd((int_up1*a_down2-a_up2*int_down1),int_down1*a_down2);
         int int_down3=int_down1*a_down2/gcd((int_up1*a_down2-a_up2*int_down1),int_down1*a_down2);
         String str_up3=String.valueOf(int_up3);
         String str_down3=String.valueOf(int_down3);
         String[] arr =turn_esay(str_up3,str_down3);
         return arr;}
	public String[] operator_string2_4(){
		int int_up2=Integer.parseInt(str_up2); 
		 int int_down2=Integer.parseInt(str_down2);
		 int int1=Integer.parseInt(inter1);
		 int a_up1=int1*int_down2;
		 int a_down1=int_down2;
		 if(int_up2<int1*int_down2) {int t1=int_up2;int_up2=a_up1;a_up1=t1;
        int t2=int_down2;int_down2=a_down1;a_down1=t2;}
        int int_up3=(int_up2*a_down1-a_up1*int_down2)/gcd((int_up2*a_down1-a_up1*int_down2),int_down2*a_down1);
        int int_down3=int_down2*a_down1/gcd((int_up2*a_down1-a_up1*int_down2),int_down2*a_down1);
        String str_up3=String.valueOf(int_up3);
        String str_down3=String.valueOf(int_down3);
        String[] arr =turn_esay(str_up3,str_down3);
        return arr;}
//乘法
public String[] operator_string3_1(){
	 int int_up1=Integer.parseInt(str_up1);
	 int int_up2=Integer.parseInt(str_up2);
	 int int_down1=Integer.parseInt(str_down1);
	 int int_down2=Integer.parseInt(str_down2);
	 int int_up3=int_up1*int_up2/gcd(int_up1*int_up2,int_down1*int_down2);
	 int int_down3=int_down1*int_down2/gcd(int_up1*int_up2,int_down1*int_down2);
	 String str_up3=String.valueOf(int_up3);
	 String str_down3=String.valueOf(int_down3);
	 String[] arr =turn_esay(str_up3,str_down3);
	 return arr;}
	public String[] operator_string3_2(){
		 int int1=Integer.parseInt(inter1);
		 int int2=Integer.parseInt(inter2);
		 int int3=int1*int2;
		 String inter3=String.valueOf(int3);
		 String[] arr = {"","",inter3};
		 return arr;}
	public String[] operator_string3_3(){
		int int_up1=Integer.parseInt(str_up1); 
		 int int_down1=Integer.parseInt(str_down1);
		 int int2=Integer.parseInt(inter2);
		 int int_up3=int_up1*int2/gcd(int_down1,int_up1*int2);
		 int int_down3=int_down1/gcd(int_down1,int_up1*int2);
		 String str_up3=String.valueOf(int_up3);
		 String str_down3=String.valueOf(int_down3);
		 String[] arr =turn_esay(str_up3,str_down3);
		 return arr;}
	public String[] operator_string3_4(){
		int int_up2=Integer.parseInt(str_up2); 
		 int int_down2=Integer.parseInt(str_down2);
		 int int1=Integer.parseInt(inter1);
		 int int_up3=int_up2*int1/gcd(int_down2,int_up2*int1);
		 int int_down3=int_down2/gcd(int_down2,int_up2*int1);
		 String str_up3=String.valueOf(int_up3);
		 String str_down3=String.valueOf(int_down3);
		 String[] arr =turn_esay(str_up3,str_down3);
		 return arr;}
//除法
	public String[] operator_string4_1(){
		 int int_up1=Integer.parseInt(str_up1);
		 int int_up2=Integer.parseInt(str_up2);
		 int int_down1=Integer.parseInt(str_down1);
		 int int_down2=Integer.parseInt(str_down2);
		 int int_up3=int_up1*int_down2/gcd(int_up1*int_down2,int_down1*int_up2);
		 int int_down3=int_down1*int_up2/gcd(int_up1*int_down2,int_down1*int_up2);
		 String str_up3=String.valueOf(int_up3);
		 String str_down3=String.valueOf(int_down3);
		 String[] arr =turn_esay(str_up3,str_down3);
		 return arr;}
		public String[] operator_string4_2(){
			 int int1=Integer.parseInt(inter1);
			 int int2=Integer.parseInt(inter2);
			 int int_up3=int1/gcd(int1,int2);
			 int int_down3=int2/gcd(int1,int2);
			 String str_up3=String.valueOf(int_up3);
			 String str_down3=String.valueOf(int_down3);
			 String[] arr =turn_esay(str_up3,str_down3);
			 return arr;}
		public String[] operator_string4_3(){
			int int_up1=Integer.parseInt(str_up1); 
			 int int_down1=Integer.parseInt(str_down1);
			 int int2=Integer.parseInt(inter2);
			 int int_up3=int_up1/gcd(int_down1*int2,int_up1);
			 int int_down3=int_down1*int2/gcd(int_down1*int2,int_up1);
			 String str_up3=String.valueOf(int_up3);
			 String str_down3=String.valueOf(int_down3);
			 String[] arr =turn_esay(str_up3,str_down3);
			 return arr;}
		public String[] operator_string4_4(){
			int int_up2=Integer.parseInt(str_up2); 
			 int int_down2=Integer.parseInt(str_down2);
			 int int1=Integer.parseInt(inter1);
			 int int_up3=int_down2*int1/gcd(int_up2,int_down2*int1);
			 int int_down3=int_up2/gcd(int_up2,int_down2*int1);
			 String str_up3=String.valueOf(int_up3);
			 String str_down3=String.valueOf(int_down3);
			 String[] arr =turn_esay(str_up3,str_down3);
			 return arr;}
//求公因子	
public  int gcd(int a, int b){
	if(a==0&&b==0)
	return 1;
    else if(a==0)
	return b;
	else if(b==0)
    return a;
	else
    return a%b==0 ? b : gcd(b, a%b);
}
//保证分母为1,0不存在,分子为0不存在
public String[] turn_esay(String up,String down){
	int up_int=Integer.parseInt(up);
	int down_int=Integer.parseInt(down);
	String u;
	String d;
	String i;
	if(down_int==1)
	{ u=""; d="";i=up;}
	else if(up_int==0||down_int==0)
	{ u=""; d="";i="0";}
	else
	{u=up;d=down;i="";}	
	String[] arr = {u,d,i};
	 return arr;
}
}

