package com.lmh.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		System.out.println(RandomUtil.random(1, 3));
	}

	@Test
	public void testSubRandom() {
		int[] x = RandomUtil.subRandom(1, 10, 3);
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}

	@Test
	public void testRandomCharacter() {
		char k = RandomUtil.randomCharacter();
		System.out.println(k);
	}

	@Test
	public void testRandomString() {
		System.out.println(RandomUtil.randomString(4));
	}

}
