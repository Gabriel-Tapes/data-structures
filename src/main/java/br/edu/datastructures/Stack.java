package br.edu.datastructures;

public class Stack<T> {
  private Node<T> topNode = null;

  public boolean isEmpty() {
    return this.topNode == null;
  }

  public void push(T object) {
    final Node<T> newNode = new Node<>(object);
    newNode.setNextNode(this.topNode);

    this.topNode = newNode;
  }

  public T pop() {
    if(!this.isEmpty()) {
      final Node<T> aux = this.topNode;

      this.topNode = this.topNode.getNextNode();
      return aux.getObject();
    }
   
   return null;
  }

  public T top() {
    return this.topNode.getObject();
  }

  @Override
  public String toString() {
    String representation = "_____ Stack\n|";
    
    if(!isEmpty()){
      Node<T> currentNode = this.topNode;

      while(currentNode != null) {
        representation += "---> [" + currentNode + "]\n|";

        currentNode = currentNode.getNextNode();
      }
    }

    return representation + "---> null";
  }
}
