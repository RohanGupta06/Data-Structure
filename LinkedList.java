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
	public static void main(String args[])
	{
		LinkedList obj1 = new LinkedList();
		obj1.head = new Node(1);
		Node second = new Node(3);
		Node third = new Node(5);
		obj1.head.Link=second;
		second.Link=third;
		obj1.pushInFront(0);
		obj1.PrintList();
	}
}