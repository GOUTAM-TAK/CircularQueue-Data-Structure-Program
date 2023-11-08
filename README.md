# CircularQueue-Data-Structure-Program
Write a Circular Queue using array in Java which implements the following interface: 
public interface ICircularQueue {
// Add the given element at the REAR of the queue
// Returns false if queue is full otherwise true is returned
boolean add(String element);
// Remove element from the FRONT of the queue
// Returns null if the queue is empty
String remove();
// Returns the total number of elements stored in the queue
// Returns 0 if the queue is empty
int size();
// Returns comma separated elements from FRONT to REAR
 // Returns empty string if queue is empty
String toString();
}
Verify each functionality either in Main class or by writing Junit test cases.
Marks distribution: 
1. Basic structure of class 
2. Logic for isEmpty() and isFull() 
3. Implementation of add() 
4. Implementation of remove() 
5. Implementation of size() 
6. Implementation of toString() 
7. Main driver class or Junit .
