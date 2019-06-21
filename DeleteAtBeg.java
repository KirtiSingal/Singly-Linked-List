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
	public static void delete(){
		Node temp = Node.head;
		Node.head = Node.head.next;
		temp=null;
	}
}
class DeleteAtBeg{
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
		while(ans==1);
	}
}