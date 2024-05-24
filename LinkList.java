public class LinkList<T extends Comparable<T>> implements ListIt<T> {
	private Node<T> head;
	public LinkList() {
		this.head = null;
	}
	public void insertFirst(T x) {
		this.head = new Node<T>(x, this.head);
	}
	
	public void insertLast(T x) {
		if(isEmpty()) {
			insertFirst(x);
			return;
		}

		Node<T> aux = this.head;
		while(aux.getNext() != null) {
			aux = aux.getNext();
		}
		aux.setNext(new Node<T>(x, null));
	}
	
	public int search(T x) {
		int ind = 0;
		Node<T> aux = this.head;
		while(aux != null && !aux.getData().equals(x)) {
			aux = aux.getNext();
			ind++;
		}
		if(aux != null)
			return ind;
		else
			return -1;		
	}
	
	public void remove(T x) {
		if(isEmpty())
			return;
		if(this.head.equals(x)) {
			this.head = this.head.getNext();
			return;
		}
		Node<T> aux = this.head;
		while (aux.getNext() != null )  {
			if (aux.getNext().getData().equals(x)) {
				aux.setNext(aux.getNext().getNext());
				return;
			}
			aux = aux.getNext(); 
		}
			
	}
	
	public boolean isEmpty() {
		return this.head == null;
	}
	@Override 
	public String toString() {
		String str = "";
		Node<T> i = this.head;
		for (; i != null; i = i.getNext()) {
			str += i.toString() + ", ";
		}
		return str;
	}
	
	public Node<T> getHead() {
		return this.head;
	}
	public void setHead(Node<T> x) {
		this.head = x;
	}
}

