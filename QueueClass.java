import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {

	//main
	public static void main(String[] args) {
		
		//declare the linked list implementation of a queue
		Queue<Integer> numbers = new LinkedList<Integer>();
		
		//adds elements to the queue
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.add(60);
		numbers.add(70);
		numbers.add(80);
		
		System.out.println("Filled Queue: " + numbers);
		
		
		//accessing head of the queue
		int peekNum = numbers.peek();
		System.out.println("Head Element of Queue: " + peekNum);
		
		//removes head from the queue
		int removedNum = numbers.poll();
		System.out.println("Queue After Removal of Head Element: " + removedNum);
		
		//prints new queue
		System.out.println("Updated Queue " + numbers);
		
		//removal of a specific element
		numbers.remove(30);
		System.out.println("Queue After Removal of Specific Element: " + numbers);
		
		//gets the size of the queue
		int queueSize = numbers.size();
		System.out.println("Size of Current Queue: "+ queueSize);
		
	}
	
}
