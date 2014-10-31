package cn.campusRecruitment2014.xiecheng.MinCoinNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 
 * @explanation 寻找最少的银币数
 * @author YongLin
 * @email yonglin@hengtiansoft.com
 * @time 2014年10月31日下午2:16:39
 */

/*
 * 本题为2014年携程校园招聘笔试题二 给定一些不同面值的硬币，其面值保存在数组int array[]中, 给定一个数值X
 * 编程实现，使用最少数目的硬币（相同的面值可以重复使用）能够拼凑出X，返回该最少硬币数，如果不存在返回-1
 */
public class MinCoinNumber {

	public static void main(String[] args) {
		int[] array = { 5, 1, 20, 2, 10, 100 };
		int X = 249;
		int minCoin = new MinCoinNumber().minCoinNumber(array, X);
		System.out.println("min coin number is " + minCoin);
	}

	public int minCoinNumber(int[] array, int X) {
		int coinCount = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}

		/**
		 * 排序 -- 从大到小
		 */
		Collections.sort(list, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		});
		
		for (Integer i : list) {
			coinCount += X / i;
			X = X % i;
		}
		
		if(X == 0){
			return coinCount;
		}else{
			return -1;
		}
	}
}
