package day14;

import java.util.Set;
import java.util.TreeSet;

public class CustomerDriver {

	public static void main(String[] args) {
		Set<Customer> primeCustomers=new TreeSet(new CustomerIdComparator());  //compare by ID
		primeCustomers.add(new Customer(4,"Chris",23,5.11));
		primeCustomers.add(new Customer(2,"David",22,5.7));
		primeCustomers.add(new Customer(3,"Alice",27,5.3));
		primeCustomers.add(new Customer(1,"Ben",26,6.3));
		
		System.out.println(primeCustomers);
		
		
		Set<Customer> nonPrimeCustomers=new TreeSet(new CustomerNameComparator());  //compare by Name
		nonPrimeCustomers.add(new Customer(4,"Chris",23,5.11));
		nonPrimeCustomers.add(new Customer(2,"David",22,5.7));
		nonPrimeCustomers.add(new Customer(3,"Alice",27,5.3));
		nonPrimeCustomers.add(new Customer(1,"Ben",26,6.3));
		System.out.println();
		System.out.println(nonPrimeCustomers);
		
		Set<Customer> corporateCustomers=new TreeSet(new CustomerAgeComparator());  //compare by Age
		corporateCustomers.add(new Customer(4,"Chris",23,5.11));
		corporateCustomers.add(new Customer(2,"David",22,5.7));
		corporateCustomers.add(new Customer(3,"Alice",27,5.3));
		corporateCustomers.add(new Customer(1,"Ben",  26,6.3));
		System.out.println();
		System.out.println(corporateCustomers);

	}

}
