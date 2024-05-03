/** Program: DLL 
Written by: Brandon Gurley
Program Description: Functional DLL 
Challenges: N/A
Time Spent: 35 min
*/
public class Test {

	public static void main(String args[]) {
		
		
		DLL d = new DLL();
		
		DLL n = new DLL();
		
		System.out.println("Test with Strings");
		System.out.println("The list is empty: " + d.isEmpty());
		d.addFirst("cat");
		d.addFirst("rat");
		d.addFirst("fat");
		d.addFirst("sat");
		d.addFirst("mat");
		d.addFirst("tat");
		System.out.println("The last element is: " + d.last());
		d.removeLast();
		System.out.println("The last element is: " + d.last());
		d.removeFirst();
		d.addLast("dog");
		System.out.println("The size is: " + d.size());
		System.out.println("The list is empty: " +  d.isEmpty());
		System.out.println("The last element is: " + d.last());
		System.out.println("The first element is: " + d.first());
		
		System.out.println("Test with numbers");
		System.out.println("The list is empty: " + n.isEmpty());
		n.addFirst(1);
		n.addFirst(2);
		n.addFirst(3);
		n.addFirst(4);
		n.addFirst(5);
		n.addFirst(6);
		System.out.println("The last element is: " + n.last());
		n.removeLast();
		System.out.println("The last element is: " + n.last());
		n.removeFirst();
		n.addLast(7);
		System.out.println("The size is: " + n.size());
		System.out.println("The list is empty: " + n.isEmpty());
		System.out.println("The last element is: " + n.last());
	}
}