package day7;

public class EmployeeDriver {

	public static void main(String[] args) {
		Employee.displayHeadCount();
		
		Employee e1=new Employee(1,"Ravindra",800);  //headCount1
		
		Employee.displayHeadCount();
		
		Employee e2=new Employee(2,"Sakshi",900);	//headCount2
		
		e1.displayEmployee(); //1 Ravindra 800
		e2.displayEmployee(); //2 Sakshi 900

		Employee.displayHeadCount(); //2
		Employee.displayHeadCount(); //2
		
		Employee e3=new Employee(3,"Bhupendra",1000);
		Employee e4=new Employee(4,"Nikita",1100);
		
		Employee.displayHeadCount(); //4
		Employee.displayHeadCount(); //4
		Employee.displayHeadCount(); //4
		Employee.displayHeadCount(); //4
		
	}

}
