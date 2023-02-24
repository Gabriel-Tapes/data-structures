package br.edu.datastructures;
public class Node<T> {
    T object;
    Node<T> nextNode;

    public T getObject() {
      return object;
    }

    public Node<T> getNextNode() {
      return this.nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
      this.nextNode = nextNode;
    }

    public Node(T object) {
        this.object = object;
        this.nextNode = null;
    }

    @Override
    public String toString() {
      return "Node {" + "Object = " + object + '}';
    }
}
