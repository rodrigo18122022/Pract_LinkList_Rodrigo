
public class LinkListOrder<E extends Comparable<E>> extends LinkList<E>{
	private Node<E> h;
	public LinkListOrder() {
		this.h = getHead();
	}
	
	public void insert(E x) {
		if(h == null) {
			this.h = new Node<E>(x, this.h);
			return;
		}

		Node<E> aux = this.h;
		Node<E> nx = new Node<E>(x, null);
		while(aux.getNext() != null && aux.getNext().compareTo(nx) < 1) {
			aux = aux.getNext();
		}
		if(aux.getNext()!= null) {
			nx.setNext(aux.getNext());
			aux.setNext(nx);
		}
		else {
			aux.setNext(nx);
		}

		
		
	}
	
	public int search(E x) {
		int ind = 0;
		Node<E> aux = this.h;
		while(aux != null && !aux.getData().equals(x)) {
			if(aux.compareTo(new Node<E>(x, null)) == 1) {
				return -1;
			}
			aux = aux.getNext();
			ind++;
		}
		if(aux != null)
			return ind;
		else
			return -1;		
	}
	
	public String toString() {
		String str = "";
		Node<E> i = this.h;
		for (; i != null; i = i.getNext()) {
			str += i.toString() + ", ";
		}
		return str;
	}
}
