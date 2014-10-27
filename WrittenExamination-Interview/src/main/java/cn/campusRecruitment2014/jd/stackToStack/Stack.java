package cn.campusRecruitment2014.jd.stackToStack;

public class Stack {

	/**
	 * 保存数值
	 */
	private Object[] contents;

	/**
	 * 标记下一个入栈的位置，同时表示栈的容量大小
	 */
	private int top;

	private int DEFAULT_CAPACITY = 10;

	public Stack() {
		contents = new Object[DEFAULT_CAPACITY];
		top = 0;
	}

	public Stack(int size) {
		contents = new Object[size];
		top = 0;
	}

	/**
	 * 获取栈大小
	 * 
	 * @return
	 */
	public int size() {
		return top;
	}

	/**
	 * 判断栈是否为空
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return (size() == 0);
	}

	/**
	 * 扩充容量大小
	 */
	public void expand() {
		Object[] large = new Object[size() * 2];
		for (int index = 0; index < size(); index++) {
			large[index] = contents[index];
		}
		contents = large;
	}

	/**
	 * 入栈
	 * 
	 * @param value
	 */
	public void push(Object value) {
		if (size() == contents.length) {
			expand();
		}
		contents[top]  = value;
		top ++;
	}

	/**
	 * 出栈
	 * 
	 * @return
	 */
	public Object pop() {
		if(isEmpty()){
			System.err.println("stack is empty!");
		}
		Object result = contents[top - 1];
		top --;
		return result;
	}

	/**
	 * 获取栈顶元素
	 * @return
	 */
	public Object peek(){
		Object result = null;
		if(isEmpty()){
			
		}else{
			result = contents[top - 1];
		}
		return result;
	}
}
