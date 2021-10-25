package operations_created;
import org.junit.jupiter.api.Test;
//测试是否可以产生题目
class topic_structure_test {
	@Test
	void test8() {
		topic_structure a=new topic_structure(10);
		for(String b:a.result)
			System.out.println(b);
	}	
	@Test
	void test9() {
		topic_structure a=new topic_structure(100);
		for(String b:a.result)
			System.out.println(b);
	}	
	@Test
	void test10() {
		topic_structure a=new topic_structure(1000);
		for(String b:a.result)
			System.out.println(b);
	}	
}

