class LinkedList
{
	Node head; //head of list
	static class Node
	{
		int data;
		Node Link;
		Node(int data)   //constructor
		{
			this.data=data;
		}
	}
	public void PrintList() //print the elements
	{
		Node n = head;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.Link;
		}
	}
	public void pushInFront(int new_data)
	{
		Node n = new Node(new_data);  //new Node
		n.Link = head;
		head = n;
	}
	public void insertAfter(Node prev_node, int new_data)
	{
		if(prev_node == null)
		{
			System.out.println("You did something wrong");
		}
		Node new_node = new Node(new_data);
		new_node.Link = prev_node.Link;
		prev_node.Link = new_node;
	}
	public void append(int new_data)
	{
		Node new_node = new Node(new_data);
		if(head == null)
		{
			head = new Node(new_data);
		}
		Node temp = head;
		while(temp.Link!=null)
		{
			temp = temp.Link;
		}
		temp.Link = new_node;
	}
			
	public static void main(String args[])
	{
		LinkedList obj1 = new LinkedList();
		obj1.append(1);
		obj1.pushInFront(3);
		obj1.append(5);
		obj1.insertAfter(obj1.head.Link.Link,5);
		System.out.println("Linked List");
		obj1.PrintList();
	}
}