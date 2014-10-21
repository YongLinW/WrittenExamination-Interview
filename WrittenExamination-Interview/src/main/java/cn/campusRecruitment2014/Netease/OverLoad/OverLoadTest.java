package cn.campusRecruitment2014.Netease.OverLoad;

/**
 * 
 *@explanation 关于重载中，参数char、int、long、String的自动转换
 *@author YongLin
 *@email  yonglin@hengtiansoft.com
 *@time   2014年10月21日下午3:07:32
 */

/*
 * 重载overload与重写的区别
 * 其中，overload的参数类型为char、int、long、float、double自动转换
 */
public class OverLoadTest {

	public void print(char c){
		System.out.println("Print char: " + c);
	}
	
	public void print(int i){
		System.out.println("Print int: " + i);
	}
	
	public void print(double d){
		System.out.println("Print double: " + d);
	}
	
	public void print (long l){
		System.out.println("Print long: " + l);
	}
	
	public void print (String s){
		System.out.println("Print String: " + s);
	}
}
