package operations_created;
import org.junit.jupiter.api.Test;
//����С������ȥ������Ƿ����ָ���
class operations_created_test {
	@Test
//  1/5-2/5
	void test5() {
		operator_structure a=new operator_structure("1","5","","2","5",""," - ");			
			System.out.println(a.result[0]+"/"+a.result[1]);
	}
	@Test    
	//1-6/7
	void test6() {
		operator_structure a=new operator_structure("","","1","6","7",""," - ");	
		System.out.println(a.result[0]+"/"+a.result[1]);
	}
	@Test   
	//1-7
	void test7() {
		operator_structure a=new operator_structure("","","1","","","7"," - ");	
		System.out.println(a.result[2]);
	}
}
