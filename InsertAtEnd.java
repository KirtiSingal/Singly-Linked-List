import java.util.*;
class Node{
	int data;
	Node next;
	static Node head;
}
class Operations{
	public static void insert(int x){
		Node node = new Node();
		node.data=x;
		node.next=null;
		Node temp= Node.head;
		if(temp==null){
			Node.head=node;
		}
		else{
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=node;
		}
	}
	public static void traverse(){
		Node temp=Node.head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
}
class InsertAtEnd{
	public static void main(String[] args){
		Node.head=null;
		int answer;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.print("Enter the element :");
			int n=Integer.parseInt(sc.nextLine());
			Operations.insert(n);
			System.out.print("Do you want to insert more (0/1)?");
			answer =Integer.parseInt(sc.nextLine());
		}
		while(answer==1);
		System.out.print("Link list : ");
		Operations.traverse();
	}
}