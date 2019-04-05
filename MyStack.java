class MyStack <T>{

	private Object[] stack = null;
	private int head = -1;

	private final static int CAPACITY = 10;

	public MyStack(){
		stack = new Object[CAPACITY];
	}

	public boolean empty(){
		return (head == -1);
	}

	public T peek(){
		return (T) stack[0];
	}

	public T pop(){
		T element = (T) stack[0]; 
		head--;
		return (T) element;
	}
	
	public void push(T element){
		if(head == stack.length-1){
			Object[] newStack = new Object[stack.length * 2];
			System.arraycopy(stack, 0, newStack, 0, stack.length-1 );
			stack = newStack;
		}

		head++;
		stack[head] = element;
	}

	public int search(T t){
		int index = -1;
		for(int i = 0; i < stack.length; i++)
			if(stack[i] == t)
				return ++i;
		return index;
	}

}
