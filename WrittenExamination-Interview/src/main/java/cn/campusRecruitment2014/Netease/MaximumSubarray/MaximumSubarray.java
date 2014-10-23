package cn.campusRecruitment2014.Netease.MaximumSubarray;

/**
 * 
 * @explanation 求解给定int型数组的最大子串
 * @author YongLin
 * @email yonglin@hengtiansoft.com
 * @time 2014年10月20日下午3:04:06
 */

/*
 * 本题目为2014年网易校园招聘面试算法编程题目 给定一个int型数组，其中的元素包含正数以及负数，求解其中连续元素子串中元素之和最大的子串
 * 举例：array = {−2, 1, −3, 4, −1, 2, 1, −5, 4} 其中最大子串为{4，-1，2，1},其和为6
 */
public class MaximumSubarray {

	public static void main(String[] args) {
		int[] data = {31,-41,59,26,-53,58,97,-93,-23,84};
		maxSubarray(data, data.length);
	}

	public static void maxSubarray(int[] data, int length) {
		int start = 0, end = 0, max = 0, curSum = 0;
		boolean ifS = false, mayContain = false;
		for (int i = 0; i < length; i++) {
			/**
			 * 找到第一个元素 > 0 的位置，设置当前值为最大值以及当前和
			 */
			if (ifS == false && data[i] > 0) {
				ifS = mayContain = true;
				max = curSum = data[i];
				start = end = i;
			}
			/**
			 * 找到第一个 > 0的元素之后
			 */
			else {
				if (mayContain == true && data[i] < 0) {
					if (data[i] + curSum >= 0) {
						curSum += data[i];
						mayContain = true;
					} else if (data[i] + curSum < 0) {
						mayContain = false;	
					}
				} else if (mayContain == true && data[i] > 0) {
					curSum += data[i];
					mayContain = true;
					if(curSum > max){
						max = curSum;
						end = i;
					}
				} else if (mayContain == false && data[i] < 0) {
					mayContain = false;
				} else if (mayContain == false && data[i] > 0) {
					if (data[i] >= max) {
						max = curSum = data[i];
						mayContain = true;
						start = end = i;
					} else if (data[i] < max) {
						curSum = data[i];
						mayContain = true;
					}
				}
			}
		}
		System.out.println("Max subarray = " + max + "; Position from " + start + " to " + end);
	}
}
