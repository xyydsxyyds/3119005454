package CJX;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		System.out.println("请输入3个参数");
		Scanner sc=new Scanner(System.in);
		String A=sc.nextLine();
		String B=sc.nextLine();
		String C=sc.nextLine();
		Txt_reading_writting txt=new Txt_reading_writting();	
		
		String str1=txt.read(A);
		String str2=txt.read(B);
		
		Simhash_bulit sim=new Simhash_bulit();
		String sim1=sim.simhash_bulit(str1);
		String sim2=sim.simhash_bulit(str2);
		
		Distance_getting rate=new Distance_getting();
		double str3=rate.distance_getting(sim1,sim2);
				
		txt.write(str3, C);
		sc.close();	
	}

}
