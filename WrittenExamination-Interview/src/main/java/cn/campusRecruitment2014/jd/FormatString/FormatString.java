package cn.campusRecruitment2014.jd.FormatString;

/**
 * 
 * @explanation 格式化字符串
 * @author YongLin
 * @email linyongw@gmail.com
 * @time 2014年10月20日下午2:41:12
 */

/*
 * 本题为2014年京东校园招聘笔试题中编程题一
 * 规则去除字符串头尾的空格字符，两个单词中间的空格字符只保留一个，要求不增加额外的空间，
 * 举例：字符串"   I     am a     little boy.   "，经过格式化后为“I am a little boy.”
 * 给定的C语言函数模型为public void formatString(char[] str, int length){}
 * 本题实现了两种方式，其中方法二的效率高于方法一
 */
public class FormatString {
	public static void main(String args[]) {
		char[] str = "   I     am a     little boy.   ".toCharArray();
		FormatString fs = new FormatString();
		System.out.println("---方法一---");
		fs.formatStringOne(str, str.length);
		
		System.out.println("\n");
		System.out.println("---方法二---");
		fs.formatStringTwo(str, str.length);
	}

	/**
	 * 以下为方法一
	 * 
	 * @param str
	 * @param length
	 */
	public void formatStringOne(char[] str, int length) {
		boolean isWord = false;
		int start = 0, end = 0, wordCount = 0;
		for (int i = 0; i < length; i++) {
			if (str[i] != ' ' && isWord == false) {
				isWord = true;
				start = i;
			} else if (str[i] == ' ' && isWord == true) {
				isWord = false;
				end = i - 1;
				if (wordCount > 0) {
					System.out.print(' ');
				}
				for (int j = start; j <= end; j++) {
					System.out.print(str[j]);
				}
				wordCount++;
			}
		}
	}

	/**
	 * 以下为方法二
	 * @param str
	 * @param length
	 */
	public void formatStringTwo(char[] str, int length) {
		boolean isWord = false;
		int wordCount = 0;
		for (int i = 0; i < length; i++) {
			if (str[i] != ' ' && isWord == false) {
				isWord = true;
				if (wordCount > 0) {
					System.out.print(' ');
				}
				wordCount++;
				System.out.print(str[i]);
			} else if (str[i] == ' ' && isWord == true) {
				isWord = false;
			} else if (str[i] != ' ' && isWord == true) {
				System.out.print(str[i]);
			}
		}
	}
}
