class CircularLinkedList
{
	Node head;
	static class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data = data;
		}
	}
	public void PrintList()
	{
		Node n = head;
		do{  
			System.out.println(n.data+" ");
			n=n.next;
			
		}while(n!=head);  
	}	
	public static void main(String args[])
	{
		CircularLinkedList l1 = new CircularLinkedList();
		l1.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		l1.head.next = second;
		second.next = third;
		third.next = l1.head;
		l1.PrintList();
	}
}
		