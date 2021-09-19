package CJX;
import org.junit.jupiter.api.Test;

class Main_Test {
	 @Test
	    public void Main_test1() {
		 Txt_reading_writting txt=new Txt_reading_writting();	
			
			String str1=txt.read("E:\\测试文本\\orig.txt");
			String str2=txt.read("E:\\测试文本\\orig_0.8_add.txt");
			
			Simhash_bulit sim=new Simhash_bulit();
			String sim1=sim.simhash_bulit(str1);
			String sim2=sim.simhash_bulit(str2);
			
			Distance_getting rate=new Distance_getting();
			double str3=rate.distance_getting(sim1,sim2);
			
			System.out.println(str3);
	    }

	    @Test
	    public void Main_test2() {
            Txt_reading_writting txt=new Txt_reading_writting();	
			
			String str1=txt.read("E:\\测试文本\\orig.txt");
			String str2=txt.read("E:\\测试文本\\orig_0.8_del.txt");
			
			Simhash_bulit sim=new Simhash_bulit();
			String sim1=sim.simhash_bulit(str1);
			String sim2=sim.simhash_bulit(str2);
			
			Distance_getting rate=new Distance_getting();
			double str3=rate.distance_getting(sim1,sim2);
			
			System.out.println(str3);
	    }

	    @Test
	    public void Main_test3() {
            Txt_reading_writting txt=new Txt_reading_writting();	
			
			String str1=txt.read("E:\\测试文本\\orig.txt");
			String str2=txt.read("E:\\测试文本\\orig_0.8_dis_1.txt");
			
			Simhash_bulit sim=new Simhash_bulit();
			String sim1=sim.simhash_bulit(str1);
			String sim2=sim.simhash_bulit(str2);
			
			Distance_getting rate=new Distance_getting();
			double str3=rate.distance_getting(sim1,sim2);
			
			System.out.println(str3);
	    }

	    @Test
	    public void Main_test4() {
            Txt_reading_writting txt=new Txt_reading_writting();	
			
			String str1=txt.read("E:\\测试文本\\orig.txt");
			String str2=txt.read("E:\\测试文本\\orig_0.8_dis_10.txt");
			
			Simhash_bulit sim=new Simhash_bulit();
			String sim1=sim.simhash_bulit(str1);
			String sim2=sim.simhash_bulit(str2);
			
			Distance_getting rate=new Distance_getting();
			double str3=rate.distance_getting(sim1,sim2);
			
			System.out.println(str3);
	    }

	    @Test
	    public void Main_test5() {
            Txt_reading_writting txt=new Txt_reading_writting();	
			
			String str1=txt.read("E:\\测试文本\\orig.txt");
			String str2=txt.read("E:\\测试文本\\orig_0.8_dis_15.txt");
			
			Simhash_bulit sim=new Simhash_bulit();
			String sim1=sim.simhash_bulit(str1);
			String sim2=sim.simhash_bulit(str2);
			
			Distance_getting rate=new Distance_getting();
			double str3=rate.distance_getting(sim1,sim2);
			
			System.out.println(str3);
	    }
	}
