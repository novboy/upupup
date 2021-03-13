package com.edgora.Upupup;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.alibaba.fastjson.JSON;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavaBisicTests {

	@Test
	void testInteger() {
		Integer x = 3;
		Integer y = 3;
		System.out.println(x == y);// true
		Integer a = new Integer(3);
		Integer b = new Integer(3);
		System.out.println(a == b);// false
		System.out.println(a.equals(b));// true
	}

	@Test
	void testFloat() {
		Boolean b = Boolean.valueOf(true);
		Float m = new Float(1f) ;
		float a = 1.0f - 0.9f;
		float b = 0.9f - 0.8f;
		System.out.println(a);// 0.100000024
		System.out.println(b);// 0.099999964
		System.out.println(a == b);// false

	}

	@Test
	void testBig() {
		BigDecimal a = new BigDecimal("1.0");
		BigDecimal b = new BigDecimal("0.9");
		BigDecimal c = new BigDecimal("0.8");

		BigDecimal x = a.subtract(b);
		BigDecimal y = b.subtract(c);

		System.out.println(x); /* 0.1 */
		System.out.println(y); /* 0.1 */
	}

	@Test
	void testBigCompare() {
		BigDecimal a = new BigDecimal("1.0");
		BigDecimal b = new BigDecimal("0.9");
		System.out.println(a.compareTo(b));// 1
	}

	@Test
	void testArray() {
		String[] myArray = { "Apple", "Banana", "Orange" };
		List<String> myList = Arrays.asList(myArray);
		// 上面两个语句等价于下面一条语句
		List<String> myList1 = Arrays.asList("Apple", "Banana", "Orange");
		//myList1.add("abc");
		//myList.remove("Apple");
		myList1.clear();
		List list = new ArrayList<>(Arrays.asList("a", "b", "c"));

	}

	@Test
	void testBaicArrayList() {
		int[] myArray = { 1, 2, 3 };
		List myList = Arrays.asList(myArray);
		System.out.println(myList.size());// 1
		System.out.println(myList.get(0));// 数组地址值
		System.out.println(myList.get(1));// 报错：ArrayIndexOutOfBoundsException
		int[] array = (int[]) myList.get(0);
		System.out.println(array[0]);// 1
		//List<String> il = ImmutableList.of("string", "elements");  // from varargs
		// List<String> i1l = ImmutableList.copyOf(aStringArray);      // from array
		
	}
	@Test
	void toRealArray() {
		Integer[] myArray = { 1, 2, 3 };
		//List myList = Arrays.stream(myArray).collect(Collectors.toList());
		// 基本类型也可以实现转换（依赖boxed的装箱操作）
		int[] myArray2 = { 1, 2, 3 };
		List myList = Arrays.stream(myArray2).boxed().collect(Collectors.toList());
		System.out.println(JSON.toJSONString(List.of(myArray2)) );
	}
	@Test

	void testRevers(){
		String [] s= new String[]{
			"dog", "lazy", "a", "over", "jumps", "fox", "brown", "quick", "A"
		};
		List<String> list = Arrays.asList(s);
		Collections.reverse(list);
		s=list.toArray(new String[0]);//没有指定类型的话会报错
		System.out.println(JSON.toJSONString(s) );
	}
	@Test

	void boxTest() {
         
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        Long h = 2L;
		Byte bt = 1;
		Byte bt1 = 'a';
		Character ch = '0';
		Character ch1 = 65535;
         
        System.out.println(c==d);
        System.out.println(e==f);
        System.out.println(c==(a+b));
        System.out.println(c.equals(a+b));
        System.out.println(g==(a+b));
        System.out.println(g.equals(a+b));
        System.out.println(g.equals(a+h));
		String a  = "232";
		StringBuilder ab = new StringBuilder();
		StringBuffer ab = new StringBuffer();

    }

}
