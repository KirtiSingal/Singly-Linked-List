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
	public static void delete(){
		Node temp =Node.head;
		Node temp2 = Node.head;
		while(temp.next!=null){
			temp2=temp;
			temp=temp.next;
		}
		temp2.next=null;
		temp=null;
	}
}
class DeleteAtEnd{
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
		do{
			Operations.delete();
			System.out.print("Link list : ");	
			Operations.traverse();	
			if(Node.head==null){
				System.out.println("Node List is empty");
				ans=0;
			}
			else{
				System.out.print("Do you want to delete more (0/1)?");
				ans = Integer.parseInt(sc.nextLine());
			}
		}	
		while(answer==1);
	}
}