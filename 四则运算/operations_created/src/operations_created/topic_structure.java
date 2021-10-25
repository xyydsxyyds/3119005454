package operations_created;

public class topic_structure {
	public static void main(String[] args) {
	}
	
	int range;
	String[] result;
	
public topic_structure(int range) {
	this.range=range;
	number_structure a=new number_structure(range);
	number_structure b=new number_structure(range);
	number_structure c=new number_structure(range);
	number_structure d=new number_structure(range);
	int a1=(int)(Math.random()*4+1);
	String site1 = null;
	if(a1==1){site1=" + ";}
	else if(a1==2){site1=" - ";}
	else if(a1==3){site1=" × ";}
	else if(a1==4){site1=" ÷ ";}
	int a2=(int)(Math.random()*4+1);
	String site2= null;
	if(a2==1){site2=" + ";}
	else if(a2==2){site2=" - ";}
	else if(a2==3){site2=" × ";}
	else if(a2==4){site2=" ÷ ";}
	int a3=(int)(Math.random()*4+1);
	String site3= null;
	if(a3==1){site3=" + ";}
	else if(a3==2){site3=" - ";}
	else if(a3==3){site3=" × ";}
	else if(a3==4){site3=" ÷ ";}
	
	
	int struct=(int)(Math.random()*11+1);
	
	if(struct==1)
	{if((site1==" + "||site1==" - ")&&(site2==" + "||site2==" - ")&&(site3==" × "||site3==" ÷ "))
	{result=struct1_1(a.result,b.result,c.result,d.result,site1,site2,site3);}
	else if((site1==" + "||site1==" - ")&&(site2==" × "||site2==" ÷ ")&&(site3==" × "||site3==" ÷ ")) 
	{result=struct1_2(a.result,b.result,c.result,d.result,site1,site2,site3);}
	else if((site1==" + "||site1==" - ")&&(site2==" × "||site2==" ÷ ")&&(site3==" + "||site3==" - ")) 
	{result=struct1_3(a.result,b.result,c.result,d.result,site1,site2,site3);}
	else if((site1==" × "||site1==" ÷ ")&&(site2==" + "||site2==" - ")&&(site3==" × "||site3==" ÷ ")) 
	{result=struct1_4(a.result,b.result,c.result,d.result,site1,site2,site3);}
	else  
	{result=struct1_5(a.result,b.result,c.result,d.result,site1,site2,site3);}}
	
	else if(struct==2)
	{if((site1==" + "||site1==" - ")&&(site2==" + "||site2==" - ")&&(site3==" × "||site3==" ÷ ")) 
	{result=struct2_2(a.result,b.result,c.result,d.result,site1,site2,site3);}
	else
	{result=struct2_1(a.result,b.result,c.result,d.result,site1,site2,site3);}}
	
	else if(struct==3){result=struct3(a.result,b.result,c.result,d.result,site1,site2,site3);}
	
	else if(struct==4)
	{if((site2==" × "||site2==" ÷ ")&&(site1==" + "||site1==" - ")&&(site3==" + "||site3==" - ")) 
	{result=struct4_2(a.result,b.result,c.result,d.result,site1,site2,site3);}
	else
	{result=struct4_1(a.result,b.result,c.result,d.result,site1,site2,site3);}}
	
	else if(struct==5)
	{if((site1==" + "||site1==" - ")&&(site2==" × "||site2==" ÷ ")&&(site3==" + "||site3==" - ")) 
	{result=struct5_2(a.result,b.result,c.result,d.result,site1,site2,site3);}
	else
	{result=struct5_1(a.result,b.result,c.result,d.result,site1,site2,site3);}}
	
	else if(struct==6)
	{if((site1==" + "||site1==" - ")&&(site2==" + "||site2==" - ")&&(site3==" × "||site3==" ÷ ")) 
	{result=struct6_2(a.result,b.result,c.result,d.result,site1,site2,site3);}
	else
	{result=struct6_1(a.result,b.result,c.result,d.result,site1,site2,site3);}}
	
	else if(struct==7){result=struct7(a.result,b.result,c.result,d.result,site1,site2,site3);}
	
	else if(struct==8)
	{if((site1==" + "||site1==" - ")&&(site2==" × "||site2==" ÷ ")) 
	{result=struct8_2(a.result,b.result,c.result,d.result,site1,site2,site3);}
	else
	{result=struct8_1(a.result,b.result,c.result,d.result,site1,site2,site3);}}
	
	else if(struct==9){result=struct9(a.result,b.result,c.result,d.result,site1,site2,site3);}
	else if(struct==10){result=struct10(a.result,b.result,c.result,d.result,site1,site2,site3);}
	else if(struct==11){result=struct11(a.result,b.result,c.result,d.result,site1,site2,site3);}

}
    //a+b+c+d
	//(a+b)+c+d
	//a+(b+c)+d
	//a+b+(c+d)
	//(a+b+c)+d
	//a+(b+c+d)
	//(a+b)+(c+d)
	//a+b+c
	//(a+b)+c
	//a+(b+c)
	//a+b
public String[] struct1_1(String[] a,String[] b,String[]c,String[] d,String site1,String site2,String site3) {
	operator_structure pro1=new operator_structure(c[1],c[2],c[3],d[1],d[2],d[3],site3);
	operator_structure pro2=new operator_structure(a[1],a[2],a[3],b[1],b[2],b[3],site1);
	operator_structure pro3=new operator_structure(pro2.result[0],pro2.result[1],pro2.result[2],pro1.result[0],pro1.result[1],pro1.result[2],site2);
	String re="";
	if(pro3.result[2]!="")  re=pro3.result[2];
	else re=turn_two(pro3.result[0],pro3.result[1]);
	String[] arr = {a[0]+site1+b[0]+site2+c[0]+site3+d[0]+"=",re};
    return arr;	
}//a+b+c*d
public String[] struct1_2(String[] a,String[] b,String[]c,String[] d,String site1,String site2,String site3) {
	operator_structure pro1=new operator_structure(b[1],b[2],b[3],c[1],c[2],c[3],site2);
	operator_structure pro2=new operator_structure(pro1.result[0],pro1.result[1],pro1.result[2],d[1],d[2],d[3],site3);
	operator_structure pro3=new operator_structure(a[1],a[2],a[3],pro2.result[0],pro2.result[1],pro2.result[2],site1);
	String re="";
	if(pro3.result[2]!="")  re=pro3.result[2];
	else re=turn_two(pro3.result[0],pro3.result[1]);
	String[] arr = {a[0]+site1+b[0]+site2+c[0]+site3+d[0]+"=",re};
    return arr;	
}//a+b*c*d
public String[] struct1_3(String[] a,String[] b,String[]c,String[] d,String site1,String site2,String site3) {
	operator_structure pro1=new operator_structure(b[1],b[2],b[3],c[1],c[2],c[3],site2);
	operator_structure pro2=new operator_structure(a[1],a[2],a[3],pro1.result[0],pro1.result[1],pro1.result[2],site1);
	operator_structure pro3=new operator_structure(pro2.result[0],pro2.result[1],pro2.result[2],d[1],d[2],d[3],site3);
	String re="";
	if(pro3.result[2]!="")  re=pro3.result[2];
	else re=turn_two(pro3.result[0],pro3.result[1]);
	String[] arr = {a[0]+site1+b[0]+site2+c[0]+site3+d[0]+"=",re};
    return arr;		
}//a+b*c+d
public String[] struct1_4(String[] a,String[] b,String[]c,String[] d,String site1,String site2,String site3) {
	operator_structure pro1=new operator_structure(a[1],a[2],a[3],b[1],b[2],b[3],site1);
	operator_structure pro2=new operator_structure(c[1],c[2],c[3],d[1],d[2],d[3],site3);
	operator_structure pro3=new operator_structure(pro1.result[0],pro1.result[1],pro1.result[2],pro2.result[0],pro2.result[1],pro2.result[2],site2);
	String re="";
	if(pro3.result[2]!="")  re=pro3.result[2];
	else re=turn_two(pro3.result[0],pro3.result[1]);
	String[] arr = {a[0]+site1+b[0]+site2+c[0]+site3+d[0]+"=",re};
    return arr;	
}//a*b+c*d
public String[] struct1_5(String[] a,String[] b,String[]c,String[] d,String site1,String site2,String site3) {
	operator_structure pro1=new operator_structure(a[1],a[2],a[3],b[1],b[2],b[3],site1);
	operator_structure pro2=new operator_structure(pro1.result[0],pro1.result[1],pro1.result[2],c[1],c[2],c[3],site2);
	operator_structure pro3=new operator_structure(pro2.result[0],pro2.result[1],pro2.result[2],d[1],d[2],d[3],site2);
	String re="";
	if(pro3.result[2]!="")  re=pro3.result[2];
	else re=turn_two(pro3.result[0],pro3.result[1]);
	String[] arr = {a[0]+site1+b[0]+site2+c[0]+site3+d[0]+"=",re};
    return arr;	
}//a+b+c+d


public String[] struct2_1(String[] a,String[] b,String[]c,String[] d,String site1,String site2,String site3) {
	operator_structure pro1=new operator_structure(a[1],a[2],a[3],b[1],b[2],b[3],site1);
	operator_structure pro2=new operator_structure(pro1.result[0],pro1.result[1],pro1.result[2],c[1],c[2],c[3],site2);
	operator_structure pro3=new operator_structure(pro2.result[0],pro2.result[1],pro2.result[2],d[1],d[2],d[3],site3);
	String re="";
	if(pro3.result[2]!="")  re=pro3.result[2];
	else re=turn_two(pro3.result[0],pro3.result[1]);
	String[] arr = {"("+a[0]+site1+b[0]+")"+site2+c[0]+site3+d[0]+"=",re};
    return arr;	
}//(a+b)+c+d
public String[] struct2_2(String[] a,String[] b,String[]c,String[] d,String site1,String site2,String site3) {
	operator_structure pro1=new operator_structure(a[1],a[2],a[3],b[1],b[2],b[3],site1);
	operator_structure pro2=new operator_structure(c[1],c[2],c[3],d[1],d[2],d[3],site3);
	operator_structure pro3=new operator_structure(pro1.result[0],pro1.result[1],pro1.result[2],pro2.result[0],pro2.result[1],pro2.result[2],site2);
	String re="";
	if(pro3.result[2]!="")  re=pro3.result[2];
	else re=turn_two(pro3.result[0],pro3.result[1]);
	String[] arr = {"("+a[0]+site1+b[0]+")"+site2+c[0]+site3+d[0]+"=",re};
    return arr;	
}//(a+b)+c*d


public String[] struct3(String[] a,String[] b,String[]c,String[] d,String site1,String site2,String site3) {
	operator_structure pro1=new operator_structure(b[1],b[2],b[3],c[1],c[2],c[3],site2);
	operator_structure pro2=new operator_structure(a[1],a[2],a[3],pro1.result[0],pro1.result[1],pro1.result[2],site1);
	operator_structure pro3=new operator_structure(pro2.result[0],pro2.result[1],pro2.result[2],d[1],d[2],d[3],site3);
	String re="";
	if(pro3.result[2]!="")  re=pro3.result[2];
	else re=turn_two(pro3.result[0],pro3.result[1]);
	String[] arr = {a[0]+site1+"("+b[0]+site2+c[0]+")"+site3+d[0]+"=",re};
    return arr;	
}//a+(b+c)+d


public String[] struct4_1(String[] a,String[] b,String[]c,String[] d,String site1,String site2,String site3) {
	operator_structure pro1=new operator_structure(c[1],c[2],c[3],d[1],d[2],d[3],site3);
	operator_structure pro2=new operator_structure(a[1],a[2],a[3],b[1],b[2],b[3],site1);
	operator_structure pro3=new operator_structure(pro2.result[0],pro2.result[1],pro2.result[2],pro1.result[0],pro1.result[1],pro1.result[2],site2);
	String re="";
	if(pro3.result[2]!="")  re=pro3.result[2];
	else re=turn_two(pro3.result[0],pro3.result[1]);
	String[] arr = {a[0]+site1+b[0]+site2+"("+c[0]+site3+d[0]+")"+"=",re};
    return arr;	
}//a+b+(c+d)
public String[] struct4_2(String[] a,String[] b,String[]c,String[] d,String site1,String site2,String site3) {
	operator_structure pro1=new operator_structure(c[1],c[2],c[3],d[1],d[2],d[3],site3);
	operator_structure pro2=new operator_structure(b[1],b[2],b[3],pro1.result[0],pro1.result[1],pro1.result[2],site2);
	operator_structure pro3=new operator_structure(a[1],a[2],a[3],pro2.result[0],pro2.result[1],pro2.result[2],site1);
	String re="";
	if(pro3.result[2]!="")  re=pro3.result[2];
	else re=turn_two(pro3.result[0],pro3.result[1]);
	String[] arr = {a[0]+site1+b[0]+site2+"("+c[0]+site3+d[0]+")"+"=",re};
    return arr;	
}//a+b*(c+d)


public String[] struct5_1(String[] a,String[] b,String[]c,String[] d,String site1,String site2,String site3) {
	operator_structure pro1=new operator_structure(a[1],a[2],a[3],b[1],b[2],b[3],site1);
	operator_structure pro2=new operator_structure(pro1.result[0],pro1.result[1],pro1.result[2],c[1],c[2],c[3],site2);
	operator_structure pro3=new operator_structure(pro2.result[0],pro2.result[1],pro2.result[2],d[1],d[2],d[3],site3);
	String re="";
	if(pro3.result[2]!="")  re=pro3.result[2];
	else re=turn_two(pro3.result[0],pro3.result[1]);
	String[] arr = {"("+a[0]+site1+b[0]+site2+c[0]+")"+site3+d[0]+"=",re};
    return arr;	
}//(a+b+c)+d
public String[] struct5_2(String[] a,String[] b,String[]c,String[] d,String site1,String site2,String site3) {
	operator_structure pro1=new operator_structure(b[1],b[2],b[3],c[1],c[2],c[3],site2);
	operator_structure pro2=new operator_structure(a[1],a[2],a[3],pro1.result[0],pro1.result[1],pro1.result[2],site1);
	operator_structure pro3=new operator_structure(pro2.result[0],pro2.result[1],pro2.result[2],d[1],d[2],d[3],site3);
	String re="";
	if(pro3.result[2]!="")  re=pro3.result[2];
	else re=turn_two(pro3.result[0],pro3.result[1]);
	String[] arr = {"("+a[0]+site1+b[0]+site2+c[0]+")"+site3+d[0]+"=",re};
    return arr;	
}//(a+b*c)+d


public String[] struct6_1(String[] a,String[] b,String[]c,String[] d,String site1,String site2,String site3) {
	operator_structure pro1=new operator_structure(b[1],b[2],b[3],c[1],c[2],c[3],site2);
	operator_structure pro2=new operator_structure(pro1.result[0],pro1.result[1],pro1.result[2],d[1],d[2],d[3],site3);
	operator_structure pro3=new operator_structure(a[1],a[2],a[3],pro2.result[0],pro2.result[1],pro2.result[2],site1);
	String re="";
	if(pro3.result[2]!="")  re=pro3.result[2];
	else re=turn_two(pro3.result[0],pro3.result[1]);
	String[] arr = {a[0]+site1+"("+b[0]+site2+c[0]+site3+d[0]+")"+"=",re};
    return arr;	
}//a+(b+c+d)
public String[] struct6_2(String[] a,String[] b,String[]c,String[] d,String site1,String site2,String site3) {
	operator_structure pro1=new operator_structure(c[1],c[2],c[3],d[1],d[2],d[3],site3);
	operator_structure pro2=new operator_structure(b[1],b[2],b[3],pro1.result[0],pro1.result[1],pro1.result[2],site2);
	operator_structure pro3=new operator_structure(a[1],a[2],a[3],pro2.result[0],pro2.result[1],pro2.result[2],site1);
	String re="";
	if(pro3.result[2]!="")  re=pro3.result[2];
	else re=turn_two(pro3.result[0],pro3.result[1]);
	String[] arr = {a[0]+site1+"("+b[0]+site2+c[0]+site3+d[0]+")"+"=",re};
    return arr;	
}//a+(b+c*d)


public String[] struct7(String[] a,String[] b,String[]c,String[] d,String site1,String site2,String site3) {
	operator_structure pro1=new operator_structure(a[1],a[2],a[3],b[1],b[2],b[3],site1);
	operator_structure pro2=new operator_structure(c[1],c[2],c[3],d[1],d[2],d[3],site3);
	operator_structure pro3=new operator_structure(pro1.result[0],pro1.result[1],pro1.result[2],pro2.result[0],pro2.result[1],pro2.result[2],site2);
	String re="";
	if(pro3.result[2]!="")  re=pro3.result[2];
	else re=turn_two(pro3.result[0],pro3.result[1]);
	String[] arr = {"("+a[0]+site1+b[0]+")"+site2+"("+c[0]+site3+d[0]+")"+"=",re};
    return arr;	
}//(a+b)+(c+d)


public String[] struct8_1(String[] a,String[] b,String[]c,String[] d,String site1,String site2,String site3) {
	operator_structure pro1=new operator_structure(a[1],a[2],a[3],b[1],b[2],b[3],site1);
	operator_structure pro2=new operator_structure(pro1.result[0],pro1.result[1],pro1.result[2],c[1],c[2],c[3],site2);
	String re="";
	if(pro2.result[2]!="")  re=pro2.result[2];
	else re=turn_two(pro2.result[0],pro2.result[1]);
	String[] arr = {a[0]+site1+b[0]+site2+c[0]+"=",re};
    return arr;	
}//a+b+c
public String[] struct8_2(String[] a,String[] b,String[]c,String[] d,String site1,String site2,String site3) {
	operator_structure pro1=new operator_structure(b[1],b[2],b[3],c[1],c[2],c[3],site2);
	operator_structure pro2=new operator_structure(a[1],a[2],a[3],pro1.result[0],pro1.result[1],pro1.result[2],site1);
	String re="";
	if(pro2.result[2]!="")  re=pro2.result[2];
	else re=turn_two(pro2.result[0],pro2.result[1]);
	String[] arr = {a[0]+site1+b[0]+site2+c[0]+"=",re};
    return arr;	
}//a+b*c


public String[] struct9(String[] a,String[] b,String[]c,String[] d,String site1,String site2,String site3) {
	operator_structure pro1=new operator_structure(a[1],a[2],a[3],b[1],b[2],b[3],site1);
	operator_structure pro2=new operator_structure(pro1.result[0],pro1.result[1],pro1.result[2],c[1],c[2],c[3],site2);
	String re="";
	if(pro2.result[2]!="")  re=pro2.result[2];
	else re=turn_two(pro2.result[0],pro2.result[1]);
	String[] arr = {"("+a[0]+site1+b[0]+")"+site2+c[0]+"=",re};
    return arr;	
}//(a+b)+c

public String[] struct10(String[] a,String[] b,String[]c,String[] d,String site1,String site2,String site3) {
	operator_structure pro1=new operator_structure(b[1],b[2],b[3],c[1],c[2],c[3],site2);
	operator_structure pro2=new operator_structure(a[1],a[2],a[3],pro1.result[0],pro1.result[1],pro1.result[2],site1);
	String re="";
	if(pro2.result[2]!="")  re=pro2.result[2];
	else re=turn_two(pro2.result[0],pro2.result[1]);
	String[] arr = {a[0]+site1+"("+b[0]+site2+c[0]+")"+"=",re};
    return arr;	
}//a+(b+c)

public String[] struct11(String[] a,String[] b,String[]c,String[] d,String site1,String site2,String site3) {
	operator_structure pro1=new operator_structure(a[1],a[2],a[3],b[1],b[2],b[3],site1);
	String re="";
	if(pro1.result[2]!="")  re=pro1.result[2];
	else re=turn_two(pro1.result[0],pro1.result[1]);
	String[] arr = {a[0]+site1+b[0]+"=",re};
    return arr;	
}//a+b

//保证结果可以用真分数表示
public String turn_two(String up,String down) {
	String arr;	
	int up1=Integer.parseInt(up);
	int down1=Integer.parseInt(down);
	if(up1<down1)
	{arr=up+"/"+down;}
	else
	{int a=up1/down1;int b=up1%down1;
	String a1= String.valueOf(a);
	String b1= String.valueOf(b);
	arr=a1+"'"+b1+"/"+down;
	}	
	 return arr;
}
}
