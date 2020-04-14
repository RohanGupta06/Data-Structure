class Stack
{
	static final int MAX = 1000;
	int top;
	int arr[] = new int[MAX];
	Stack()
	{ 
		top = -1;
	}
	boolean isEmpty()
	{
		return (top < 0);
	}
	boolean push(int x)
	{
		if(top>=(MAX-1))
		{
			System.out.println("Stack Overflow");
			return false;
		}
		else
		{
			top=top+1;
			arr[top]=x;
			System.out.println(x+" pushed in Stack");
			return true;
		}
	}
	int pop()
	{
		if(top<0)
		{
			System.out.println("Stack Undeflow");
			return 0;
		}
		else
		{
			int x = arr[top];
			top = top -1;
			return x;
		}
	}
	int peek()
	{
		if(top<0)
		{
			System.out.println("Stack empty");
			return 0;
		}
		else
		{
			return (arr[top]);
		}
	}
	public static void main(String args[])
	{
		Stack obj = new Stack();
		obj.peek();
		obj.push(0);
		obj.push(1);
		obj.push(2);
		obj.pop();
		System.out.println("top element on the stack  "+obj.peek());
	}
}

