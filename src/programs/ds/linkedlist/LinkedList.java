package programs.ds.linkedlist;

public class LinkedList {
	
	Node head;
	

	
	
	public static void main(String[] args) {
		
		LinkedList list= new LinkedList();
		
		
		
		list.insert(10);		
		list.insert(20);
		list.insert(22);
		
		
		//list.delete();
		
		
		
		
		list.print();
		
		list.printInReverse(list.head);
		
		
		
		
		
	}
	
	
	public void print() {
		
		Node n=head;
		while(n!=null) {
		   System.out.println(n.data);
		   n=n.next;		
			
		}
		
	}
	
	public void insert(Object data) {		
		
		Node n = new Node(data);
		n.next=head;
		head=n;		
		
	}
	
	
	public void delete() {
		
		if(head!=null)
		   head=head.next;
		
	}
	
	
	public boolean delete(Object key) { //returns true if found and deleted
		
		
		if(head==null)
			return false;
		
		if(head.data!=null && head.data.equals(key)) { //if head has to be deleted
			head=head.next;
		}
			
	
		Node curr=head;
		Node prev=null;  
		
		while(curr!=null && !curr.data.equals(key)) {
			prev=curr;
			curr=curr.next;			
		}
		
		if(curr==null)
			return false;
			
		
		prev.next=curr.next;
		
		return true;
		
	}
	
	
	public boolean insertafter(Object key) {
		
		
		
		return false;
	}
	
	
public boolean insertBefore(Object key) {		
		
		return false;
	}
	
	
	
	
	public boolean isEmpty() {
		if(head==null) 
			return true;
		else
			return true;
		
	}
	
	

	
	
	
	private class Node{		
		
		Object data;
		Node next;	
		
		Node(Object data){
			this.data=data;			
		}
		
		
	}
	
	
	
	public void printInReverse(Node head) {
		
				
		if(head==null)
			return;
		
		printInReverse(head.next);
		
		System.out.println(head.data);
		
	}
		

}











