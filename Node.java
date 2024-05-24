public class Node<T extends Comparable<T>> implements Comparable<Node<T>>{
	private T data;
	private Node<T> next;
	public Node(T data) {
		this(data, null);
	}
	public Node(T data, Node<T> next) {
		this.data = data;
		this.next = next;
	}
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
	@Override
	public String toString() {
		return this.data.toString();
	}
	@Override
	public int compareTo(Node<T> x) {
		if(this.data.compareTo(x.getData()) == 1) {
			return 1;
		}
		if(this.data.compareTo(x.getData()) == -1) {
			return -1;
		}
		return 0;
	}
}

