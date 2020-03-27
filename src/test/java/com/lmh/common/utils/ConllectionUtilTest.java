package com.lmh.common.utils;

import java.util.ArrayList;

import org.junit.Test;

public class ConllectionUtilTest {

	@Test
	public void testIsEmpty() {
		ArrayList<Object> list = new ArrayList<Object>();
		list.add("adasd");
		System.out.println(ConllectionUtil.isEmpty(list));
		
	}

}
