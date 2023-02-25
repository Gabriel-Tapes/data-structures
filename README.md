# Data Structures with java

This repository contains many implementations of data structures implemented with java.
I have made this repository to practice with Java and remember knowledge in data structures.

## What is data structures?

Programming Languages use many ways to storage data. The ways used for, is called "data structure". All programming languages have two ways to storage data in memory: primitive types and data structures. The primitive types, in general, are saved directly in memory, with a binary representation, so
they are numeric types in general.

In Java Language we have 8 primitive types: 
- byte
- char
- short
- int
- long 
- float
- double
- boolean
- void

On other hand, data structures are not saved directely, but by a reference. Instead of the value being saved directly, a memory address that points to the structure is saved. Data structures are the way to organize the primitive types or other data structures to optimize data writing, reading, sorting and etc. Depending on the situation a structure will be more used than others, which ones will be used must be defined by the developer in each case. The study of Data Structures is important to this, for the programmer to know when and why to use a given data structure.

## Main Data Structures

- [Arrays](https://www.geeksforgeeks.org/array-data-structure/)
- [Linked Lists](https://www.geeksforgeeks.org/data-structures/linked-list/)
- [Stacks](https://www.geeksforgeeks.org/stack-data-structure/)
- [Queues](https://www.geeksforgeeks.org/queue-data-structure/)
- [Hash Tables](https://www.educative.io/answers/what-is-a-hash-table)
- [Trees](https://www.geeksforgeeks.org/introduction-to-tree-data-structure-and-algorithm-tutorials/)
- [Heaps](https://www.geeksforgeeks.org/heap-data-structure/)
- [Graphs](https://www.geeksforgeeks.org/graph-data-structure-and-algorithms/)

## My Implementations

 <details>
  <summary>Node</summary>

  <p>
    <a href="./src/main/java/br/edu/datastructures/Node.java">Implementation</a>
  </p>
  <p>
    The Node is a simple data structure that stores a value or other data structure
    and one or more addresses to other Nodes. In this implementation the node points
    to just one other Node with same value type. This structure is a basis to others
    data structures.
  </p>
 </details>

 <details>
  <summary>Stack</summary>

  <p>
    <a href="./src/main/java/br/edu/datastructures/Queue.java">Implementation</a>
  </p>
  <p>
    The Stack is one of the main data structures. The stacks satisfy the rule LIFO
    i.e. Last In First Out. The last Node to be pushed must be the first one to
    be popped. The Class have 4 methods:
  </p>
    <ul>
      <li>
        <b>Push(T object)</b>
          <p>Push a Node with the T object at the top of stack</p>
      </li>
      <li>
        <b>Pop()</b>
          <p>Pop the Node at the top of stack</p>
      </li>
      <li>
        <b>isEmpty()</b>
          <p>Returns true if the stack is empty and false otherwise</p>
      </li>
      <li>
        <b>Top()</b>
          <p>Returns the object of the Node at the top of stack</p>
      </li>
    <ul>
 </details>
 <details>
  <summary>Queue</summary>

  <p>
    <a href="./src/main/java/br/edu/datastructures/Queue.java">Implementation</a>
  </p>
  <p>
    The Queue is one of the main data structures. The Queues satisfy the rule FIFO
    i.e. First In First Out. The first Node to be enqueued must be the first one to
    be dequeued. The Class have 4 methods:
  </p>
    <ul>
      <li>
        <b>Enqueue(T object)</b>
          <p>Enqueue a Node with the T object at the front of queue</p>
      </li>
      <li>
        <b>Dequeue()</b>
          <p>Dequeue the Node at the front of queue</p>
      </li>
      <li>
        <b>isEmpty()</b>
          <p>Returns true if the queue is empty and false otherwise</p>
      </li>
      <li>
        <b>firstNode()</b>
          <p>Returns the object of the Node at the front of queue</p>
      </li>
    <ul>
 </details>
