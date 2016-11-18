package gw2;

import java.util.Iterator;

public class charecter_vault_linkedlist<E> {
	String info = null;
	private node head;
	private int N;

	
	//nested class node
	private class node{
		public E item;//so this takes the item and initiallizes it
		public node next;//this initializes the node
		
		public node(){
			item = null;//if someone does not put an input this is what they will get
			next = null;
		}
		
		public node(E e, node ptr){//here is the proper input into node, when they creat a node
			item =e;
		 next = ptr;
		}
		
		
		//now we make the iterator class which basically is just a way to go down the list
		private class list_it{
			private node current;//appraently whenever you make a list iterator you should always involve some variable that represents current
			
			
			public void list_iterator(){
				//no idea what this does exactly
				current  = head;
			}
			
			public boolean hasNext(){
				return( current != null);
			}
			
			
			public E next(){
				E ret = current.item;
				current = current.next;
				return ret;
			}
			
		}
			
	
			
			
			
			
			
			
		
	}
	
}
