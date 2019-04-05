class TmpMain{
	public static void main(String args[]){
		MyStack<Integer> stack = new MyStack<Integer>();
		stack.push(5);
		stack.push(7);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.empty());
		System.out.println(stack.search(7));
		System.out.println(stack.pop());
		System.out.println(stack.empty());
	}	
}
