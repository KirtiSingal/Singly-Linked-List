import java.util.*;
class Node{
	int num;
	Node next;
	static Node head;
}
class Operations{
	public static Node insert(int x)
	{
		Node node = new Node();
		node.num=x;
		node.next=Node.head;
		return node;
	}
	public static void traverse(){
		Node t=Node.head;
		while(t!=null){
			System.out.print(t.num+"  ");
			t=t.next;
		}					
	}
}
class InsertAtBeg{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		Node.head=null;
		int ans;
		do{
			System.out.print("Enter a value to insert : ");
			int x= Integer.parseInt(sc.nextLine());
			Node.head=Operations.insert(x);
			System.out.print("Do you want to insert more (0/1)?");
			ans = Integer.parseInt(sc.nextLine());
		}
		while(ans==1);	
		System.out.print("Link list : ");	
		Operations.traverse();		
	}
}