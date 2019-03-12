package Hashing;

public class Entry<T> {
	int key;
	T value;
	Entry Next;

	
	public Entry(int key,T value) { //Konstruktor
		this.key=key;
		this.value=value;
		Next=null;					
		
	}
	public Entry() {
		Next=null;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public Entry getNext() {
		return Next;
	}

	public void setNext(Entry next) {
		Next = next;
	}
	public T getValue() {
		
		return value;
	}
	
}
