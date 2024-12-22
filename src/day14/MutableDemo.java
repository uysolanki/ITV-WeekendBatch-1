package day14;

public class MutableDemo {

	public static void main(String[] args) {
		StringBuffer name1=new StringBuffer("Alice");
		System.out.println(name1);
		
		StringBuffer name2=name1.append(" Peter");
		System.out.println(name2);
		
		System.out.println(name1==name2);
		

	}

}
