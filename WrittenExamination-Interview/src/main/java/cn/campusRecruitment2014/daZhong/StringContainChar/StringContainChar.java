package cn.campusRecruitment2014.daZhong.StringContainChar;

import java.util.HashMap;

/**
 * 
 *@explanation 字符串是否包含其他字符
 *@author YongLin
 *@email  yonglin@hengtiansoft.com
 *@time   2014年11月5日下午7:42:27
 */

/*
 * 本题为2014年大众点评校园招聘第二次笔试题一
 * 给定字符串strA，strB，判断strA中是否完全包含strB中的所有字符
 * 举例：strA = “linyong”，strB=“gl”,则strA包含strB
 */
public class StringContainChar {

	public static void main(String[] args) {
		StringContainChar stringContainChar = new StringContainChar();
		String strA = "linyong";
		String strB = "la";
		boolean isContain = stringContainChar.isContain(strA, strB);
		System.out.println("是否包含？ " + isContain);
	}
	
	public boolean isContain(String strA, String strB){
		HashMap<Character, Character> charMap = new HashMap<Character, Character>();
		for(int i = 0; i < strA.length(); i ++){
			Character c = strA.charAt(i);
			charMap.put(c, c);
		}
		boolean isContain = false;
		for(int j = 0; j < strB.length(); j ++){
			if(!charMap.containsKey(strB.charAt(j))){
				isContain = false;
				break;
			}
			else{
				isContain = true;
			}
		}
		return isContain;
	}

}
