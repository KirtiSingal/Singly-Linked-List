import java.util.*;
class Node{
	int data;
	Node next;
	static Node head;
}

class Operations{
	public static void insert(int x,int pos){
		Node node=new Node();
		node.data=x;
		if(pos==0){
			node.next=Node.head;
			Node.head=node;
		}
		else{
			Node temp=Node.head;
			for(int i=0;i<pos-1;i++){
				temp=temp.next;
			}	
			node.next=temp.next;
			temp.next=node;
		}
	}
	public static void traverse(){
		Node temp = Node.head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}	
	}	
}
class InsertAtNth{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Node.head=null;
		int answer;
		do{
			System.out.print("Enter the position : ");	
			int n = Integer.parseInt(sc.nextLine());
			System.out.print("Enter element : ");
			int x=Integer.parseInt(sc.nextLine());
			Operations.insert(x,n-1);	
			System.out.print("Do you want to insert more (0/1)?");
			answer = Integer.parseInt(sc.nextLine());
		}
		while(answer==1);
		System.out.print("Link List :");
		Operations.traverse();
	}	
}