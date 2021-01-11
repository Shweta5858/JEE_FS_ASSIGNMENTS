package com.cg.arrays.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class SecondSmallest {

	private SecSmallest secsmallest;
	private static int  SINGLE_NUMBER=100;
	public void setup() {
		secsmallest=new SecSmallest();
	}
	@Test
	public void test_getSecondSmallest_GivenEmptyIntegerArray_ShouldReturn0AsInteger() {
		int newNumbers[]= {};
		int result=SecSmallest.getSecondSmallest(newNumbers);
		assertEquals(0,result);	
	}
	public void test_getSecondSmallest_GivenTwoIntegerArray_ShouldReturn0AsInteger() {
		int newNumbers[]= {1,2};
		int result=SecSmallest.getSecondSmallest(newNumbers);
		assertEquals(2,result);	
	}
	public void test_getSecondSmallest_GivenWrongIntegerArray_ShouldReturn0AsInteger() {
		int newNumbers[]= {1,8};
		int result=SecSmallest.getSecondSmallest(newNumbers);
		assertEquals(1,result);	
	}
}
