package br.edu.datastructures;

public class Queue<T> {
  private Node<T> entryNode;

  public Queue() {
    this.entryNode = null;
  }

  public void enqueue(T object) {
    final Node<T> newNode = new Node<>(object);
    newNode.setNextNode(this.entryNode);
    this.entryNode = newNode;
  }

  public T dequeue() {
    if (!this.isEmpty()) {
      Node<T> currentNode = this.entryNode;
      
      if (this.entryNode.getNextNode() == null) {
        this.entryNode = null;
        
        return currentNode.getObject();
      }

      Node<T> aux = this.entryNode;
      
      while(currentNode.getNextNode() != null) {
        aux = currentNode;
        currentNode = currentNode.getNextNode();
      }
      
      aux.setNextNode(null);
      return currentNode.getObject();
    }

    return null;
  }

  public T firstNode() {
    if(!this.isEmpty()) {
      Node<T> currentNode = this.entryNode;
      
      while(currentNode.getNextNode() != null) {
        currentNode = currentNode.getNextNode();
      }

      return currentNode.getObject();
    }

    return null;
  }

  public boolean isEmpty() {
    return this.entryNode == null;
  }

  @Override
  public String toString()  {
    String representationString = "";

    Node<T> aux = this.entryNode;
    
    if(this.entryNode != null) {
      while(aux != null) {
        representationString += "[" + aux + "]-->";
        aux = aux.getNextNode();
      }

      representationString += "null";
    } else {
      representationString = "null";
    }

    return representationString;
  }
}
