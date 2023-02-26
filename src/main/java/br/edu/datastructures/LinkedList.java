package br.edu.datastructures;

public class LinkedList<T> {
  public long length;
  private Node<T> entryNode;

  public LinkedList() {
    this.entryNode = null;
    this.length = 0;
  }

  public boolean isEmpty() {
    return this.length == 0;
  }

  public void add(T object) {
    final Node<T> newNode = new Node<>(object);

    if (isEmpty()) {
      this.entryNode = newNode;
      this.length++;

      return;
    }

    Node<T> aux = this.entryNode;
    
    for(int i = 0; i < (this.length - 1); i++) {
      aux = aux.getNextNode();
    }

    aux.setNextNode(newNode);
    this.length++;
    return;
  }

  private Node<T> getNode(long index) {
    if (index < 0 || index >= this.length)
      throw new IndexOutOfBoundsException(
          "Invalid index " + index + " to LinkedList with length " + this.length
      );

    Node<T> aux = this.entryNode;
    Node<T> returnNode = null;

    for(int i = 0; i <= index; i++) {
      returnNode = aux;
      aux = aux.getNextNode();
    }

    return returnNode;
  }

  public T get(long index) {
    if (index == 0)
      return this.entryNode.getObject();

    return getNode(index).getObject();
  }

  public T remove(long index) {
    Node<T> pivot = getNode(index);

    if (index == 0) {
      this.entryNode = this.entryNode.getNextNode();
      this.length--;
      return pivot.getObject();
    }

    Node<T> previousToPivot = getNode(index - 1);

    previousToPivot.setNextNode(pivot.getNextNode());
    this.length--;
    return pivot.getObject();
  }

  @Override
  public String toString() {
    String representation = "";

    Node<T> aux = this.entryNode;

    for(int i = 0; i < this.length; i++) {
      representation += "[Node {Object = " + aux.getObject() + " }]-->";

      aux = aux.getNextNode();
    }

    return representation += "null";
  }
}
