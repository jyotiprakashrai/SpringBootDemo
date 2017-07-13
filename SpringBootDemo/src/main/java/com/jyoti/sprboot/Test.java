package com.jyoti.sprboot;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		double[] CN={14,25,80,36,14,56,23,14};
		double point=14;
		
		getErrors(CN, point);
		
		System.out.println(getErrors(CN, point));
	}
	
	

	public static ArrayList<Integer> getErrors(double[] CN,double point){
		 ArrayList<Integer> indexList = new ArrayList<Integer>();
		 for (int i = 0; i < CN.length; i++){
			 if(CN[i]==point)
			 indexList.add(i); 
		 }
		
		return indexList;
		
	}

}
