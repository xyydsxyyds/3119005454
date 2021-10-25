package operations_created;
import org.junit.jupiter.api.Test;
//测试是否可以产生规定范围以内的数
class number_structure_test {
	@Test
	void test1() {
		int q=10;
		number_structure a=new number_structure(q)	;		
			System.out.println(a.result[0]);	
	}
	@Test
	void test2() {
		int q=100;
		number_structure a=new number_structure(q)	;
		System.out.println(a.result[0]);
	}
	@Test
	void test3() {
		int q=1000;
		number_structure a=new number_structure(q)	;
		System.out.println(a.result[0]);
	}
	@Test
	void test4() {
		int q=10000;
		number_structure a=new number_structure(q)	;
		System.out.println(a.result[0]);
	}
}
