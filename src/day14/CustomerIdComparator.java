package day14;

import java.util.Comparator;

public class CustomerIdComparator implements Comparator<Customer>
{

	@Override
	public int compare(Customer o1, Customer o2) {
		if(o1.getCustomerId() > o2.getCustomerId())
			return 1;
		else if(o1.getCustomerId() < o2.getCustomerId())
			return -1;
		else return 0;
	}

}
