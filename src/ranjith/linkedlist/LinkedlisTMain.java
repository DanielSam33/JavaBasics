package ranjith.linkedlist;

public class LinkedlisTMain {
	
	
	public static void main(String[] args) {
		Linked_list_Method a=new Linked_list_Method();
		a.Insert(10);
		a.Insert(20);
		a.Insert(30);
		a.Insert(40);
		a.Display(); 
		System.out.print("\n-------\n");
		a.InsertAtBeginning(90);
		a.Display();
		System.out.println("\n-------");//insert at beginning
		a.InsertBeginning(100);
		a.Display();
		System.out.print("\n-------\n");
		a.InsertAtPosition(3, 70);
		a.Display();
//		a.InsertAtPosition(3, 80);
//		a.Display();
	}
	
}
