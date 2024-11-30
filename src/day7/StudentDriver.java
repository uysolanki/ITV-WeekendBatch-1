package day7;

public class StudentDriver {

	public static void main(String[] args) {
		Student s1=new Student();  //No Args
		s1.displayStudent();						//Vedant  1 60.0
		s1.acceptStudent(); 	   //Virat 18 78.5
		s1.displayStudent();						//Virat 18 78.5
		
		
		Student s4=new Student("Hardik", 33, 88.5);  
		s4.displayStudent();     					//Hardik 33 88.5
		
		//clone
		
		Student s5=new Student(s4);
		s5.displayStudent();						//Hardik 33 88.5
		 

	}

}
