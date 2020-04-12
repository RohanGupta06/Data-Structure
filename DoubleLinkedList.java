class DoubleLinkedList
{
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node prev;
		public Node(int data)
		{
			this.data = data;
		}
	}
	public static void main(String args[])
	{
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		obj.head.next=second;
		obj.head.prev = null;
		second.next = third;
		second.prev = obj.head;
		third.next = null;
		third.prev = second;
	}
}