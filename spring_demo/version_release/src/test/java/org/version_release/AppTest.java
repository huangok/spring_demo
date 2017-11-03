package org.version_release;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {
	
	
	public AppTest() {
		ArrayList<String> list = new ArrayList<String>();
		
		LinkedList<String> link = new LinkedList<String>();
	}
	@Test
	public void testHashMap() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("asd", "asdqwq");
		map.get("asd");
	}
	@Test
	public void testHash() {
		String aastr="abc";
		int a=31;
		int b=55;
		// 0100
		//1000
		//0100||0111=0111
		//1011||1011=1011 100000
		a=a^b;
		System.out.println("1、："+a+"  "+(8<<2));
		b=a^b;
		a=a^b;
		System.out.println(aastr.hashCode());
		System.out.println(a+"  "+b);
		System.out.println('a'*31^100);
		
		
	}

}
