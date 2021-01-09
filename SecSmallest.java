package com.cg.arrays.util;

public class SecSmallest {

	public static void main(String[] args) {
		int[] arr=new int[] {1,2,3,4};
		int res=getSecondSmallest(arr);
		System.out.println("Second smallest number is:"+res);
	}
	
	static int getSecondSmallest(int[] array) {
		int temp,size;
		if(array.length==0) {
			return 0;
		}
		size=array.length;
		
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
			return array[4];
		
		
	}

}
