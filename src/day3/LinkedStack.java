package day3;

import day3.LinkedStack.Linkable;

public class LinkedStack {
	static interface Linkable{
		public Linkable getNext();
		public void setNext(Linkable node);
	}
	
	Linkable head;
	
	public void push(Linkable node){}
	public Object pop(){
		return head;}
}

class LinkableInteger implements LinkedStack.Linkable{

	int i;
	public LinkableInteger(int i) {
		this.i = i;
	}
	
	LinkedStack.Linkable next;
	
	@Override
	public Linkable getNext() {
		// TODO Auto-generated method stub
		return next;
	}

	@Override
	public void setNext(Linkable node) {
		// TODO Auto-generated method stub
		next = node;
	}
	
}
