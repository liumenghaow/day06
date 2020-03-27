package com.lmh.common.utils;

import java.util.Collection;

public class ConllectionUtil {

	public static boolean isEmpty(Collection<?> collection) {
		//return collection==null || collection.isEmpty();
		return collection==null || collection.size()>0;
		
	}
}
