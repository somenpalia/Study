
public class QuickSortLinkedList {
	Node head;
	static int count = 0;
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}//Node
	
	public static void main(String[] args) {
		QuickSortLinkedList ll = new QuickSortLinkedList();
		ll.head = new Node(5);
		//5 6 7 0
		Node second = new Node(8);
		Node third= new Node(4);
		Node fourth = new Node(0);
		
		ll.head.next = second;
		second.next = third;
		third.next = fourth;
		
		ll.printList(ll.head);
		
		ll.quickSort(ll.head);
		
		ll.printList(ll.head);
		
	}//main

	private void quickSort(Node head) {
		System.out.println("called times : " + (++count));
		
		//if(low<high){
		if(head.next!=null){
			
			//int pi = partition(arr,low,high);
			Node pi = partition(head);
			System.out.println("pi : " + pi.data);
			
			QuickSortLinkedList llLeft = new QuickSortLinkedList();
			QuickSortLinkedList llRight = new QuickSortLinkedList();
		    
			llLeft.head = head;
			Node tempLeft = llLeft.head;
			Node prevLeft = null;
			
			llRight.head = pi.next;
			boolean first = true;
			while(true){
				if(first){
					llLeft.head.next = null;
					break;
				}
				
				if(tempLeft == pi){
					prevLeft.next = null;
					break;
				}
				first = false;
				prevLeft = tempLeft;
				tempLeft = tempLeft.next;
			}
			System.out.println();
			
			System.out.print("llLeft : ");
			llRight.printList(llLeft.head);
			
			System.out.println("pi.data : " + pi.data);
			System.out.print("llRight : ");
			
			llRight.printList(llRight.head);
			
			quickSort(llLeft.head);
			quickSort(llRight.head);
			
			Node temp2 = llLeft.head;
			while(temp2.next!=null){
				System.out.println("llLeft data " + temp2.data);
				temp2 = temp2.next;
			}
			System.out.print("llLeft : ");
			llRight.printList(llLeft.head);
			System.out.println("pi.data : " + pi.data);
			System.out.print("llRight : ");
			llRight.printList(llRight.head);
			temp2.next = pi;
			pi.next = llRight.head;
			
			head = llLeft.head;
			System.out.println();
		}	
		
	}//quickSort
	
	private Node partition(Node head){
		System.out.println("In partition");
		Node low = head;
		Node high = null;
		Node temp = head;
		
		while(temp.next!=null){
			temp = temp.next;
		}
		high = temp;
		System.out.println("high.data : " + high.data);
		
		Node pivot = high;
		temp = low;
		Node i = new Node(-1);
		i.next = head;
		
//		for (int j = low; j < high; j++) {
		while(temp!=high){
			
			//if(arr[i]<=pivot){
			if(temp.data<=pivot.data){
				i = i.next;
				//swap(arr,i,j);
				swap(temp,i);
			}
			temp = temp.next;
		}//for
		swap(i.next,high);
		printList(head);
		return i.next;
		
	}
	
	
	private void swap( Node j, Node i) {
		int temp= j.data;
		j.data = i.data;
		i.data = temp;
		
		
	}

	private static void printList(Node head) {
		
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}
