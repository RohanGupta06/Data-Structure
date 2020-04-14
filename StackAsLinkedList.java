class Stack
{
	Node head;
	static class Node
	{
		int data;
		Node Link;
	
		Node(int data)
		{
			this.data = data;
		}
	}
	boolean isEmpty()
	{
		if(head==null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void push(int x)
	{
		Node temp = head;
		if(temp==null)
		{
			head=new Node(x);
		}
		else
		{
			while(temp.Link!=null)
			{
				temp=temp.Link;
			}
			Node new_node = new Node(x);
			temp.Link = new_node;
		}
	
	}
	public void pop()
	{
		if(head==null)
		{
			System.out.println("Stack underflow");
			
		}
		else
		{
			Node temp = head;
			Node prev = head;
			temp=temp.Link;
			while(temp.Link!=null)
			{
				temp=temp.Link;
				prev=prev.Link;
			}
			prev.Link=null;
			System.out.println(temp.data + "poped ");
			
		}
	}
	public void peek()
	{
		Node temp = head;
		while(temp.Link!=null)
		{
			temp=temp.Link;
		}
		System.out.println(temp.data+"top element");
	}
	public static void main(String args[])
	{
		Stack s=new Stack();
		s.push(0);
		s.push(2);
		s.push(4);
		s.pop();
		s.peek();
	}
}
				