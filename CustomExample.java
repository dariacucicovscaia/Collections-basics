package main;

import java.util.ArrayList;

import collections.SimpleList;

public class Application {
	public static void main(String[] args) {

		SimpleList sList = new SimpleList();
		sList.add(10);
		sList.add(20);
		sList.add(30);

		System.out.println("The list has " + sList.getLength() + " elements");

		sList.print();
	}
}

package collections;

import java.util.ArrayList;

public class SimpleList {

	// properties
	private int length;
	private Box first;
	private int value;

	// private data type
	private class Box {
		static int value;
		Box next;

		public static int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public Box getNext() {
			return next;
		}

		public void setNext(Box next) {
			this.next = next;
		}

		public Box(int value) {
			super();
			this.value = value;
		}

		public Box(Box next) {
			super();
			this.next = next;
		}

	

	}

	
	public SimpleList() {
		length = 0;
		first = null;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Box getFirst() {
		return first;
	}

	public void setFirst(Box first) {
		this.first = first;
	}

	public void add(int value) {
		Box current = first;
		if (length == 0) {
			first = new Box(value);
		} else {
			for (int i = 0; i < length - 1; i++) {
				current = current.next;
			}
			current.next = new Box(value);
		}
			length++;
	  
			}
	
	
	public void print() {
		for (int i = 0; i <length; i++) {
			System.out.println(Box.getValue());
		}
		
	}
			
	}
