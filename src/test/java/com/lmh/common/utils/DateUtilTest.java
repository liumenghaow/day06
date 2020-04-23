package com.lmh.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testRandomDate() {
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		c.set(2010, 0,1);
		
		for (int i = 0; i <100; i++) {
			Date date = DateUtil.randomDate(c.getTime(),new Date() );
			
			//System.out.println(df.format(date));
		}
		Date date=new Date(900000000000l);
		System.out.println(df.format(date));
	}
	@Test//月初
	public void testgetInitMonth() {
		Date date = DateUtil.getInitMonth(new Date(99999999999l));
		SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(s.format(date));
	}
	@Test//月末
	public void testgetEndMonth() {
		Date date = DateUtil.getEndMonth(new Date());
		SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(s.format(date));
	}
	@Test//计算年龄
	public void testgetAgeByBirthday() {
		Calendar calendar=Calendar.getInstance();
		calendar.set(2010, 2,20);
		int i=DateUtil.getAgeByBirthday(calendar.getTime());
		System.out.println(i);
	}

}
