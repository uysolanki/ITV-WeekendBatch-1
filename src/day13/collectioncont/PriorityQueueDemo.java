package day13.collectioncont;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
	PriorityQueue<Integer> numbers=new PriorityQueue();  //min
	Iterator itr=numbers.iterator();
	numbers.add(10);
	numbers.add(20);
	numbers.add(15);
	numbers.add(18);
	
	System.out.println(numbers);			//[10,20,15,18]
	
	if(itr.hasNext())
	System.out.println(numbers.remove());   //10
	System.out.println(numbers);			//[20,15,18]
	System.out.println(numbers.isEmpty());	//false
	
	if(itr.hasNext())
	System.out.println(numbers.remove());	//15
	System.out.println(numbers);			//[20,18]
	System.out.println(numbers.isEmpty());  //false
	System.out.println(numbers.size());     //2
	
	if(itr.hasNext())
	System.out.println(numbers.remove());   //18
	System.out.println(numbers);            //[20]
	System.out.println(numbers.isEmpty());  //false
	System.out.println(numbers.size());     //1
	
	if(itr.hasNext())
	System.out.println(numbers.remove());   //20
	System.out.println(numbers);            //[]
	System.out.println(numbers.isEmpty());  //true
	System.out.println(numbers.size());     //0
	
	
	if(itr.hasNext())
	System.out.println(numbers.remove());
	else
		System.out.println("Queue is Empty");

	}

}
