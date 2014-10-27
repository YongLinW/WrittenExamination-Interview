package cn.campusRecruitment2014.jd.stackToStack;

/**
 * 
 * @explanation 无序栈到有序栈整数排序
 * @author YongLin
 * @email yonglin@hengtiansoft.com
 * @time 2014年10月27日下午8:40:11
 */

/*
 * 本题为2014年京东面试算法题 题目描述：给定两个栈A、栈B，其中栈A中存放无序的数值
 * 编写算法实现把栈A中的数值转移到栈B中，最终使栈B中的数值有序(从栈顶至栈底为从小到大)，要求只能申请2~3个变量
 */
public class StackToStack {

	public static void main(String[] args) {
		Stack AStack = new Stack();
		Stack BStack = new Stack();

		AStack.push(2);
		AStack.push(4);
		AStack.push(1);
		AStack.push(5);
		AStack.push(3);
		AStack.push(6);
		AStack.push(-1);
		AStack.push(7);
		
		StackToStack stackToStack = new StackToStack();
		BStack = stackToStack.orderlyConvert(AStack);

		System.out.println("从栈顶至栈底元素(由小到大)分别是：");
		while(BStack.isEmpty() == false){
			System.out.println(((Integer)BStack.pop()).intValue());
		}
	}

	public Stack orderlyConvert(Stack stack) {
		Stack result = new Stack(stack.size());
		while (stack.isEmpty() == false) {
			int count = 0;
			int v = (Integer) stack.pop();
			while (result.isEmpty() != true && (Integer) result.peek() < v ) {
				stack.push(result.pop());
				count++;
			}
			result.push(v);
			for (int i = 0; i < count; i++) {
				result.push(stack.pop());
			}
		}
		return result;
	}

}
