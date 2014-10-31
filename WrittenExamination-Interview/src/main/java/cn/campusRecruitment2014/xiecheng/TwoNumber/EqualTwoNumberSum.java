package cn.campusRecruitment2014.xiecheng.TwoNumber;

import java.util.HashMap;

/**
 * 
 * @explanation 从一个数值中找出两个数值之和为给定值的这两数
 * @author YongLin
 * @email yonglin@hengtiansoft.com
 * @time 2014年10月31日下午1:44:14
 */

/*
 * 本题为2014年携程校园招聘笔试题一 
 * 给定一个正整数数组array[]以及一个数X，编写程序找出数组的两个数使其之和等于X
 */
public class EqualTwoNumberSum {

	public static void main(String[] args){
		int[] array = {2, 1, 3, 7, 5, 4, 0, 11};
		int X = 20;
		
		EqualTwoNumberSum equalTwoNumberSum = new EqualTwoNumberSum();
		equalTwoNumberSum.findTwoNumber_2(array, X);
		
	}

	/**
	 * 时间复杂度O(n^2)
	 * @param array
	 * @param X
	 */
	public void findTwoNumber_1(int[] array, int X) {
		for(int i = 0; i < array.length; i ++){
			for(int j = i + 1; j < array.length; j ++){
				if(array[i] + array[j] == X){
					System.out.println("The two number are '" + array[i] + "' and '" + array[j] + "'");
				}
			}
		}
	}
	
	/**
	 * 时间复杂度为O(n)
	 * @param array
	 * @param X
	 */
	public void findTwoNumber_2(int[] array, int X){
		HashMap<Integer, Integer> intMap = new HashMap<Integer, Integer>();
		for(int i = 0; i < array.length; i ++){
			intMap.put(array[i], array[i]);
		}
		for(int i = 0; i < array.length; i ++){
			int Y = X - array[i];
			if(intMap.get(Y) != null){
				System.out.println("The two number are '" + array[i] + "' and '" + Y + "'");
			}
		}
	}
}
