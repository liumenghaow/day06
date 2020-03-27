package com.lmh.common.utils;

import java.util.Date;
import java.util.Random;

public class DateUtil {
	public static Date randomDate(Date startDat,Date endDate) {
		long t1 = startDat.getTime();//1970年到starDate的毫秒数
		long t2 = endDate.getTime();//1970年到endDate的毫秒数
		if(t2<t1) {
			throw new RuntimeException("开始日期不能大于结束日期");
		}
		
		
		//随机产生在t1和t2之间的毫秒数
		double random = Math.random();
		long t=(long)((random*(t2-t1)+t1));
		
		
		
		return new Date(t);
	}
}
